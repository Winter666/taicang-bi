/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.persistence.account;

import org.apache.ibatis.annotations.Param;
import tiger.common.data.dataobject.account.RoleDO;

import java.util.List;

/**
 * Created by Bongo on 16/3/8.
 */
public interface RoleMapper {

    List<RoleDO> findByAccountId(@Param("accountId") long accountId);

}
