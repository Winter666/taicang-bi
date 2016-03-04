package tiger.core.service.population;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tiger.common.data.dataobject.BirthrateDO;
import tiger.common.data.dataobject.PopulationStructurePreDO;
import tiger.common.data.persistence.PopulationStructurePreMapper;
import tiger.common.data.persistence.BirthrateMapper;


import java.util.List;

@Service
public class PopulationStructurePreService {

	@Autowired
    private PopulationStructurePreMapper populationStructurePreMapper;

    public List<PopulationStructurePreDO> getPopulationStructurePreData()
    {
        return populationStructurePreMapper.getPopulationStructurePreData();
    }
    
    @Autowired
    private BirthrateMapper birthrateMapper;

    public List<BirthrateDO> getBirthrateData()
    {
        return birthrateMapper.getBirthrateData();
    }
}
