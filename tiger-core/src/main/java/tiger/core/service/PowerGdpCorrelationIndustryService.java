/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.persistence.PowerGdpCorrelationIndustryMapper;
import tiger.core.converter.PowerGdpCorrelationIndustryConverter;
import tiger.core.converter.PowerGdpCorrelationIndustrySoloConverter;
import tiger.core.domain.PowerGdpCorrelationIndustryDomain;
import tiger.core.domain.PowerGdpCorrelationIndustrySoloDomain;

import java.util.List;

/**
 * Created by Bongo on 16/3/2.
 */
@Service
public class PowerGdpCorrelationIndustryService {

    @Autowired
    private PowerGdpCorrelationIndustryMapper pgcim;

    public List<PowerGdpCorrelationIndustryDomain> getPowerGdpCorrelationIndustryDomainList(){
        return PowerGdpCorrelationIndustryConverter.convertByList(pgcim.getPowerGdpCorrelationIndustryDOList());
    }

    public List<PowerGdpCorrelationIndustrySoloDomain> getPowerGdpCorrelationIndustrySoloDomainList(){

        return PowerGdpCorrelationIndustrySoloConverter.convertByList(pgcim.getPowerGdpCorrelationIndustrySoloDOList());

    }

    /*
   * main for test
   * how to write????????
   * */

}
