/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.account.support;

import tiger.core.domain.account.AccountDomain;
import tiger.core.domain.account.AccountLoginLogDomain;

/**
 * Created by Bongo on 16/3/8.
 */
public interface AccountManager {

    /**
     * 用户登录接口
     *
     * @param account
     * @param password
     * @return
     * */
    AccountDomain signin(String account,String password);

//    /**
//     * 通过token获取账户信息
//     *
//     * @param token
//     * @return
//     * */
//    AccountDomain signinByToken(String token);
//
//    /**
//     * 为登录用户创建一个n天后过期的token
//     *
//     * @param accountLoginLogDomain
//     * @param expireDay
//     * @return
//     * */
//    String createToken(AccountLoginLogDomain accountLoginLogDomain,int expireDay);

}
