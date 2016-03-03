/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.converter;

import tiger.common.data.dataobject.CurrentDateElement;
import tiger.common.data.dataobject.PowerGdpCorrelationEnterpriseAverageDO;
import tiger.core.domain.PowerGdpCorrelationEnterpriseAverageDomain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Bongo on 16/3/4.
 */
public class PowerGdpCorrelationEnterpriseAverageConverter {

    public static List<PowerGdpCorrelationEnterpriseAverageDomain> convertByList(List<PowerGdpCorrelationEnterpriseAverageDO> powerDOs){


        int currentYear = CurrentDateElement.YEAR;

        int startYear = currentYear-10;

        int endYear = currentYear+2;

        //第一步:对原始集合对象按年份排序
        Collections.sort(powerDOs);

        //新建目标集合
        List<PowerGdpCorrelationEnterpriseAverageDomain> powerDomains = new ArrayList<>();

        //Domain's target: extract data of certain years(now is 2006->2018)
        Iterator<PowerGdpCorrelationEnterpriseAverageDO> e = powerDOs.iterator();
        while(e.hasNext()){

            PowerGdpCorrelationEnterpriseAverageDO temp = e.next();

            if (startYear<=temp.getYear()&&temp.getYear()<currentYear){

                powerDomains.add(singleConvertOnReal(temp));

            }else if(temp.getYear()>=currentYear&&temp.getYear()<=endYear){

                powerDomains.add(singleConvertOnForcast(temp));

            }
        }

        return powerDomains;

    }
    public static PowerGdpCorrelationEnterpriseAverageDomain singleConvertOnReal(PowerGdpCorrelationEnterpriseAverageDO powerDO){

        PowerGdpCorrelationEnterpriseAverageDomain powerDomain = new PowerGdpCorrelationEnterpriseAverageDomain();

        powerDomain.setYear(powerDO.getYear());

        powerDomain.setGdpValue(powerDO.getRealGdpValue());

        powerDomain.setPowerValue(powerDO.getRealPowerValue());

        return powerDomain;

    }
    public static PowerGdpCorrelationEnterpriseAverageDomain singleConvertOnForcast(PowerGdpCorrelationEnterpriseAverageDO powerDO){

        PowerGdpCorrelationEnterpriseAverageDomain powerDomain = new PowerGdpCorrelationEnterpriseAverageDomain();

        powerDomain.setYear(powerDO.getYear());

        powerDomain.setGdpValue(powerDO.getForcastGdpValue());

        powerDomain.setPowerValue(powerDO.getForcastPowerValue());

        return powerDomain;

    }

}
