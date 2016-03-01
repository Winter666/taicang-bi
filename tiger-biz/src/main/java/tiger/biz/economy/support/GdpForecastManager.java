package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.GdpForecastDO;
import tiger.core.service.GdpForecastService;

import java.util.List;

/**
 * Created by Eason on 2016/2/28.
 */
@Service
public class GdpForecastManager {

    @Autowired
    private GdpForecastService gdpForecastService;

    public List<GdpForecastDO> getGdpForecastData()
    {
       return gdpForecastService.getGdpForecastData();
    }

}
