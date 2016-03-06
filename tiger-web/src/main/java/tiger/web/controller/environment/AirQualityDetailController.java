package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.environment.support.AirQualityManager;
import tiger.common.data.dataobject.AirQualityDO;
import tiger.core.base.BaseResult;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@RestController
public class AirQualityDetailController {

    @Autowired
    private AirQualityManager airQualityManager;

    @RequestMapping(value="/api/rawData/airQualityDetailData/list", method = RequestMethod.GET)
    public BaseResult getAirQualityData()
    {
        List<AirQualityDO> airQualityDOList = airQualityManager.getAirQualityData();

        List arrays=new ArrayList();
        double line_aqi[]=new double[12];
        double line_pm25[]=new double[12];
        double line_pm10[]=new double[12];
        double line_so2[]=new double[12];
        double line_no2[]=new double[12];
        double line_co[]=new double[12];
        double line_o3[]=new double[12];
        double gauge[]=new double[7];

        int j=0;
        Iterator<AirQualityDO> e = airQualityDOList.iterator();
        AirQualityDO temp = e.next();

        for (int i = 0; i < 7; i++) {
            gauge[0]=temp.getAqi();
            gauge[1]=temp.getPm25();
            gauge[2]=temp.getPm10();
            gauge[3]=temp.getSo2();
            gauge[4]=temp.getNo2();
            gauge[5]=temp.getCo();
            gauge[6]=temp.getO3();
        }

        while(e.hasNext()&&temp.getHour()!=9){
            temp=e.next();
        }
        for (int i = 0; i < 12; i++) {
            line_aqi[11 - i] = temp.getAqi();
            line_pm25[11 - i] = temp.getPm25();
            line_pm10[11 - i] = temp.getPm10();
            line_so2[11 - i] = temp.getSo2();
            line_no2[11 - i] = temp.getNo2();
            line_co[11 - i] = temp.getCo();
            line_o3[11 - i] = temp.getO3();
            temp = e.next();

        }

        arrays.add(line_aqi);
        arrays.add(line_pm25);
        arrays.add(line_pm10);
        arrays.add(line_so2);
        arrays.add(line_no2);
        arrays.add(line_co);
        arrays.add(line_o3);
        arrays.add(gauge);
        return new BaseResult(arrays);
    }

}
