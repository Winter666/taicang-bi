/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.persistence;

import tiger.common.data.dataobject.PowerGdpCorrelationDO;
import tiger.common.data.dataobject.PowerGdpCorrelationIndustryDO;

import java.util.List;

/**
 * Created by Bongo on 16/3/2.
 */
public interface PowerGdpCorrelationIndustryMapper {

    List<PowerGdpCorrelationIndustryDO> getPowerGdpCorrelationIndustryDOList();
    List<PowerGdpCorrelationIndustryDO> getPowerGdpCorrelationIndustrySoloDOList();

}
