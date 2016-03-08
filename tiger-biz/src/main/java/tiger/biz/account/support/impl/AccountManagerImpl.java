/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.account.support.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import tiger.biz.account.support.AccountManager;
import tiger.biz.util.PasswordEncryptUtil;
import tiger.common.util.StringUtil;
import tiger.core.domain.account.AccountDomain;
import tiger.core.enums.ErrorCodeEnum;
import tiger.core.exception.AppException;
import tiger.core.service.account.AccountService;

/**
 * Created by Bongo on 16/3/8.
 */
@Service("accountManagerImpl")
public class AccountManagerImpl implements AccountManager{

    @Autowired
    @Qualifier("accountServiceImpl")
    AccountService accountService;

    @Override
    public AccountDomain signin(String account, String password) {
        AccountDomain accountDomain = accountService.readByAccount(account);
        if (accountDomain == null) {
            throw new AppException(ErrorCodeEnum.NOT_FOUND, "不存在的用户！");
        }
        if (!StringUtil.equals(account, accountDomain.getAccount())) {
            throw new AppException(ErrorCodeEnum.BIZ_FAIL, "用户名或密码错误！");
        }
        if (StringUtil.equals(accountDomain.getPassword(), PasswordEncryptUtil.getLoginPassword(password,
                account, PasswordEncryptUtil.SBIN))) {
            return accountDomain;
        } else {
            throw new AppException(ErrorCodeEnum.BIZ_FAIL, "用户名或密码错误！");
        }
    }

}
