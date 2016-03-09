/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.economy.support.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.biz.economy.support.PowerGdpCorrelationManager;
import tiger.core.domain.PowerGdpCorrelationDomain;
import tiger.core.service.PowerGdpCorrelationService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Bongo on 16/3/9.
 */
@Service
public class PowerGdpCorrelationManagerImpl implements PowerGdpCorrelationManager {
    @Autowired
    PowerGdpCorrelationService pgcs;

    @Override
    public List<double[]> getPowerGdpArray(){

        List<double[]> arrays = new ArrayList<>();


        double[] years = new double[13],
                gdps=new double[13],
                powers =new double[13];
        int mark = 0;

        Iterator<PowerGdpCorrelationDomain> e = getPowerGdpCorrelationDomainList().iterator();

        while(e.hasNext()){

            PowerGdpCorrelationDomain temp = e.next();
            years[mark] = temp.getYear();
            gdps[mark] = temp.getGdpValue();
            powers[mark] = temp.getPowerValue();
            mark++;

        }
        arrays.add(years);

        arrays.add(gdps);

        arrays.add(powers);

        return arrays;
    }

    /**
     * @return PowerGdpCorrelationDomainList
     * */
    private List<PowerGdpCorrelationDomain> getPowerGdpCorrelationDomainList(){
        return pgcs.getPowerGdpCorrelationDomainList();
    }
}
