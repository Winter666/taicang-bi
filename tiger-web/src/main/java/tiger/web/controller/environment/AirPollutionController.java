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

        int j=0;
        Iterator<AirPollutionDO> e = airPollutionDOList.iterator();
        AirPollutionDO temp = e.next();
        while(e.hasNext()&&j<4){
            if(temp.get){

            }
            smoke[j]=temp.getSmoke();
            temp=e.next();
            j++;
        }


        return new BaseResult(airPollutionDOList);
    }

}
