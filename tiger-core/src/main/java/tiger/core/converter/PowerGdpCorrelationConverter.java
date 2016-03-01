/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.converter;

import tiger.common.data.dataobject.PowerGdpCorrelationDO;
import tiger.core.domain.PowerGdpCorrelationDomain;

/**
 * Created by Bongo on 16/3/1.
 */
public class PowerGdpCorrelationConverter {

    public static PowerGdpCorrelationDomain convert(PowerGdpCorrelationDO powerdo){

        PowerGdpCorrelationDomain powerdomain = new PowerGdpCorrelationDomain();

        powerdomain.setYear(powerdo.getYear());

        powerdomain.setRealGdpValue(powerdo.getRealGdpValue());

        powerdomain.setForcastGdpValue(powerdo.getForcastGdpValue());

        powerdomain.setRealPowerValue(powerdo.getRealPowerValue());

        powerdomain.setForcastPowerValue(powerdo.getForcastPowerValue());

        return powerdomain;
    }

}
