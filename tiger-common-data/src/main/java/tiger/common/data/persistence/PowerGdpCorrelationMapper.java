/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.persistence;

import tiger.common.data.dataobject.PowerGdpCorrelationDO;

import java.util.List;

/**
 * Created by Bongo on 16/3/1.
 */
public interface PowerGdpCorrelationMapper {

    /**
     * @return List<PowerGdpCorrelationDO>
     *     返回数据库power_total_forcast中所有数据
     * */
    List<PowerGdpCorrelationDO> getPowerGdpCorrelationDOList();
}
