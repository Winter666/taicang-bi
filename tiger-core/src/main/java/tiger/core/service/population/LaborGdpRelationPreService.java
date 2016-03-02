package tiger.core.service.population;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.LaborGdpRelationPreDO;
import tiger.common.data.persistence.LaborGdpRelationPreMapper;

import java.util.List;

/**
 * Created by Kris Chan on 11:11 AM 3/2/16 .
 * All right reserved.
 */
@Service
public class LaborGdpRelationPreService {
    @Autowired
    private LaborGdpRelationPreMapper laborGdpRelationPreMapper;

    public List<LaborGdpRelationPreDO> getLaborGdpRelationPreData()
    {
        return laborGdpRelationPreMapper.getLaborGdpRelationPreData();
    }

}
