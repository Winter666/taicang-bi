package tiger.web.controller.population;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.population.support.LaborGdpRelationPreManager;
import tiger.common.data.dataobject.LaborGdpRelationPreDO;
import tiger.core.base.BaseResult;

import java.util.List;

/**
 * Created by Kris Chan on 11:02 AM 3/2/16 .
 * All right reserved.
 */
@RestController
public class LaborGdpRelationController {
    @Autowired
    private LaborGdpRelationPreManager laborGdpRelationPreManager;

    @RequestMapping(value="/api/predictData/laborGdpRelationPreData/list", method = RequestMethod.GET)
    public BaseResult getPopulationStructurePreData()
    {
        List<LaborGdpRelationPreDO> laborGdpRelationPreDOList = laborGdpRelationPreManager.getLaborGdpRelationPreData();

        System.out.println(laborGdpRelationPreDOList.get(0).getPreyear());

        return new BaseResult(laborGdpRelationPreDOList);
    }



}
