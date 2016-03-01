/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.core.domain.PowerGdpCorrelationDomain;
import tiger.core.service.PowerGdpCorrelationService;

import java.util.List;

/**
 * Created by Bongo on 16/3/1.
 */
@Service
public class PowerGdpCorrelationManager {

    @Autowired
    PowerGdpCorrelationService pgcs;

    /*
    * .
    * ..
    * ...
    * .....
    * */

    /**
     * @return PowerGdpCorrelationDomain
     * */
    public List<PowerGdpCorrelationDomain> getPowerGdpCorrelationDomainList(){
        return pgcs.getPowerGdpCorrelationDomainList();
    }

}
