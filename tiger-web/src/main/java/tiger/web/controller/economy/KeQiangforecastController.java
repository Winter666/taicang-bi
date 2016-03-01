package tiger.web.controller.economy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.common.data.dataobject.KeQiangDO;
import tiger.core.base.BaseResult;
import tiger.biz.economy.support.KeQiangForecastManager;
import java.util.List;

/**
 * Created by xy86 on 16-2-29.
 */
@RestController
public class KeQiangforecastController {
    @Autowired
    private KeQiangForecastManager keQiangForecastManager;
    @RequestMapping(value="/api/predictData/keqiangForecastData/list", method = RequestMethod.GET)
    public BaseResult getkeqiangForecastData(){
        List<KeQiangDO> keqiangForecastDOList=keQiangForecastManager.getkeqiangForecastData();
        return new BaseResult(keqiangForecastDOList);
    }

}
