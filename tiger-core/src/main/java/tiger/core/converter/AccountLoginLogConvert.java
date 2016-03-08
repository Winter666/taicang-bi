/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.converter;

import tiger.common.data.dataobject.account.AccountLoginLogDO;
import tiger.common.util.BeanUtil;
import tiger.core.domain.account.AccountLoginLogDomain;

import java.sql.Timestamp;

/**
 * Created by Bongo on 16/3/8.
 */
public class AccountLoginLogConvert {

    private AccountLoginLogConvert(){}

    public static AccountLoginLogDO convert2DO(AccountLoginLogDomain source){

        if(null == source){
            return null;
        }
        AccountLoginLogDO target = new AccountLoginLogDO();
        BeanUtil.copyPropertiesWithIgnores(source,target);

        target.setExpireTime(new Timestamp(source.getExpireTime().getTime()));
        return target;
    }

}
