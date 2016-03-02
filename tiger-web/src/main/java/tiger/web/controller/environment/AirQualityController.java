package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.environment.support.AirQualityManager;
import tiger.common.data.dataobject.AirQualityDO;
import tiger.core.base.BaseResult;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@RestController
public class AirQualityController {

    @Autowired
    private AirQualityManager airQualityManager;

    @RequestMapping(value="/api/rawData/airQualityData/list", method = RequestMethod.GET)
    public BaseResult getAirQualityData()
    {
        List<AirQualityDO> airQualityDOList = airQualityManager.getAirQualityData();

        System.out.println(airQualityDOList.get(0).getAqi());

        return new BaseResult(airQualityDOList);
    }

}
