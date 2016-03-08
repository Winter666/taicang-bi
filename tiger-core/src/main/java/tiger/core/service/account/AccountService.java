/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.service.account;

import tiger.core.domain.account.AccountDomain;

/**
 * Created by Bongo on 16/3/8.
 */
public interface AccountService {

    /**
     * 通过id获取用户
     *
     * */
    AccountDomain read(Long accountId);

    /**
     * 通过手机获取用户
     *
     * */
    AccountDomain readByAccount(String account);

//    /**
//     * 删除用户登录token
//     *
//     * */
//    Boolean deleteLoginToken(Long accountId, String loginToken);

//    /**
//     * 修改密码
//     *
//     * */
//    Boolean resetPasswordById(Long accountId, String newPassword);
//
//    /**
//     * 新增用户
//     *
//     * */
//    AccountDomain addAccount(AccountDomain domain);
//
//    /**
//     * 删除一个用户
//     *
//     * */
//    void delete(long id);

}
