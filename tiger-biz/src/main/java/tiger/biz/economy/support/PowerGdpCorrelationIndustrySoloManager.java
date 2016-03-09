/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.CurrentDateElement;
import tiger.core.domain.PowerGdpCorrelationIndustrySoloDomain;
import tiger.core.service.PowerGdpCorrelationIndustryService;

import java.util.*;

/**
 * Created by Bongo on 16/3/3.
 */
public interface PowerGdpCorrelationIndustrySoloManager {

    /**
     * @return Map key:industryId value:[0]:season=0所有年份数据的两个数组 [1]map:key:year value:四个季度的数据
     * */
    Map<Integer,List> getPowerGdpCorrelationIndustrySoloDomainMap();

    List<PowerGdpCorrelationIndustrySoloDomain> getPowerGdpCorrelationIndustrySoloDomainList();

}
