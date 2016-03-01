/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.persistence.PowerGdpCorrelationMapper;
import tiger.core.converter.PowerGdpCorrelationConverter;
import tiger.core.domain.PowerGdpCorrelationDomain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Bongo on 16/3/1.
 */
@Service
public class PowerGdpCorrelationService {

    @Autowired
    private PowerGdpCorrelationMapper pgcm;

    /**
     * 将PowerGdpCorrelationDomainList转换为前端可用的数组对象,第一元素gdpValue[] 第二元素powerValue[]
     * */
    public List<double[]> getPowerGdpArray(){
        List<double[]> arrays = new ArrayList<double[]>();

        double[] gdps, powers =new double[13];
        int mark = 0;

        Iterator<PowerGdpCorrelationDomain> e = getPowerGdpCorrelationDomainList().iterator();

//        while(e.hasNext()){
//
//            gdps[mark] =
//
//        }

        return arrays;
    }

    public List<PowerGdpCorrelationDomain> getPowerGdpCorrelationDomainList(){
        return PowerGdpCorrelationConverter.convertByList(pgcm.getPowerGdpCorrelationDOList());
    }

}
