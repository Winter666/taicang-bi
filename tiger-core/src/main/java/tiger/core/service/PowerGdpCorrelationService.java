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

/**
 * Created by Bongo on 16/3/1.
 */
@Service
public class PowerGdpCorrelationService {

    @Autowired
    private PowerGdpCorrelationMapper pgcm;

    public PowerGdpCorrelationDomain getOnePieceOfShit(){
        return PowerGdpCorrelationConverter.convert(pgcm.getOnePieceOfShit());
    }

}
