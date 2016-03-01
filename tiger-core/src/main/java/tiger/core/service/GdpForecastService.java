package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.GdpForecastDO;
import tiger.common.data.persistence.GdpForecastMapper;

import java.util.List;

/**
 * Created by Eason on 2016/2/28.
 */
@Service
public class GdpForecastService {

    @Autowired
    private GdpForecastMapper gdpForecastMapper;

    public List<GdpForecastDO> getGdpForecastData()
    {
        return gdpForecastMapper.getGdpForecastData();
    }
}
