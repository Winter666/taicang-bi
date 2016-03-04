package tiger.biz.environment.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.WaterPollutionDO;
import tiger.core.service.WaterPollutionService;

import java.util.List;

/**
 * Created by lisite on 16-3-1.
 */
@Service
public class WaterPollutionManager {

    @Autowired
    private WaterPollutionService waterPollutionService;

    public List<WaterPollutionDO> getWaterPollutionData()
    {
        return waterPollutionService.getWaterPollutionData();
    }

    public List<WaterPollutionDO> getWaterPollutionDataForMap(){
        return waterPollutionService.getWaterPollutionDataForMap();
    }

}
