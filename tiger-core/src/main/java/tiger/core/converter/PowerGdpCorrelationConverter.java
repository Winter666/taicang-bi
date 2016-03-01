/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.converter;

import tiger.common.data.dataobject.PowerGdpCorrelationDO;
import tiger.core.domain.PowerGdpCorrelationDomain;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Bongo on 16/3/1.
 */
public class PowerGdpCorrelationConverter {

    public static List<PowerGdpCorrelationDomain> convertByList(List<PowerGdpCorrelationDO> powerDOs){


        int currentYear = Integer.parseInt( (new SimpleDateFormat("yyyy").format(new Date())) );

        int startYear = currentYear-10;

        int endYear = currentYear+2;

        //第一步:对原始集合对象按年份排序
        Collections.sort(powerDOs);

        System.out.println(powerDOs);

        //新建目标集合
        List<PowerGdpCorrelationDomain> powerDomains = new ArrayList<PowerGdpCorrelationDomain>();

        //Domain's target: extract data of certain years(now is 2006->2018)
        Iterator<PowerGdpCorrelationDO> e = powerDOs.iterator();
        while(e.hasNext()){

            PowerGdpCorrelationDO temp = e.next();

            if (startYear<=temp.getYear()&&temp.getYear()<currentYear){

                powerDomains.add(singleConvertOnReal(temp));

            }else if(temp.getYear()>=currentYear&&temp.getYear()<=endYear){

                powerDomains.add(singleConvertOnForcast(temp));

            }
        }

        return powerDomains;

    }
    public static PowerGdpCorrelationDomain singleConvertOnReal(PowerGdpCorrelationDO powerDO){

        PowerGdpCorrelationDomain powerDomain = new PowerGdpCorrelationDomain();

        powerDomain.setYear(powerDO.getYear());

        powerDomain.setGdpValue(powerDO.getRealGdpValue());

        powerDomain.setPowerValue(powerDO.getRealPowerValue());

        return powerDomain;

    }
    public static PowerGdpCorrelationDomain singleConvertOnForcast(PowerGdpCorrelationDO powerDO){

        PowerGdpCorrelationDomain powerDomain = new PowerGdpCorrelationDomain();

        powerDomain.setYear(powerDO.getYear());

        powerDomain.setGdpValue(powerDO.getForcastGdpValue());

        powerDomain.setPowerValue(powerDO.getForcastPowerValue());

        return powerDomain;

    }

}
