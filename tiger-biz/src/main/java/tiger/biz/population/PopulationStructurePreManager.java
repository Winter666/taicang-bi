package tiger.biz.population;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tiger.common.data.dataobject.PopulationStructurePreDO;
import tiger.core.service.population.PopulationStructurePreService;
import tiger.common.data.dataobject.BirthrateDO;


import java.util.List;


@Service
public class PopulationStructurePreManager {

	@Autowired
    private PopulationStructurePreService populationStructurePreService;
	
	public List<PopulationStructurePreDO> getPopulationStructurePreData()
    {
       return populationStructurePreService.getPopulationStructurePreData();
    }
	
	@Autowired
    private PopulationStructurePreService birthrateService;
	
	public List<BirthrateDO> getBirthrateData()
    {
       return birthrateService.getBirthrateData();
    }
}
