package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.AirPollutionDO;
import tiger.common.data.persistence.AirPollutionMapper;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@Service
public class AirPollutionService {

    @Autowired
    private AirPollutionMapper airPollutionMapper;

    public List<AirPollutionDO> getAirPollutionData()
    {
        return airPollutionMapper.getAirPollutionData();
    }
}
