package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.environment.support.WaterIndustryManager;
import tiger.common.data.dataobject.WaterIndustryDO;
import tiger.core.base.BaseResult;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lisite on 16-3-1.
 */
@RestController
public class WaterIndustryController {

    @Autowired
    private WaterIndustryManager waterIndustryManager;

    @RequestMapping(value="/api/rawData/waterIndustryData/list", method = RequestMethod.GET)
    public BaseResult getAirIndustryData()
    {
        List<WaterIndustryDO> waterIndustryDOList = waterIndustryManager.getWaterIndustryData();

        Calendar now = Calendar.getInstance();
        String date[]=new String[7];
        String date1[]=new String[7];

        for (int j = 0; j < 7; j++) {
            now.add(Calendar.DATE, -1);
            date[j]=(now.get(Calendar.MONTH) + 1) + "月" + now.get(Calendar.DAY_OF_MONTH) +"日";
        }
        date1[0]=date[6];date1[1]=date[5];date1[2]=date[4];date1[3]=date[3];date1[4]=date[2];date1[5]=date[1];date1[6]=date[0];

        ArrayList<Double> list11  = new ArrayList<Double>();
        ArrayList<Double> list12  = new ArrayList<Double>();
        ArrayList<Double> list13  = new ArrayList<Double>();
        ArrayList<Double> list14  = new ArrayList<Double>();
        ArrayList<Double> list15 = new ArrayList<Double>();
        

        for(int i = 0;i<waterIndustryDOList.size();i++)
        {
        	
        	int key  = waterIndustryDOList.get(i).getWater_industry().intValue()%10;
        	switch (key) {
			case 0:
				list11.add(waterIndustryDOList.get(i).getDischarge());
				break;
			case 1:
				list12.add(waterIndustryDOList.get(i).getDischarge());
				break;
			case 2:
				list13.add(waterIndustryDOList.get(i).getDischarge());
				break;
			case 3:
				list14.add(waterIndustryDOList.get(i).getDischarge());
				break;
			case 4:
				list15.add(waterIndustryDOList.get(i).getDischarge());
				break;

			default:
				break;
			}
        }
        
        List  list = new ArrayList<>();
        list.add(list11);
        list.add(list12);
        list.add(list13);
        list.add(list14);
        list.add(list15);
        list.add(date1);
        return new BaseResult(list);
    }

}
