package tiger.biz.environment.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.AirConditionDO;
import tiger.core.service.AirConditionService;

import java.util.List;
import tiger.core.service.WaterConditionService;
import tiger.common.data.dataobject.WaterConditionDO;

/**
 * Created by lisite on 16-3-1.
 */
@Service
public class WaterConditionManager {

    @Autowired
    private WaterConditionService waterConditionService;

    public List<WaterConditionDO> getWaterConditionData()
    {
        return waterConditionService.getWaterConditionData();
    }

}
