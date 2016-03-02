package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.GdpForecastDO;
import tiger.common.data.persistence.GdpForecastMapper;

import java.util.List;
import tiger.common.data.dataobject.AirConditionDO;
import tiger.common.data.persistence.AirConditionMapper;

/**
 * Created by lisite on 16-2-29.
 */
@Service
public class AirConditionService {

    @Autowired
    private AirConditionMapper airConditionMapper;

    public List<AirConditionDO> getAirConditionData()
    {
        return airConditionMapper.getAirConditionData();
    }
}
