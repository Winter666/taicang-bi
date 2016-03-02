package tiger.biz.population.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.LaborGdpRelationPreDO;
import tiger.core.service.population.LaborGdpRelationPreService;

import java.util.List;

/**
 * Created by Kris Chan on 11:06 AM 3/2/16 .
 * All right reserved.
 */
@Service

public class LaborGdpRelationPreManager {
    @Autowired
    private LaborGdpRelationPreService laborGdpRelationPreService;

    public List<LaborGdpRelationPreDO> getLaborGdpRelationPreData()
    {
        return laborGdpRelationPreService.getLaborGdpRelationPreData();


    }

}
