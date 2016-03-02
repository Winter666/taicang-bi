package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.environment.support.WaterQualityManager;
import tiger.common.data.dataobject.WaterQualityDO;
import tiger.core.base.BaseResult;

import java.util.List;

/**
 * Created by lisite on 16-3-1.
 */
@RestController
public class WaterQualityController {

    @Autowired
    private WaterQualityManager waterQualityManager;

    @RequestMapping(value="/api/rawData/waterQualityData/list", method = RequestMethod.GET)
    public BaseResult getAirQualityData()
    {
        List<WaterQualityDO> waterQualityDOList = waterQualityManager.getWaterQualityData();

//        System.out.println(waterQualityDOList.get(0).getKmno4());

        return new BaseResult(waterQualityDOList);
    }

}
