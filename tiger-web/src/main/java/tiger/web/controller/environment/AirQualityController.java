package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.environment.support.AirQualityManager;
import tiger.common.data.dataobject.AirQualityDO;
import tiger.common.data.dataobject.GdpForecastDO;
import tiger.core.base.BaseResult;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@RestController
public class AirQualityController {

    @Autowired
    private AirQualityManager airQualityManager;

    @RequestMapping(value="/api/rawData/airQualityData/list", method = RequestMethod.GET)
    public BaseResult getAirQualityData()
    {
        List<AirQualityDO> airQualityDOList = airQualityManager.getAirQualityData();

        List arrays=new ArrayList();
        double aqi[]=new double[7];
        double aqi1[]=new double[7];
        double predictaqi[]= new double[7];
        double predictaqi1[]= new double[7];
        int day[]=new int[7];
        int day1[]=new int[7];
        int month[]=new int[7];
        int month1[]=new int[7];
        String date[]=new String[15];
        String date1[]=new String[15];
        String date2[]=new String[7];
        String firstElement[]=new String[7];
        String firstElement1[]=new String[7];
        double pm25[]=new double[7];
        double pm251[]=new double[7];
        double pm10[]=new double[7];
        double pm101[]=new double[7];
        double so2[]=new double[7];
        double so21[]=new double[7];
        double no2[]=new double[7];
        double no21[]=new double[7];
        double co[]=new double[7];
        double co1[]=new double[7];
        double o3[]=new double[7];
        double o31[]=new double[7];
        int hour[]=new int[7];
        int hour1[]=new int[7];
        int airQualityLevel[]=new int[7];
        int airQualityLevel1[]=new int[7];
        String airQualityLevel2[]=new String[7];
        String healthEffect[]=new String[7];
        String proposedMeasure[]=new String[7];

        int j=0;
        Iterator<AirQualityDO> e = airQualityDOList.iterator();
        AirQualityDO temp = e.next();
        while(e.hasNext()&&j<7){
            aqi[j]=temp.getAqi();
            predictaqi[j]=temp.getPredictaqi();
            day[j]=temp.getDay();
            month[j]=temp.getMonth();
            firstElement[j]=temp.getFirstElement();
            pm25[j]=temp.getPm25();
            pm10[j]=temp.getPm10();
            so2[j]=temp.getSo2();
            no2[j]=temp.getNo2();
            co[j]=temp.getCo();
            o3[j]=temp.getO3();
            hour[j]=temp.getHour();
            airQualityLevel[j]=temp.getAirQualityLevel();
//            因为每一天都有24条记录,所以e.next()跳24次得到每天相同时间的AQI
            temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();
            temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();
            j++;
        }
        //因为AirQualityMapper.xml中的sql语句用到了order by desc, 所以这边把数组的顺序正过来
        aqi1[0]=aqi[6];aqi1[1]=aqi[5];aqi1[2]=aqi[4];aqi1[3]=aqi[3];aqi1[4]=aqi[2];aqi1[5]=aqi[1];aqi1[6]=aqi[0];
        predictaqi1[0]=predictaqi[6];predictaqi1[1]=predictaqi[5];predictaqi1[2]=predictaqi[4];predictaqi1[3]=predictaqi[3];predictaqi1[4]=predictaqi[2];predictaqi1[5]=predictaqi[1];predictaqi1[6]=predictaqi[0];
        day1[0]=day[6];day1[1]=day[5];day1[2]=day[4];day1[3]=day[3];day1[4]=day[2];day1[5]=day[1];day1[6]=day[0];
        month1[0]=month[6];month1[1]=month[5];month1[2]=month[4];month1[3]=month[3];month1[4]=month[2];month1[5]=month[1];month1[6]=month[0];
        firstElement1[0]=firstElement[6];firstElement1[1]=firstElement[5];firstElement1[2]=firstElement[4];firstElement1[3]=firstElement[3];firstElement1[4]=firstElement[2];firstElement1[5]=firstElement[1];firstElement1[6]=firstElement[0];
        pm251[0]=pm25[6];pm251[1]=pm25[5];pm251[2]=pm25[4];pm251[3]=pm25[3];pm251[4]=pm25[2];pm251[5]=pm25[1];pm251[6]=pm25[0];
        pm101[0]=pm10[6];pm101[1]=pm10[5];pm101[2]=pm10[4];pm101[3]=pm10[3];pm101[4]=pm10[2];pm101[5]=pm10[1];pm101[6]=pm10[0];
        so21[0]=so2[6];so21[1]=so2[5];so21[2]=so2[4];so21[3]=so2[3];so21[4]=so2[2];so21[5]=so2[1];so21[6]=so2[0];
        no21[0]=no2[6];no21[1]=no2[5];no21[2]=no2[4];no21[3]=no2[3];no21[4]=no2[2];no21[5]=no2[1];no21[6]=no2[0];
        co1[0]=co[6];co1[1]=co[5];co1[2]=co[4];co1[3]=co[3];co1[4]=co[2];co1[5]=co[1];co1[6]=co[0];
        o31[0]=o3[6];o31[1]=o3[5];o31[2]=o3[4];o31[3]=o3[3];o31[4]=o3[2];o31[5]=o3[1];o31[6]=o3[0];
        hour1[0]=hour[6];hour1[1]=hour[5];hour1[2]=hour[4];hour1[3]=hour[3];hour1[4]=hour[2];hour1[5]=hour[1];hour1[6]=hour[0];
        airQualityLevel1[0]=airQualityLevel[6];airQualityLevel1[1]=airQualityLevel[5];airQualityLevel1[2]=airQualityLevel[4];airQualityLevel1[3]=airQualityLevel[3];airQualityLevel1[4]=airQualityLevel[2];airQualityLevel1[5]=airQualityLevel[1];airQualityLevel1[6]=airQualityLevel[0];

        Calendar now = Calendar.getInstance();
        for (j = 0; j < 7; j++) {
            now.add(Calendar.DATE, -1);
            date[j]=(now.get(Calendar.MONTH) + 1) + "月" + now.get(Calendar.DAY_OF_MONTH) +"日";
        }
        date1[0]=date[6];date1[1]=date[5];date1[2]=date[4];date1[3]=date[3];date1[4]=date[2];date1[5]=date[1];date1[6]=date[0];

        now.add(Calendar.DATE, 7);
        for (j = 7; j < 15; j++) {
            date1[j]=(now.get(Calendar.MONTH) + 1) + "月" + now.get(Calendar.DAY_OF_MONTH) +"日";
            now.add(Calendar.DATE, 1);
        }
        for (j = 0; j < 7; j++) {
            date2[j]=date1[j+8];
        }
        for (j = 0; j < 7; j++) {
            switch (airQualityLevel1[j]){
                case 1:
                    airQualityLevel2[j]="优";
                    healthEffect[j]="空气质量令人满意，基本无空气污染";
                    proposedMeasure[j]="极少数异常敏感人群应减少户外运动";
                    break;
                case 2:
                    airQualityLevel2[j]="良";
                    healthEffect[j]="空气质量可接受，但某些污染物可能对极少数异常敏感人群健康有较弱影响";
                    proposedMeasure[j]="极少数异常敏感人群应减少户外运动";
                    break;
                case 3:
                    airQualityLevel2[j]="轻度污染";
                    healthEffect[j]="易感人群症状有轻度加剧，健康人群出现刺激症状";
                    proposedMeasure[j]="儿童、老年人及心脏病、呼吸系统疾病患者应减少长时间、高强度的户外锻炼";
                    break;
                case 4:
                    airQualityLevel2[j]="中度污染";
                    healthEffect[j]="进一步加剧易感人群症状，可能对健康人群心脏、呼吸系统有影响";
                    proposedMeasure[j]="儿童、老年人及心脏病、呼吸系统疾病患者避免长时间、高强度的户外锻炼，一般人群适量减少户外运动";
                    break;
                case 5:
                    airQualityLevel2[j]="严重污染";
                    healthEffect[j]="健康人群运动耐受力降低，有明显强烈症状，提前出现某些疾病";
                    proposedMeasure[j]="儿童、老年人和病人应停留在室内，避免体力消耗，一般人群避免户外活动";
                    break;
            }
        }
        arrays.add(aqi1);
        arrays.add(predictaqi1);
        arrays.add(date1);
        arrays.add(firstElement1);
        arrays.add(pm251);
        arrays.add(pm101);
        arrays.add(so21);
        arrays.add(no21);
        arrays.add(co1);
        arrays.add(o31);
        arrays.add(date2);
        arrays.add(airQualityLevel2);
        arrays.add(healthEffect);
        arrays.add(proposedMeasure);
        return new BaseResult(arrays);
    }

}
