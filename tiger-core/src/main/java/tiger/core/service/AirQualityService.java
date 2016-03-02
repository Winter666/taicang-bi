package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.AirQualityDO;
import tiger.common.data.persistence.AirQualityMapper;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@Service
public class AirQualityService {

    @Autowired
    private AirQualityMapper airQualityMapper;

    public List<AirQualityDO> getAirQualityData()
    {
        return airQualityMapper.getAirQualityData();
    }
}
