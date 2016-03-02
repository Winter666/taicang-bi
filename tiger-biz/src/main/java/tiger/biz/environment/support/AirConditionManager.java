package tiger.biz.environment.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.GdpForecastDO;
import tiger.core.service.GdpForecastService;

import java.util.List;
import tiger.core.service.AirConditionService;
import tiger.common.data.dataobject.AirConditionDO;

/**
 * Created by lisite on 16-2-29.
 */
@Service
public class AirConditionManager {

    @Autowired
    private AirConditionService airConditionService;

    public List<AirConditionDO> getAirConditionData()
    {
        return airConditionService.getAirConditionData();
    }

}
