package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.environment.support.AirQualityPredictManager;
import tiger.common.data.dataobject.AirQualityPredictDO;
import tiger.core.base.BaseResult;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@RestController
public class AirQualityPredictController {

    @Autowired
    private AirQualityPredictManager airQualityPredictManager;

    @RequestMapping(value="/api/predictData/airQualityPredictData/list", method = RequestMethod.GET)
    public BaseResult getAirQualityPredictData()
    {
        List<AirQualityPredictDO> airQualityPredictDOList = airQualityPredictManager.getAirQualityPredictData();

//        System.out.println(airQualityPredictDOList.get(0).getPredictairQuality());

        return new BaseResult(airQualityPredictDOList);
    }

}
