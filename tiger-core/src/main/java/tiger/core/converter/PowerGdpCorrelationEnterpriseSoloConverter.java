/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.converter;

import tiger.common.data.dataobject.CurrentDateElement;
import tiger.common.data.dataobject.PowerGdpCorrelationEnterpriseSoloDO;
import tiger.core.domain.PowerGdpCorrelationEnterpriseSoloDomain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Bongo on 16/3/4.
 */
public class PowerGdpCorrelationEnterpriseSoloConverter {

    public static List<PowerGdpCorrelationEnterpriseSoloDomain> convertByList(List<PowerGdpCorrelationEnterpriseSoloDO> dos){

        List<PowerGdpCorrelationEnterpriseSoloDomain> domains = new ArrayList<>();

        //获取当前时间元素
        int currentYear = CurrentDateElement.YEAR;

        int startYear = currentYear-10;

        int endYear = currentYear+2;

        int currentSeason = CurrentDateElement.SEASON;

        Iterator<PowerGdpCorrelationEnterpriseSoloDO> e = dos.iterator();

        while(e.hasNext()){

            PowerGdpCorrelationEnterpriseSoloDO temp = e.next();

            /*
            * ......留待抽取
            * */

            if(startYear<=temp.getYear()&&temp.getYear()<currentYear){

                domains.add(singleConvertOnReal(temp));

            }else if(temp.getYear()==currentYear){
                if (temp.getSeason()==0){

                    domains.add(singleConvertOnForcast(temp));

                }else if(temp.getSeason()<currentSeason){

                    domains.add(singleConvertOnReal(temp));

                }else{
                    domains.add(singleConvertOnForcast(temp));
                }

            }else if(temp.getYear()>currentYear&&temp.getYear()<=endYear){

                domains.add(singleConvertOnForcast(temp));

            }

        }

        return domains;

    }


    /**
     * @return PowerGdpCorrelationIndustrySoloDomain 如果是真实值则调用
     * @param DO
     * */
    private static PowerGdpCorrelationEnterpriseSoloDomain singleConvertOnReal(PowerGdpCorrelationEnterpriseSoloDO DO){

        PowerGdpCorrelationEnterpriseSoloDomain domain = new PowerGdpCorrelationEnterpriseSoloDomain();

        domain.setYear(DO.getYear());

        domain.setSeason(DO.getSeason());

        domain.setEnterpriseId(DO.getEnterpriseId());

        domain.setGdpValue(DO.getRealEnterpriseGdp());

        domain.setPowerValue(DO.getRealEnterprisePower());

        return domain;

    }

    /**
     * @return PowerGdpCorrelationIndustrySoloDomain 如果是预测值则调用
     * @param DO
     * */
    private static PowerGdpCorrelationEnterpriseSoloDomain singleConvertOnForcast(PowerGdpCorrelationEnterpriseSoloDO DO){

        PowerGdpCorrelationEnterpriseSoloDomain domain = new PowerGdpCorrelationEnterpriseSoloDomain();

        domain.setYear(DO.getYear());

        domain.setSeason(DO.getSeason());

        domain.setEnterpriseId(DO.getEnterpriseId());

        domain.setGdpValue(DO.getForcastEnterpriseGdp());

        domain.setPowerValue(DO.getForcastEnterprisePower());

        return domain;

    }

}
