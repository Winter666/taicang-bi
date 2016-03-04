/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.persistence.PowerGdpCorrelationEnterpriseAverageMapper;
import tiger.common.data.persistence.PowerGdpCorrelationEnterpriseSoloMapper;
import tiger.core.converter.PowerGdpCorrelationEnterpriseAverageConverter;
import tiger.core.converter.PowerGdpCorrelationEnterpriseSoloConverter;
import tiger.core.domain.PowerGdpCorrelationEnterpriseAverageDomain;
import tiger.core.domain.PowerGdpCorrelationEnterpriseSoloDomain;

import java.util.List;

/**
 * Created by Bongo on 16/3/4.
 */
@Service
public class PowerGdpCorrelationEnterpriseAverageService {

    @Autowired
    private PowerGdpCorrelationEnterpriseAverageMapper pgceam;

    @Autowired
    private PowerGdpCorrelationEnterpriseSoloMapper powerGdpCorrelationEnterpriseSoloMapper;

    public List<PowerGdpCorrelationEnterpriseAverageDomain> getPowerGdpCorrelationnterpriseAverageDomainList(){
        return PowerGdpCorrelationEnterpriseAverageConverter.convertByList(pgceam.getPowerGdpCorrelationEnterpriseAverageDOList());
    }

    public List<PowerGdpCorrelationEnterpriseSoloDomain> getPowerGdpCorrelationnterpriseSoloDomainList(){

        return PowerGdpCorrelationEnterpriseSoloConverter.convertByList(powerGdpCorrelationEnterpriseSoloMapper.getPowerGdpCorrelationEnterpriseSoloDOList());

    }

}
