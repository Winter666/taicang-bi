/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.CurrentDateElement;
import tiger.core.domain.PowerGdpCorrelationEnterpriseSoloDomain;
import tiger.core.service.PowerGdpCorrelationEnterpriseAverageService;

import java.util.*;

/**
 * Created by Bongo on 16/3/4.
 */
public interface PowerGdpCorrelationEnterpriseSoloManager {

    /**
     * @return Map key:industryId value:[0]:season=0所有年份数据的两个数组 [1]map:key:year value:四个季度的数据
     * */
    Map<Integer,List> getPowerGdpCorrelationIndustrySoloDomainMap();

    /**
     * @return PowerGdpCorrelationDomainList
     * */
    List<PowerGdpCorrelationEnterpriseSoloDomain> getPowerGdpCorrelationEnterpriseSoloDomainList();

}
