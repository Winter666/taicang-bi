/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.persistence.PowerGdpCorrelationMapper;
import tiger.core.converter.PowerGdpCorrelationConverter;
import tiger.core.domain.PowerGdpCorrelationDomain;

import java.util.List;

/**
 * Created by Bongo on 16/3/1.
 */
@Service
public class PowerGdpCorrelationService {

    @Autowired
    private PowerGdpCorrelationMapper pgcm;

    public List<PowerGdpCorrelationDomain> getPowerGdpCorrelationDomainList(){
        return PowerGdpCorrelationConverter.convertByList(pgcm.getPowerGdpCorrelationDOList());
    }

}
