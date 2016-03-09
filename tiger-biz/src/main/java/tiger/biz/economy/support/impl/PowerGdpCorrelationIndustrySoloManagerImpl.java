/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.economy.support.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.biz.economy.support.PowerGdpCorrelationIndustrySoloManager;
import tiger.common.data.dataobject.CurrentDateElement;
import tiger.core.domain.PowerGdpCorrelationIndustrySoloDomain;
import tiger.core.service.PowerGdpCorrelationIndustryService;

import java.util.*;

/**
 * Created by Bongo on 16/3/9.
 */
@Service("PowerGdpCorrelationIndustrySoloManagerImpl")
public class PowerGdpCorrelationIndustrySoloManagerImpl implements PowerGdpCorrelationIndustrySoloManager {
    @Autowired
    PowerGdpCorrelationIndustryService pgcis;

    @Override
    public Map<Integer,List> getPowerGdpCorrelationIndustrySoloDomainMap(){

        List<PowerGdpCorrelationIndustrySoloDomain> list = getPowerGdpCorrelationIndustrySoloDomainList();
//        System.out.println(list); test success

        Map<Integer,List> map = new HashMap<>(); //总表

        int industryMark=3001;

        for (int i=0;i<8;i++){ //循环8大行业

            List mapList = new ArrayList(); //单个行业的总list

            double[] gdps = new double[13],
                    powers = new double[13];
            int mark = 0;

            Map<Integer,List<double[]>> nestedMap = new HashMap<>();

            int yearMark = CurrentDateElement.YEAR-10;

            for (int j=0;j<13;j++){ //对应要显示的13年

                List<double[]> nestedList = new ArrayList<>();
                double[] gdpss = new double[4],
                        powerss = new double[4];
                int markk=0;

                Iterator<PowerGdpCorrelationIndustrySoloDomain> in = list.iterator();

                while(in.hasNext()){

                    PowerGdpCorrelationIndustrySoloDomain temp = in.next();
//                    System.out.println(temp); //test success
//                    System.out.println(temp.getIndustryId()+" "+temp.getYear()+"  "+temp.getSeason());
                    if (temp.getIndustryId()==industryMark&&temp.getYear()==yearMark&&temp.getSeason()!=0){
                        gdpss[markk] = temp.getGdpValue();
                        powerss[markk] = temp.getPowerValue();
                        markk++;
                    }
                }
//                System.out.println(gdpss[2]);
                nestedList.add(gdpss);
                nestedList.add(powerss);
                nestedMap.put(yearMark,nestedList);

                yearMark++;

            }
            Iterator<PowerGdpCorrelationIndustrySoloDomain> e = list.iterator();
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

    @Override
    public List<PowerGdpCorrelationIndustrySoloDomain> getPowerGdpCorrelationIndustrySoloDomainList(){
        return pgcis.getPowerGdpCorrelationIndustrySoloDomainList();
    }
}
