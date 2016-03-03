/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.web.controller.economy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.economy.support.PowerGdpCorrelationIndustryManager;
import tiger.biz.economy.support.PowerGdpCorrelationIndustrySoloManager;
import tiger.biz.economy.support.PowerGdpCorrelationManager;
import tiger.core.base.BaseResult;
import tiger.core.domain.PowerGdpCorrelationDomain;
import tiger.core.domain.PowerGdpCorrelationIndustrySoloDomain;

import java.util.List;
import java.util.Map;

/**
 * Created by Bongo on 16/3/1.
 */
@RestController
public class PowerGdpCorrelationController {

    @Autowired
    PowerGdpCorrelationManager pgcm;

    @Autowired
    PowerGdpCorrelationIndustryManager powerGdpCorrelationIndustryManager;

    @Autowired
    PowerGdpCorrelationIndustrySoloManager powerGdpCorrelationIndustrySoloManager;

    /**
     * 工业用电量与经济发展关联分析 图一
     * */
    @RequestMapping(value="/api/predictData/powerGdpCorrelationData/list", method = RequestMethod.GET)
    public BaseResult getOnePieceOfShit()
    {
        List<double[]> pgcd = pgcm.getPowerGdpArray();

        return new BaseResult(pgcd);

    }

    @RequestMapping(value = "/api/predictData/powerGdpCorrelationIndustryData/list",method = RequestMethod.GET)
    public BaseResult getIndustryMap(){

        Map<Integer,List<double[]>> map =powerGdpCorrelationIndustryManager.getPowerGdpCorrelationIndustryMap();

        return new BaseResult(map);

    }

    @RequestMapping(value = "/api/predictData/powerGdpCorrelationIndustrySoloData/list",method = RequestMethod.GET)
    public BaseResult getIndustrySoloMap(){

       Map map = powerGdpCorrelationIndustrySoloManager.getPowerGdpCorrelationIndustrySoloDomainMap();

        return new BaseResult(map);

    }


}
