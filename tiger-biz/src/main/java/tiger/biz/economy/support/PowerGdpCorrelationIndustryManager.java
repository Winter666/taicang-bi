/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.core.domain.PowerGdpCorrelationIndustryDomain;
import tiger.core.service.PowerGdpCorrelationIndustryService;

import java.util.*;

/**
 * Created by Bongo on 16/3/2.
 */
@Service
public class PowerGdpCorrelationIndustryManager {

    @Autowired
    PowerGdpCorrelationIndustryService pgcis;

    /**
     * @return HashMap key:year value:List<double[]>(contains gdp and power rate arrays)
     * */
    public Map<Integer,List<double[]>> getPowerGdpCorrelationIndustryMap(){

        Map<Integer,List<double[]>> map = new HashMap<>();

        List<PowerGdpCorrelationIndustryDomain> domains = getPowerGdpCorrelationIndustryDomainList();

        int[] keyList = getYearKeys(domains);


        for (int i=0; i<keyList.length;i++){

            Iterator<PowerGdpCorrelationIndustryDomain> e = domains.iterator();

            int mark = 0;

            double[] gdps = new double[8];

            double[] powers = new double[8];

            List<double[]> list = new ArrayList<>();

            while(e.hasNext()){

                PowerGdpCorrelationIndustryDomain temp = e.next();

                if (temp.getYear()==keyList[i]){

                    gdps[mark] = temp.getIndustryGdp();

                    powers[mark] = temp.getIndustryPower();

                    mark++;

                }

            }

            list.add(gdps);

            list.add(powers);

            map.put(keyList[i],list);

        }

        return map;

    }

    /**
     * @return PowerGdpCorrelationDomainList
     * */
    public List<PowerGdpCorrelationIndustryDomain> getPowerGdpCorrelationIndustryDomainList(){
        return pgcis.getPowerGdpCorrelationIndustryDomainList();
    }

    /**
     * @return keyarray
     * */
    public static int[] getYearKeys(List<PowerGdpCorrelationIndustryDomain> domains){

        int[] i = new int[12];

        int mark = 0;

        Iterator<PowerGdpCorrelationIndustryDomain> e = domains.iterator();

        while(e.hasNext()){

            PowerGdpCorrelationIndustryDomain temp = e.next();

            if(mark==0){

                i[mark]=temp.getYear();
                mark++;

            }else{

                if(i[mark-1]!=temp.getYear()){
                    i[mark]=temp.getYear();
                    mark++;
                }

            }

        }

        return i;

    }

}
