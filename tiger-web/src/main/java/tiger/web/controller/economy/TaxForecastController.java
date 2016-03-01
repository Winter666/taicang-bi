package tiger.web.controller.economy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.core.base.BaseResult;
import tiger.common.data.dataobject.TaxForecastDO;
import java.util.List;
import tiger.biz.economy.support.TaxForecastManager;
/**
 * Created by xy86 on 16-2-28.
 */
@RestController
public class TaxForecastController {

    @Autowired
    private TaxForecastManager taxForecastManager;
    @RequestMapping(value="/api/predictData/taxForecastData/list", method = RequestMethod.GET)
    public BaseResult gettaxForecastData(){
        List<TaxForecastDO> taxForecastDOList= taxForecastManager.gettaxForecastData();
         return new BaseResult(taxForecastDOList);
    }
}
