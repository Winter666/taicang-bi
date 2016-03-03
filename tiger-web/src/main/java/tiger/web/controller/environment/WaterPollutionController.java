package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tiger.biz.environment.support.WaterPollutionManager;
import tiger.common.data.dataobject.AirQualityDO;
import tiger.common.data.dataobject.WaterPollutionDO;
import tiger.core.base.BaseResult;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@RestController
public class WaterPollutionController {

    @Autowired
    private WaterPollutionManager waterPollutionManager;

	@RequestMapping(value="/api/rawData/waterPollutionData/list", method = RequestMethod.GET)
    public BaseResult getWaterPollutionData()
    {
        List<WaterPollutionDO> waterPollutionDOList = waterPollutionManager.getWaterPollutionData();
        
        List<double[]> arrays=new ArrayList<double[]>();
        double discharge[]=new double[7];
        Iterator<WaterPollutionDO> e = waterPollutionDOList.iterator();


        int j=0;
        while(e.hasNext()){
        	WaterPollutionDO temp = e.next();
            if(temp.getId().longValue()>=1 && temp.getId().longValue()<=7){

            	discharge[j]=temp.getDischarge();
                j++;
            }
        }

        arrays.add(discharge);
//        System.out.println(waterPollutionDOList.get(0).getCod());

        return new BaseResult(arrays);
    }

}
