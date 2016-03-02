package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.environment.support.AirPollutionManager;
import tiger.common.data.dataobject.AirPollutionDO;
import tiger.core.base.BaseResult;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@RestController
public class AirPollutionController {

    @Autowired
    private AirPollutionManager airPollutionManager;

    @RequestMapping(value="/api/rawData/airPollutionData/list", method = RequestMethod.GET)
    public BaseResult getAirPollutionData()
    {
        List<AirPollutionDO> airPollutionDOList = airPollutionManager.getAirPollutionData();

        System.out.println(airPollutionDOList.get(0).getDischarge());

        return new BaseResult(airPollutionDOList);
    }

}
