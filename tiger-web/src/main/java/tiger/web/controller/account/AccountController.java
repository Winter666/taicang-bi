/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.web.controller.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;
import tiger.biz.account.support.AccountManager;
import tiger.common.util.StringUtil;
import tiger.core.base.BaseResult;
import tiger.core.domain.account.AccountDomain;
import tiger.core.enums.ErrorCodeEnum;
import tiger.web.constants.APIConstants;
import tiger.web.controller.BaseController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Bongo on 16/3/9.
 */
@RestController
@RequestMapping("/api/account")
public class AccountController extends BaseController{

    @Autowired
    @Qualifier("accountManagerImpl")
    AccountManager accountManager;

    /**
     * 用户登录接口
     *
     * */
    @RequestMapping(value = "/authentication", method = RequestMethod.POST)
    public BaseResult<AccountDomain> login(@RequestHeader(APIConstants.HEADER_USERNAME) String account,
                                           @RequestHeader(APIConstants.HEADER_PASSWORD) String password,
                                           @RequestHeader(APIConstants.HEADER_USER_AGENT) String userAgent,
                                           @RequestParam(value = APIConstants.PARAM_EXPIRE_DAY, required = false, defaultValue = APIConstants.TOKEN_DEFAULT_EXPIRE_DAY) int expireDay,
                                           HttpServletRequest request,
                                           HttpServletResponse response){
        if (StringUtil.isBlank(account) || StringUtil.isBlank(password)) {
            return new BaseResult<>(ErrorCodeEnum.PARAMETERS_IS_NULL);
        }
        AccountDomain accountDomain = accountManager.signin(account, password);
        return new BaseResult<>(accountDomain);
    }

}
