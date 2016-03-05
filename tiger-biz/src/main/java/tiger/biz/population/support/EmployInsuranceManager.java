package tiger.biz.population.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.PopulationEmployInsuranceDO;
import tiger.common.data.dataobject.PopulationSchoolDO;
import tiger.core.service.population.EmployInsuranceServices;

import java.util.List;

/**
 * Created by Eason on 2016/3/5.
 */
@Service
public class EmployInsuranceManager {

    @Autowired
    private EmployInsuranceServices employInsuranceServices;

    public List<PopulationEmployInsuranceDO> getEmployInsuranceList()
    {
        return employInsuranceServices.getEmployInsuranceList();
    }

    public List<PopulationSchoolDO> getSchoolList()
    {
        return employInsuranceServices.getSchoolList();
    }

}
