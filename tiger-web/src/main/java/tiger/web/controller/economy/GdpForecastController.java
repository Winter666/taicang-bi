package tiger.web.controller.economy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.economy.support.GdpForecastManager;
import tiger.common.data.dataobject.GdpForecastDO;
import tiger.core.base.BaseResult;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Eason on 2016/2/28.
 */

@RestController
public class GdpForecastController {

    @Autowired
    private GdpForecastManager gdpForecastManager;

    @RequestMapping(value="/api/predictData/gdpForecastData/list", method = RequestMethod.GET)
    public BaseResult getGdpForecastData()
    {
        List<GdpForecastDO> gdpForecastDOList = gdpForecastManager.getGdpForecastData();

        List<double[]> arrays=new ArrayList<double[]>();
        double gdprealvalue[]=new double[12];

        Iterator<GdpForecastDO> e = gdpForecastDOList.iterator();

        int j=0;

        while(e.hasNext()){
            GdpForecastDO temp = e.next();
            if(temp.getIndustryType_id()==11&&temp.getYear()>2005&&temp.getYear()<2018){

                gdprealvalue[j]=temp.getGdpRealValue();
                j++;
            }
        }


//        for(int i=0;i<gdpForecastDOList.size();i++){
//            if(gdpForecastDOList.get(i).getIndustryType_id()==11&&gdpForecastDOList.get(i).getYear()>2005&&gdpForecastDOList.get(i).getYear()<2018){
//
//                    gdprealvalue[j]=gdpForecastDOList.get(i).getGdpRealValue();
//                   j++;
//            }
//        }
        arrays.add(gdprealvalue);
        return new BaseResult(arrays);
    }


}
