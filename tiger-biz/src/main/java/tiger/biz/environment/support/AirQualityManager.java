package tiger.biz.environment.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.AirQualityDO;
import tiger.core.service.AirQualityService;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@Service
public class AirQualityManager {

    @Autowired
    private AirQualityService airQualityService;

    public List<AirQualityDO> getAirQualityData()
    {
        return airQualityService.getAirQualityData();
    }

}
