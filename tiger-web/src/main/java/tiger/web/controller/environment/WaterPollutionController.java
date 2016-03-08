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
        ArrayList<Double> JiuLONGDischarge  = new ArrayList<Double>();
        ArrayList<Double> TCCityzoneDischarge  = new ArrayList<Double>();
        ArrayList<Double> LiuHeDischarge  = new ArrayList<Double>();
        ArrayList<Double> GangChengDischarge  = new ArrayList<Double>();
        ArrayList<Double> TCRivertownDischarge = new ArrayList<Double>();
        

        for(int i = 0;i<waterPollutionDOList.size();i++)
        {
        	
        	int key  = waterPollutionDOList.get(i).getWater_pollution_source().intValue()%10;
        	switch (key) {
			case 1:
				JiuLONGDischarge.add(waterPollutionDOList.get(i).getDischarge());
				break;
			case 2:
				TCCityzoneDischarge.add(waterPollutionDOList.get(i).getDischarge());
				break;
			case 6:
				LiuHeDischarge.add(waterPollutionDOList.get(i).getDischarge());
				break;
			case 7:
				GangChengDischarge.add(waterPollutionDOList.get(i).getDischarge());
				break;
			case 9:
				TCRivertownDischarge.add(waterPollutionDOList.get(i).getDischarge());
				break;

			default:
				break;
			}
        }

        list.add(JiuLONGDischarge);
        list.add(TCCityzoneDischarge);
        list.add(LiuHeDischarge);
        list.add(GangChengDischarge);
        list.add(TCRivertownDischarge);
  
        //cod溶解氧的最新一天数据
        ArrayList<Double> JiuLONGCod  = new ArrayList<Double>();
        ArrayList<Double> TCCityzoneCod  = new ArrayList<Double>();
        ArrayList<Double> LiuHeCod  = new ArrayList<Double>();
        ArrayList<Double> GangChengCod  = new ArrayList<Double>();
        ArrayList<Double> TCRivertownCod = new ArrayList<Double>();
        

        for(int i = 0;i<waterPollutionDOList.size();i++)
        {
        	
        	int key  = waterPollutionDOList.get(i).getWater_pollution_source().intValue()%10;
        	switch (key) {
			case 1:
				JiuLONGCod .add(waterPollutionDOList.get(i).getCod());
				break;
			case 2:
				TCCityzoneCod.add(waterPollutionDOList.get(i).getCod());
				break;
			case 6:
				LiuHeCod.add(waterPollutionDOList.get(i).getCod());
				break;
			case 7:
				GangChengCod.add(waterPollutionDOList.get(i).getCod());
				break;
			case 9:
				TCRivertownCod.add(waterPollutionDOList.get(i).getCod());
				break;

			default:
				break;
			}
        }
        

        list.add(JiuLONGCod);
        list.add(TCCityzoneCod);
        list.add(LiuHeCod);
        list.add(GangChengCod);
        list.add(TCRivertownCod);
        
        //氨氮浓度最新一天数据
        ArrayList<Double> JiuLONGNh4n  = new ArrayList<Double>();
        ArrayList<Double> TCCityzoneNh4n   = new ArrayList<Double>();
        ArrayList<Double> LiuHeNh4n   = new ArrayList<Double>();
        ArrayList<Double> GangChengNh4n   = new ArrayList<Double>();
        ArrayList<Double> TCRivertownNh4n  = new ArrayList<Double>();
        

        for(int i = 0;i<waterPollutionDOList.size();i++)
        {
        	
        	int key  = waterPollutionDOList.get(i).getWater_pollution_source().intValue()%10;
        	switch (key) {
			case 1:
				JiuLONGNh4n.add(waterPollutionDOList.get(i).getNh4n());
				break;
			case 2:
				TCCityzoneNh4n.add(waterPollutionDOList.get(i).getNh4n());
				break;
			case 6:
				LiuHeNh4n.add(waterPollutionDOList.get(i).getNh4n());
				break;
			case 7:
				GangChengNh4n.add(waterPollutionDOList.get(i).getNh4n());
				break;
			case 9:
				TCRivertownNh4n.add(waterPollutionDOList.get(i).getNh4n());
				break;

			default:
				break;
			}
        }
        

        list.add(JiuLONGNh4n);
        list.add(TCCityzoneNh4n);
        list.add(LiuHeNh4n);
        list.add(GangChengNh4n);
        list.add(TCRivertownNh4n);
 
        //总磷浓度
        ArrayList<Double> JiuLONGP  = new ArrayList<Double>();
        ArrayList<Double> TCCityzoneP   = new ArrayList<Double>();
        ArrayList<Double> LiuHeP   = new ArrayList<Double>();
        ArrayList<Double> GangChengP   = new ArrayList<Double>();
        ArrayList<Double> TCRivertownP  = new ArrayList<Double>();
        

        for(int i = 0;i<waterPollutionDOList.size();i++)
        {
        	
        	int key  = waterPollutionDOList.get(i).getWater_pollution_source().intValue()%10;
        	switch (key) {
			case 1:
				JiuLONGP.add(waterPollutionDOList.get(i).getP());
				break;
			case 2:
				TCCityzoneP.add(waterPollutionDOList.get(i).getP());
				break;
			case 6:
				LiuHeP.add(waterPollutionDOList.get(i).getP());
				break;
			case 7:
				GangChengP.add(waterPollutionDOList.get(i).getP());
				break;
			case 9:
				TCRivertownP.add(waterPollutionDOList.get(i).getP());
				break;
			default:
				break;
			}
        }

        list.add(JiuLONGP);
        list.add(TCCityzoneP);
        list.add(LiuHeP);
        list.add(GangChengP);
        list.add(TCRivertownP);
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
