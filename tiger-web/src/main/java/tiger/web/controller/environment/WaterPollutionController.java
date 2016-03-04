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
@RequestMapping(value = "/api/rawData/waterPollutionData")
public class WaterPollutionController {

    @Autowired
    private WaterPollutionManager waterPollutionManager;

	@RequestMapping(value="/list", method = RequestMethod.GET)
    public BaseResult getWaterPollutionData()
    {
        List<WaterPollutionDO> waterPollutionDOList = waterPollutionManager.getWaterPollutionData();
        
       System.out.println(waterPollutionDOList.size());


        ArrayList<Double> list1  = new ArrayList<Double>();
        ArrayList<Double> list2  = new ArrayList<Double>();
        ArrayList<Double> list3  = new ArrayList<Double>();
        ArrayList<Double> list4  = new ArrayList<Double>();
        ArrayList<Double> list5 = new ArrayList<Double>();
        

        for(int i = 0;i<waterPollutionDOList.size();i++)
        {
        	
        	int key  = waterPollutionDOList.get(i).getWater_pollution_source().intValue()%10;
        	switch (key) {
			case 1:
				list1.add(waterPollutionDOList.get(i).getDischarge());
				break;
			case 2:
				list2.add(waterPollutionDOList.get(i).getDischarge());
				break;
			case 6:
				list3.add(waterPollutionDOList.get(i).getDischarge());
				break;
			case 7:
				list4.add(waterPollutionDOList.get(i).getDischarge());
				break;
			case 9:
				list5.add(waterPollutionDOList.get(i).getDischarge());
				break;

			default:
				break;
			}
        }
        
        List  list = new ArrayList<>();
        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);
  
        
        ArrayList<Double> list6  = new ArrayList<Double>();
        ArrayList<Double> list7  = new ArrayList<Double>();
        ArrayList<Double> list8  = new ArrayList<Double>();
        ArrayList<Double> list9  = new ArrayList<Double>();
        ArrayList<Double> list10 = new ArrayList<Double>();
        

        for(int i = 0;i<waterPollutionDOList.size();i++)
        {
        	
        	int key  = waterPollutionDOList.get(i).getWater_pollution_source().intValue()%10;
        	switch (key) {
			case 1:
				list6.add(waterPollutionDOList.get(i).getCod());
				break;
			case 2:
				list7.add(waterPollutionDOList.get(i).getCod());
				break;
			case 6:
				list8.add(waterPollutionDOList.get(i).getCod());
				break;
			case 7:
				list9.add(waterPollutionDOList.get(i).getCod());
				break;
			case 9:
				list10.add(waterPollutionDOList.get(i).getCod());
				break;

			default:
				break;
			}
        }
        

        list.add(list6);
        list.add(list7);
        list.add(list8);
        list.add(list9);
        list.add(list10);

        return new BaseResult(list);
    }

	//水质监测站及其附近污水处理厂查看所需数据
	@RequestMapping(value = "/forMap",method = RequestMethod.GET)
	public BaseResult getWaterPollutionDataForMap(){
		return  new BaseResult(this.waterPollutionManager.getWaterPollutionDataForMap());

	}


}
