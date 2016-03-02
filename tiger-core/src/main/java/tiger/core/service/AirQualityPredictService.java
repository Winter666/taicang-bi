package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.AirQualityPredictDO;
import tiger.common.data.persistence.AirQualityPredictMapper;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@Service
public class AirQualityPredictService {

    @Autowired
    private AirQualityPredictMapper airQualityPredictMapper;

    public List<AirQualityPredictDO> getAirQualityPredictData()
    {
        return airQualityPredictMapper.getAirQualityPredictData();
    }
}
