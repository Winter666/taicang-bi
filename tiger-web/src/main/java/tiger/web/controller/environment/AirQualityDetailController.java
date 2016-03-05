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
        int line_aqi[]=new int[12];

        int j=0;
        Iterator<AirQualityDO> e = airQualityDOList.iterator();
        AirQualityDO temp = e.next();

        Date date=temp.getDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.DATE, -1);
        date=new Date(cal.getTime().getTime());
        while(e.hasNext()&&temp.getHour()!=9){
            temp=e.next();
        }
        for (int i = 0; i < 12; i++) {
            line_aqi[11-i]=temp.getAqi();
            temp=e.next();

        }

        arrays.add(line_aqi);
        return new BaseResult(arrays);
    }

}
