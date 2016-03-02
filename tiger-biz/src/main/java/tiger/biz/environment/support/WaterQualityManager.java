package tiger.biz.environment.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.WaterQualityDO;
import tiger.core.service.WaterQualityService;

import java.util.List;

/**
 * Created by lisite on 16-3-1.
 */
@Service
public class WaterQualityManager {

    @Autowired
    private WaterQualityService waterQualityService;

    public List<WaterQualityDO> getWaterQualityData()
    {
        return waterQualityService.getWaterQualityData();
    }

}
