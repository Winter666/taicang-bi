/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.converter;

import tiger.common.data.dataobject.CurrentDateElement;
import tiger.common.data.dataobject.PowerGdpCorrelationIndustryDO;
import tiger.core.domain.PowerGdpCorrelationIndustrySoloDomain;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Bongo on 16/3/3.
 */
public class PowerGdpCorrelationIndustrySoloConverter {

    /*
    * main for test
    * */

//    public static void main(String args[]){
//
//        Calendar cal = Calendar.getInstance();
//        int year = cal.get(Calendar.YEAR);
//        int month = cal.get(Calendar.MONTH) + 1;
//        int season = 4/4+1;
//
//        System.out.println(year);
//        System.out.println(season);
//
//    }

    public static List<PowerGdpCorrelationIndustrySoloDomain> convertByList(List<PowerGdpCorrelationIndustryDO> dos){

        List<PowerGdpCorrelationIndustrySoloDomain> domains = new ArrayList<>();

        Calendar cal = Calendar.getInstance();

        //获取当前时间元素
        int currentYear = CurrentDateElement.YEAR;

        int startYear = currentYear-10;

        int endYear = currentYear+2;

        int currentSeason = CurrentDateElement.SEASON;

        Iterator<PowerGdpCorrelationIndustryDO> e = dos.iterator();

        while(e.hasNext()){

            PowerGdpCorrelationIndustryDO temp = e.next();

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
    private static PowerGdpCorrelationIndustrySoloDomain singleConvertOnReal(PowerGdpCorrelationIndustryDO DO){

        PowerGdpCorrelationIndustrySoloDomain domain = new PowerGdpCorrelationIndustrySoloDomain();

        domain.setYear(DO.getYear());

        domain.setSeason(DO.getSeason());

        domain.setIndustryId(DO.getIndustryId());

        domain.setGdpValue(DO.getRealIndustryGdp());

        domain.setPowerValue(DO.getRealIndustryPower());

        return domain;

    }

    /**
     * @return PowerGdpCorrelationIndustrySoloDomain 如果是预测值则调用
     * @param DO
     * */
    private static PowerGdpCorrelationIndustrySoloDomain singleConvertOnForcast(PowerGdpCorrelationIndustryDO DO){

        PowerGdpCorrelationIndustrySoloDomain domain = new PowerGdpCorrelationIndustrySoloDomain();

        domain.setYear(DO.getYear());

        domain.setSeason(DO.getSeason());

        domain.setIndustryId(DO.getIndustryId());

        domain.setGdpValue(DO.getForcastIndustryGdp());

        domain.setPowerValue(DO.getForcastIndustryPower());

        return domain;

    }

}
