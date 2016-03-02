/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.core.domain.PowerGdpCorrelationDomain;
import tiger.core.domain.PowerGdpCorrelationIndustryDomain;
import tiger.core.service.PowerGdpCorrelationIndustryService;

import java.util.List;

/**
 * Created by Bongo on 16/3/2.
 */
@Service
public class PowerGdpCorrelationIndustryManager {

    @Autowired
    PowerGdpCorrelationIndustryService pgcis;
    /**
     * @return PowerGdpCorrelationDomainList
     * */
    public List<PowerGdpCorrelationIndustryDomain> getPowerGdpCorrelationIndustryDomainList(){
        return pgcis.getPowerGdpCorrelationIndustryDomainList();
    }

}
