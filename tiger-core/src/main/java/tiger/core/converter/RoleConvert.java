/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.converter;

import tiger.common.data.dataobject.account.RoleDO;
import tiger.common.data.enums.RoleEnum;
import tiger.core.domain.account.RoleDomain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bongo on 16/3/8.
 */
public class RoleConvert {

    public static RoleDomain convert2Domain(RoleDO source) {
        RoleDomain target = new RoleDomain();
        target.setId(source.getId());
        target.setName(RoleEnum.getEnumByCode(source.getName()));
        return target;
    }

    public static List<RoleDomain> convert2Domain(List<RoleDO> sourceList) {
        List<RoleDomain> targetList = new ArrayList<>();
        for (RoleDO source : sourceList) {
            RoleDomain target = convert2Domain(source);
            targetList.add(target);
        }
        return targetList;
    }

}
