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

    private PowerGdpCorrelationConverter(){}

    public static List<PowerGdpCorrelationDomain> convertByList(List<PowerGdpCorrelationDO> powerDOs){
        int currentYear = Integer.parseInt( (new SimpleDateFormat("yyyy").format(new Date())) ),
            startYear = currentYear-10,
            endYear = currentYear+2;

        Collections.sort(powerDOs);

        List<PowerGdpCorrelationDomain> powerDomains = new ArrayList<>();

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

    private static PowerGdpCorrelationDomain singleConvertOnReal(PowerGdpCorrelationDO powerDO){

        PowerGdpCorrelationDomain powerDomain = new PowerGdpCorrelationDomain();
        powerDomain.setYear(powerDO.getYear());
        powerDomain.setGdpValue(powerDO.getRealGdpValue());
        powerDomain.setPowerValue(powerDO.getRealPowerValue());

        return powerDomain;
    }

    private static PowerGdpCorrelationDomain singleConvertOnForcast(PowerGdpCorrelationDO powerDO){

        PowerGdpCorrelationDomain powerDomain = new PowerGdpCorrelationDomain();
        powerDomain.setYear(powerDO.getYear());
        powerDomain.setGdpValue(powerDO.getForcastGdpValue());
        powerDomain.setPowerValue(powerDO.getForcastPowerValue());

        return powerDomain;
    }

}
