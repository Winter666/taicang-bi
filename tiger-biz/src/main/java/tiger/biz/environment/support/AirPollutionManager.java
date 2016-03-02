package tiger.biz.environment.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.AirPollutionDO;
import tiger.core.service.AirPollutionService;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@Service
public class AirPollutionManager {

    @Autowired
    private AirPollutionService airPollutionService;

    public List<AirPollutionDO> getAirPollutionData()
    {
        return airPollutionService.getAirPollutionData();
    }

}
