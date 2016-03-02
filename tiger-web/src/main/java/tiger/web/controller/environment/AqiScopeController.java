package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.core.base.BaseResult;

import java.util.List;

import tiger.biz.environment.support.AqiScopeManager;
import tiger.common.data.dataobject.AqiScopeDO;
/**
 * Created by lisite on 16-2-29.
 */
@RestController
public class AqiScopeController {

    @Autowired
    private AqiScopeManager aqiScopeManager;

    @RequestMapping(value="/api/rawData/aqiScopeData/list", method = RequestMethod.GET)
    public BaseResult getAqiScopeData()
    {
        List<AqiScopeDO> aqiScopeDOList = aqiScopeManager.getAqiScopeData();

//        System.out.println(airScopeDOList.get(0).getAirQualityLevel());

        return new BaseResult(aqiScopeDOList);
    }

}
