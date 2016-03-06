package tiger.web.controller.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tiger.biz.environment.support.WaterPollutionManager;
import tiger.common.data.dataobject.AirQualityDO;
import tiger.common.data.dataobject.WaterPollutionDO;
import tiger.core.base.BaseResult;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
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
//		System.out.println(waterPollutionDOList.size());

		Date date=waterPollutionDOList.get(0).getDate();
		Calendar cal = Calendar.getInstance();
		cal.setTime(new java.util.Date(date.getTime()));
		String datetime[]=new String[1];
		datetime[0]=cal.get(Calendar.YEAR) + "年" + (cal.get(Calendar.MONTH)+1) + "月" + cal.get(Calendar.DAY_OF_MONTH) + "日" + 9 + "时";


		String date1[]=new String[6];
		for (int i = 0; i < 6; i++) {
			date1[5-i]=waterPollutionDOList.get(i*5).getMonth() + "月" + waterPollutionDOList.get(i*5).getDay() + "日";
		}

		List  list = new ArrayList();
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

        list.add(list1);
        list.add(list2);
        list.add(list3);
        list.add(list4);
        list.add(list5);
  
        //cod溶解氧的最新一天数据
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
        
        //氨氮浓度最新一天数据
        ArrayList<Double> list11  = new ArrayList<Double>();
        ArrayList<Double> list12  = new ArrayList<Double>();
        ArrayList<Double> list13  = new ArrayList<Double>();
        ArrayList<Double> list14  = new ArrayList<Double>();
        ArrayList<Double> list15 = new ArrayList<Double>();
        

        for(int i = 0;i<waterPollutionDOList.size();i++)
        {
        	
        	int key  = waterPollutionDOList.get(i).getWater_pollution_source().intValue()%10;
        	switch (key) {
			case 1:
				list11.add(waterPollutionDOList.get(i).getNh4n());
				break;
			case 2:
				list12.add(waterPollutionDOList.get(i).getNh4n());
				break;
			case 6:
				list13.add(waterPollutionDOList.get(i).getNh4n());
				break;
			case 7:
				list14.add(waterPollutionDOList.get(i).getNh4n());
				break;
			case 9:
				list15.add(waterPollutionDOList.get(i).getNh4n());
				break;

			default:
				break;
			}
        }
        

        list.add(list11);
        list.add(list12);
        list.add(list13);
        list.add(list14);
        list.add(list15);
 
        //总磷浓度
        ArrayList<Double> list16  = new ArrayList<Double>();
        ArrayList<Double> list17  = new ArrayList<Double>();
        ArrayList<Double> list18  = new ArrayList<Double>();
        ArrayList<Double> list19  = new ArrayList<Double>();
        ArrayList<Double> list20 = new ArrayList<Double>();
        

        for(int i = 0;i<waterPollutionDOList.size();i++)
        {
        	
        	int key  = waterPollutionDOList.get(i).getWater_pollution_source().intValue()%10;
        	switch (key) {
			case 1:
				list16.add(waterPollutionDOList.get(i).getP());
				break;
			case 2:
				list17.add(waterPollutionDOList.get(i).getP());
				break;
			case 6:
				list18.add(waterPollutionDOList.get(i).getP());
				break;
			case 7:
				list19.add(waterPollutionDOList.get(i).getP());
				break;
			case 9:
				list20.add(waterPollutionDOList.get(i).getP());
				break;
			default:
				break;
			}
        }

        list.add(list16);
        list.add(list17);
        list.add(list18);
        list.add(list19);
        list.add(list20);
		list.add(datetime);
		list.add(date1);
		return new BaseResult(list);
    }

	//水质监测站及其附近污水处理厂查看所需数据
	@RequestMapping(value = "/forMap",method = RequestMethod.GET)
	public BaseResult getWaterPollutionDataForMap(){
		return  new BaseResult(this.waterPollutionManager.getWaterPollutionDataForMap());

	}


}
