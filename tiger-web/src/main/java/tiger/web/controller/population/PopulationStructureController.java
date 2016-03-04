package tiger.web.controller.population;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tiger.biz.population.PopulationStructurePreManager;
import tiger.common.data.dataobject.BirthrateDO;
import tiger.common.data.dataobject.PopulationStructurePreDO;
import tiger.core.base.BaseResult;

import java.util.List;

@RestController
public class PopulationStructureController {

	 @Autowired
	    private PopulationStructurePreManager populationStructurePreManager;

	    @RequestMapping(value="/api/predictData/populationStructurePreData/list", method = RequestMethod.GET)
	    public BaseResult getPopulationStructurePreData()
	    {
	        List<PopulationStructurePreDO> populationStructurePreDOList = populationStructurePreManager.getPopulationStructurePreData();

	        System.out.println(populationStructurePreDOList.get(0).getSexType_id());

	        return new BaseResult(populationStructurePreDOList);
	    }
	    
	    
	    @Autowired
	    private PopulationStructurePreManager birthrateManager;

	    @RequestMapping(value="/api/predictData/birthrateData/list", method = RequestMethod.GET)
	    public BaseResult getBirthrateData()
	    {
	        List<BirthrateDO> birthrateDOList = birthrateManager.getBirthrateData();

	        System.out.println(birthrateDOList.get(0).getPopulation());

	        return new BaseResult(birthrateDOList);
	    }
}
