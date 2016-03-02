package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.environment.support.AirConditionManager;
import tiger.common.data.dataobject.AirConditionDO;
import tiger.core.base.BaseResult;

import java.util.List;
import tiger.biz.environment.support.WaterConditionManager;
import tiger.common.data.dataobject.WaterConditionDO;
/**
 * Created by lisite on 16-3-1.
 */
@RestController
public class WaterConditionController {

    @Autowired
    private WaterConditionManager waterConditionManager;

    @RequestMapping(value="/api/rawData/waterConditionData/list", method = RequestMethod.GET)
    public BaseResult getAirConditionData()
    {
        List<WaterConditionDO> waterConditionDOList = waterConditionManager.getWaterConditionData();

//        System.out.println(waterConditionDOList.get(0).getWaterLevelDown());

        return new BaseResult(waterConditionDOList);
    }

}
