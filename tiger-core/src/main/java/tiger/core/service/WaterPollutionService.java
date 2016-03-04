package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.WaterPollutionDO;
import tiger.common.data.persistence.WaterPollutionMapper;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@Service
public class WaterPollutionService {

    @Autowired
    private WaterPollutionMapper waterPollutionMapper;

    public List<WaterPollutionDO> getWaterPollutionData()
    {
        return waterPollutionMapper.getWaterPollutionData();
    }

    public List<WaterPollutionDO> getWaterPollutionDataForMap(){
        return waterPollutionMapper.getWaterPollutionDataForMap();
    }
}
