package tiger.biz.environment.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.AirQualityPredictDO;
import tiger.core.service.AirQualityPredictService;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@Service
public class AirQualityPredictManager {

    @Autowired
    private AirQualityPredictService airQualityPredictService;

    public List<AirQualityPredictDO> getAirQualityPredictData()
    {
        return airQualityPredictService.getAirQualityPredictData();
    }

}
