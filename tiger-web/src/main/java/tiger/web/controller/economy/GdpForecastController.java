package tiger.web.controller.economy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.economy.support.GdpForecastManager;
import tiger.common.data.dataobject.GdpForecastDO;
import tiger.core.base.BaseResult;

import java.util.List;

/**
 * Created by Eason on 2016/2/28.
 */

@RestController
public class GdpForecastController {

    @Autowired
    private GdpForecastManager gdpForecastManager;

    @RequestMapping(value="/api/predictData/gdpForecastData/list", method = RequestMethod.GET)
    public BaseResult getGdpForecastData()
    {
        List<GdpForecastDO> gdpForecastDOList = gdpForecastManager.getGdpForecastData();

        System.out.println(gdpForecastDOList.get(0).getGdpRealValue());

        return new BaseResult(gdpForecastDOList);
    }


}
