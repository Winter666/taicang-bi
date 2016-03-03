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

        List<int[]> arrays=new ArrayList<int[]>();
        int aqi[]=new int[7];
        Iterator<AirQualityDO> e = airQualityDOList.iterator();


        int j=0;
        while(e.hasNext()){
            AirQualityDO temp = e.next();
            if(temp.getId().longValue()>=1 && temp.getId().longValue()<=7){

                aqi[j]=temp.getAqi();
                j++;
            }
        }

        arrays.add(aqi);
        return new BaseResult(arrays);
    }

}
