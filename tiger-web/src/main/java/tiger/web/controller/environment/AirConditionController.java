package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tiger.core.base.BaseResult;

import java.util.List;
import tiger.biz.environment.support.AirConditionManager;
import tiger.common.data.dataobject.AirConditionDO;

/**
 * Created by lisite on 16-2-29.
 */
@RestController
public class AirConditionController {

    @Autowired
    private AirConditionManager airConditionManager;

    @RequestMapping(value="/api/rawData/airConditionData/list", method = RequestMethod.GET)
    public BaseResult getAirConditionData()
    {
        List<AirConditionDO> airConditionDOList = airConditionManager.getAirConditionData();

//        System.out.println(airConditionDOList.get(0).getFlowDirection());

        return new BaseResult(airConditionDOList);
    }

}
