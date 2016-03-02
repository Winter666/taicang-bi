package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.environment.support.WaterPollutionManager;
import tiger.common.data.dataobject.WaterPollutionDO;
import tiger.core.base.BaseResult;

import java.util.List;

/**
 * Created by lisite on 16-3-1.
 */
@RestController
public class WaterPollutionController {

    @Autowired
    private WaterPollutionManager waterPollutionManager;

    @RequestMapping(value="/api/rawData/waterPollutionData/list", method = RequestMethod.GET)
    public BaseResult getAirPollutionData()
    {
        List<WaterPollutionDO> waterPollutionDOList = waterPollutionManager.getWaterPollutionData();

//        System.out.println(waterPollutionDOList.get(0).getCod());

        return new BaseResult(waterPollutionDOList);
    }

}
