package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.environment.support.WaterIndustryManager;
import tiger.common.data.dataobject.WaterIndustryDO;
import tiger.core.base.BaseResult;

import java.util.List;

/**
 * Created by lisite on 16-3-1.
 */
@RestController
public class WaterIndustryController {

    @Autowired
    private WaterIndustryManager waterIndustryManager;

    @RequestMapping(value="/api/rawData/waterIndustryData/list", method = RequestMethod.GET)
    public BaseResult getAirIndustryData()
    {
        List<WaterIndustryDO> waterIndustryDOList = waterIndustryManager.getWaterIndustryData();

//        System.out.println(waterIndustryDOList.get(0).getDischarge());

        return new BaseResult(waterIndustryDOList);
    }

}
