/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.converter;

import tiger.common.data.dataobject.account.AccountDO;
import tiger.common.data.enums.GenderEnum;
import tiger.common.util.BeanUtil;
import tiger.common.util.JsonConverterUtil;
import tiger.common.util.JsonUtil;
import tiger.common.util.StringUtil;
import tiger.core.domain.account.AccountDomain;
import tiger.core.domain.account.AccountSignUpDomain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Bongo on 16/3/8.
 */
public class AccountConvert {

    public static AccountDomain convert2Domain(AccountDO accountDO){
        if (accountDO == null){
            return null;
        }
        AccountDomain accountDomain = new AccountDomain();
        BeanUtil.copyPropertiesWithIgnores(accountDO,accountDomain);
        /*为什么domain中的gender要用枚举类型?*/
        accountDomain.setGender(GenderEnum.getEnumByCode(accountDO.getGender()));
        if (StringUtil.isNotBlank(accountDO.getExtParams())){
            /*自定义参数若不为空,则转换成String类型的HashMap对象*/
            accountDomain.setExtParams(JsonUtil.fromJson(accountDO.getExtParams(), HashMap.class));
        }
        return accountDomain;
    }

    public AccountDO convert2DO(AccountDomain accountDomain){
        if (accountDomain == null){
            return null;
        }
        AccountDO accountDo = new AccountDO();
        if (accountDomain.getGender()!=null){
            accountDo.setGender(accountDomain.getGender().toString());
        }
        if (accountDomain.getExtParams()!=null){
            accountDo.setExtParams(JsonConverterUtil.serialize(accountDomain.getExtParams()));
        }
        return accountDo;
    }

    public static List<AccountDomain> convert2Domain(List<AccountDO> accountDOs) {
        List<AccountDomain> accountDomains = new ArrayList<>();
        for (AccountDO accountDO : accountDOs) {
            accountDomains.add(convert2Domain(accountDO));
        }
        return accountDomains;
    }

    public static AccountDomain convertAccountSignUpDomainToAccountDomain(AccountSignUpDomain source) {
        if (null == source) {
            return null;
        }
        AccountDomain target = new AccountDomain();
        BeanUtil.copyPropertiesWithIgnores(source, target);
        return  target;
    }
}
