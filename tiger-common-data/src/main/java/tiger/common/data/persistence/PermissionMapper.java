/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.persistence;

import org.apache.ibatis.annotations.Param;
import tiger.common.data.dataobject.account.PermissionDO;

import java.util.List;

/**
 * Created by Bongo on 16/3/8.
 */
public interface PermissionMapper {

    List<PermissionDO> findByRoleId(long roleId);


    List<PermissionDO> selectByRoleIds(@Param("ids") List<Long> roleIds);

}
