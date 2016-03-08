/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.persistence;

import tiger.common.data.dataobject.account.SystemParamsDO;

/**
 * Created by Bongo on 16/3/8.
 */
public interface SystemParamsMapper {

    int deleteByPrimaryKey(Long id);

    int insert(SystemParamsDO record);

    SystemParamsDO selectByPrimaryKey(Long id);

    int updateByPrimaryKey(SystemParamsDO record);

}
