/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.CurrentDateElement;
import tiger.core.domain.PowerGdpCorrelationIndustrySoloDomain;
import tiger.core.service.PowerGdpCorrelationIndustryService;

import java.util.*;

/**
 * Created by Bongo on 16/3/3.
 */
@Service
public class PowerGdpCorrelationIndustrySoloManager {

    @Autowired
    PowerGdpCorrelationIndustryService pgcis;

    /**
     * @return Map key:industryId value:[0]:season=0所有年份数据的两个数组 [1]map:key:year value:四个季度的数据
     * */
    public Map<Integer,List> getPowerGdpCorrelationIndustrySoloDomainMap(){

        List<PowerGdpCorrelationIndustrySoloDomain> list = getPowerGdpCorrelationIndustrySoloDomainList();

        Map<Integer,List> map = new HashMap<>();

        int industryMark=3001;

        for (int i=0;i<8;i++){

            Iterator<PowerGdpCorrelationIndustrySoloDomain> e = list.iterator();

            List mapList = new ArrayList();

            double[] gdps = new double[13],
                     powers = new double[13];
            int mark = 0;

            Map<Integer,List<double[]>> nestedMap = new HashMap<>();

            int yearMark = CurrentDateElement.YEAR-10;

            for (int j=0;j<13;j++){

                List<double[]> nestedList = new ArrayList<>();
                double[] gdpss = new double[4],
                         powerss = new double[4];
                int markk=0;

                Iterator<PowerGdpCorrelationIndustrySoloDomain> in = list.iterator();
                while(in.hasNext()){

                    PowerGdpCorrelationIndustrySoloDomain temp = in.next();
                    if (temp.getIndustryId()==industryMark&&temp.getYear()==yearMark&&temp.getSeason()!=0){

                        gdpss[markk] = temp.getGdpValue();
                        powerss[markk] = temp.getPowerValue();

                        markk++;

                    }

                }
                nestedList.add(gdpss);
                nestedList.add(powerss);
                nestedMap.put(yearMark,nestedList);

                yearMark++;

            }

            while(e.hasNext()){

                PowerGdpCorrelationIndustrySoloDomain temp = e.next();

                if (temp.getIndustryId()==industryMark&&temp.getSeason()==0){

                    gdps[mark] = temp.getGdpValue();
                    powers[mark] = temp.getPowerValue();
                    mark++;

                }

            }

            mapList.add(gdps);
            mapList.add(powers);
            mapList.add(nestedMap);

            map.put(industryMark,mapList);
            industryMark++;

        }

        return map;

    }

    /**
     * @return PowerGdpCorrelationDomainList
     * */
    public List<PowerGdpCorrelationIndustrySoloDomain> getPowerGdpCorrelationIndustrySoloDomainList(){
        return pgcis.getPowerGdpCorrelationIndustrySoloDomainList();
    }

}
