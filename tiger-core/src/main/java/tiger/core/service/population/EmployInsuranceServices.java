package tiger.core.service.population;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.PopulationEmployInsuranceDO;
import tiger.common.data.dataobject.PopulationSchoolDO;
import tiger.common.data.persistence.EmployInsuranceMapper;
import tiger.common.data.persistence.SchoolPredictionMapper;

import java.util.List;

/**
 * Created by Eason on 2016/3/5.
 */
@Service
public class EmployInsuranceServices {

    @Autowired
    private EmployInsuranceMapper employInsuranceMapper;

    @Autowired
    private SchoolPredictionMapper schoolPredictionMapper;

    public List<PopulationEmployInsuranceDO> getEmployInsuranceList()
    {
        return employInsuranceMapper.getEmployInsuranceList();
    }

    public List<PopulationSchoolDO> getSchoolList()
    {
        return schoolPredictionMapper.getSchoolList();
    }

}
