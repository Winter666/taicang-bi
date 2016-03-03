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
        int aqi[]=new int[7];
        int predictaqi[]= new int[7];
        int day[]=new int[7];
        int day1[]=new int[7];
        int month[]=new int[7];
        int month1[]=new int[7];
        String date[]=new String[7];
        Iterator<AirQualityDO> e = airQualityDOList.iterator();


        int j=0;
        AirQualityDO temp = e.next();
        while(e.hasNext()&&j<7){
            aqi[j]=temp.getAqi();
            predictaqi[j]=temp.getPredictaqi();
            day[j]=temp.getDay();
            month[j]=temp.getMonth();
            j++;
            //因为每一天都有24条记录,所以e.next()跳24次得到每天相同时间的AQI
            temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();
            temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();temp = e.next();
        }
        //因为AirQualityMapper.xml中的sql语句用到了order by desc, 所以这边把数组的顺序正过来
        day1[0]=day[6];day1[1]=day[5];day1[2]=day[4];day1[3]=day[3];day1[4]=day[2];day1[5]=day[1];day1[6]=day[0];
        month1[0]=month[6];month1[1]=month[5];month1[2]=month[4];month1[3]=month[3];month1[4]=month[2];month1[5]=month[1];month1[6]=month[0];
        for (j = 0; j < 7; j++) {
            date[j]=month1[j]+"月"+day1[j]+"日";
        }
        arrays.add(aqi);
        arrays.add(predictaqi);
        arrays.add(date);
        return new BaseResult(arrays);
    }

}
