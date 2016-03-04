package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.environment.support.AirPollutionManager;
import tiger.common.data.dataobject.AirPollutionDO;
import tiger.common.data.dataobject.AirQualityDO;
import tiger.core.base.BaseResult;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@RestController
public class AirPollutionController {

    @Autowired
    private AirPollutionManager airPollutionManager;

    @RequestMapping(value="/api/rawData/airPollutionData/list", method = RequestMethod.GET)
    public BaseResult getAirPollutionData()
    {
        List<AirPollutionDO> airPollutionDOList = airPollutionManager.getAirPollutionData();

        List arrays=new ArrayList();
        double smoke[]=new double[4];
        double smoke1[]=new double[4];
        Long air_pollution_source[]=new Long[4];

        int j=0;int a=0;int b=0;int c=0;int d=0;
        Iterator<AirPollutionDO> e = airPollutionDOList.iterator();
        AirPollutionDO temp = e.next();
        while(j<4&&e.hasNext()||a==0||b==0||c==0||d==0){
            if(temp.getAir_pollution_source()==4022 && a==0){
                smoke[j]=temp.getSmoke();
                air_pollution_source[j]=temp.getAir_pollution_source();
                a++;
                j++;
            }
            if(temp.getAir_pollution_source()==4023 && b==0){
                smoke[j]=temp.getSmoke();
                air_pollution_source[j]=temp.getAir_pollution_source();
                b++;
                j++;
            }
            if(temp.getAir_pollution_source()==4024 && c==0){
                smoke[j]=temp.getSmoke();
                air_pollution_source[j]=temp.getAir_pollution_source();
                c++;
                j++;
            }
            if(temp.getAir_pollution_source()==4025 && d==0) {
                smoke[j]=temp.getSmoke();
                air_pollution_source[j]=temp.getAir_pollution_source();
                d++;
                j++;
            }
            temp=e.next();
        }

        for (int i = 0; i < 4; i++) {
            if(air_pollution_source[i]==4022)
                smoke1[0]=smoke[i];
            if(air_pollution_source[i]==4023)
                smoke1[1]=smoke[i];
            if(air_pollution_source[i]==4024)
                smoke1[2]=smoke[i];
            if(air_pollution_source[i]==4025)
                smoke1[3]=smoke[i];
        }
        arrays.add(smoke1);
        return new BaseResult(arrays);
    }

}
