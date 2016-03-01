package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.GdpForecastDO;
import tiger.common.data.dataobject.TaxForecastDO;
import tiger.core.service.TaxForecastService;

import java.util.List;

/**
 * Created by xy86 on 16-2-28.
 */


@Service
public class TaxForecastManager {
    @Autowired
    private TaxForecastService taxForecastService;

    public List<TaxForecastDO> gettaxForecastData()
    {
        return taxForecastService.gettaxForecastData();
    }
}
