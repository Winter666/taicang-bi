/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.web.controller.economy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.economy.support.PowerGdpCorrelationManager;
import tiger.core.base.BaseResult;
import tiger.core.domain.PowerGdpCorrelationDomain;

import java.util.List;

/**
 * Created by Bongo on 16/3/1.
 */
@RestController
public class PowerGdpCorrelationController {

    @Autowired
    PowerGdpCorrelationManager pgcm;

    /**
     * 工业用电量与经济发展关联分析 图一
     * */
    @RequestMapping(value="/api/predictData/powerGdpCorrelationData/list", method = RequestMethod.GET)
    public BaseResult getOnePieceOfShit()
    {
        List<double[]> pgcd = pgcm.getPowerGdpArray();

        return new BaseResult(pgcd);

    }


}
