package tiger.web.controller.population;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.population.support.EmployInsuranceManager;
import tiger.common.data.dataobject.PopulationEmployInsuranceDO;
import tiger.common.data.dataobject.PopulationSchoolDO;
import tiger.core.base.BaseResult;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Eason on 2016/3/5.
 */
@RestController
public class EmployInsuranceController {

    @Autowired
    private EmployInsuranceManager employInsuranceManager;

    @RequestMapping(value="/api/predictData/populationEmployInsuranceData/list", method = RequestMethod.GET)
    public BaseResult getEmployInsuranceList()
    {
        List<PopulationEmployInsuranceDO> populationEmployInsuranceList = employInsuranceManager.getEmployInsuranceList();
        List<PopulationSchoolDO> schoolDOList = employInsuranceManager.getSchoolList();


        Double[][] preLaborPopulation = new Double[3][10];
        Double[][] preEmployedPopulation = new Double[3][10];
        Double[][] preFirstPopulation = new Double[3][10];
        Double[][] preSecondPopulation = new Double[3][10];
        Double[][] preThirdPopulation = new Double[3][10];
        Double[][] preInsurance = new Double[3][10];
        Double[][] preOldRate = new Double[3][10];
        Double[][] preLaborRate = new Double[3][10];

        Long[][] prePrimarySchool = new Long[3][10];
        Long[][] preMiddleSchool = new Long[3][10];
        Long[][] preHighschool = new Long[3][10];


        Iterator iterator = populationEmployInsuranceList.iterator();
        Iterator iteratorSchool = schoolDOList.iterator();
        int index = 0;
        while (iterator.hasNext())
        {
            PopulationEmployInsuranceDO populationEmployInsuranceDO   = (PopulationEmployInsuranceDO) iterator.next();
            PopulationSchoolDO schoolDO = (PopulationSchoolDO) iteratorSchool.next();

            preLaborPopulation[index/10][index%10] = Double.valueOf(populationEmployInsuranceDO.getPreLaborPopulation());
            preEmployedPopulation[index/10][index%10] = Double.valueOf(populationEmployInsuranceDO.getPreEmployedPopulation());
            preFirstPopulation[index/10][index%10] = Double.valueOf(populationEmployInsuranceDO.getPreFirstPopulation());
            preSecondPopulation[index/10][index%10] = Double.valueOf(populationEmployInsuranceDO.getPreSecondPopulation());
            preThirdPopulation[index/10][index%10] = Double.valueOf(populationEmployInsuranceDO.getPreThirdPopulation());
            preInsurance[index/10][index%10] = Double.valueOf(populationEmployInsuranceDO.getPreInsurance());
            preOldRate[index/10][index%10] = Double.valueOf(populationEmployInsuranceDO.getPreOldRate());
            preLaborRate[index/10][index%10] = Double.valueOf(populationEmployInsuranceDO.getPreLaborRate());
            prePrimarySchool[index/10][index%10] =schoolDO.getPrePrimarySchool();
            preMiddleSchool[index/10][index%10] = schoolDO.getPreMiddleSchool();
            preHighschool[index/10][index%10] = schoolDO.getPreHighschool();
            index++;
        }

        List  list  = new ArrayList<>();
        list.add(preLaborPopulation);
        list.add(preEmployedPopulation);
        list.add(preFirstPopulation);
        list.add(preSecondPopulation);
        list.add(preThirdPopulation);
        list.add(preInsurance);
        list.add(preOldRate);
        list.add(preLaborRate);
        list.add(prePrimarySchool);
        list.add(preMiddleSchool);
        list.add(preHighschool);


        return new BaseResult(list);
    }

}
