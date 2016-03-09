/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.core.domain.PowerGdpCorrelationIndustryDomain;
import tiger.core.service.PowerGdpCorrelationIndustryService;

import java.util.*;

/**
 * Created by Bongo on 16/3/2.
 */
public interface PowerGdpCorrelationIndustryManager {

    /**
     * @return HashMap key:year value:List<double[]>(contains gdp and power rate arrays)
     * */
    Map<Integer,List<double[]>> getPowerGdpCorrelationIndustryMap();

}
