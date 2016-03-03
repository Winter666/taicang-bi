/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.persistence.PowerGdpCorrelationEnterpriseAverageMapper;
import tiger.core.converter.PowerGdpCorrelationEnterpriseAverageConverter;
import tiger.core.domain.PowerGdpCorrelationEnterpriseAverageDomain;

import java.util.List;

/**
 * Created by Bongo on 16/3/4.
 */
@Service
public class PowerGdpCorrelationEnterpriseAverageService {

    @Autowired
    private PowerGdpCorrelationEnterpriseAverageMapper pgceam;

    public List<PowerGdpCorrelationEnterpriseAverageDomain> getPowerGdpCorrelationnterpriseAverageDomainList(){
        return PowerGdpCorrelationEnterpriseAverageConverter.convertByList(pgceam.getPowerGdpCorrelationEnterpriseAverageDOList());
    }

}
