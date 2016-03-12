package tiger.web.controller.economy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tiger.biz.economy.support.GdpForecastManager;
import tiger.common.data.dataobject.GdpForecastDO;
import tiger.core.base.BaseResult;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Eason on 2016/2/28.
 */

@RestController
public class GdpForecastController {

    @Autowired
    private GdpForecastManager gdpForecastManager;

    @RequestMapping(value="/api/predictData/gdpForecastData/*", method = RequestMethod.GET)
    public BaseResult getGdpForecastData(@RequestParam(value="year",defaultValue ="2015") int year)
    {
        System.out.println(year);
        List<GdpForecastDO> gdpForecastDOList = gdpForecastManager.getGdpForecastData();

        List<double[]> arrays=new ArrayList<double[]>();
        double gdprealvalue[]=new double[12];
        double gdpforecastvalue[]=new double[12];
        double gdperrorValue[]=new double[12];
        double gdpgrowratevalue[]=new double[12];
        double gdpquarterrealvalue[]=new double[4];
        double gdpquarterforecastvalue[]=new double[4];
        double gdpquartergrowratevalue[]=new double[4];
        double gdpfirstrealvalue[]=new double[12];
        double gdpsecondrealvalue[]=new double[12];
        double gdpthirdrealvalue[]=new double[12];
        double thisyearfirstindustryvalue[]=new double[4];
        double thisyearfirstindustryfcvalue[]=new double[4];
        double thisyearfirstindustrygrowvalue[]=new double[4];
        double thisyearsecondindustryvalue[]=new double[4];
        double thisyearsecondindustryfcvalue[]=new double[4];
        double thisyearsecondindustrygrowvalue[]=new double[4];
        double thisyearthirdindustryvalue[]=new double[4];
        double thisyearthirdindustryfcvalue[]=new double[4];
        double thisyearthirdindustrygrowvalue[]=new double[4];
        double xyear[]=new double[12];
        double gdpxyear=year;
        double index=-8;
        for (int xy=0;xy<12;xy++){
            xyear[xy]=gdpxyear+index;
            index++;

        }
        Iterator<GdpForecastDO> e = gdpForecastDOList.iterator();

        int j=0;
//        Calendar a= Calendar.getInstance();
//        int year=a.get(Calendar.YEAR);

        while(e.hasNext()){
            GdpForecastDO temp = e.next();
            if(temp.getIndustryType_id()==11&&temp.getQuarter()==4&&temp.getYear()>year-9&&temp.getYear()<year+4){

                gdprealvalue[j]=temp.getGdpRealValue();
                gdpforecastvalue[j]=temp.getGdpForecastValue();
                gdperrorValue[j]=temp.getErrorValue();
                gdpgrowratevalue[j]=temp.getGdpGrowthRate();
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
        arrays.add(gdpforecastvalue);
        arrays.add(gdperrorValue);
        Iterator<GdpForecastDO> f=gdpForecastDOList.iterator();
        int b0=0;
        while(f.hasNext()){
            GdpForecastDO temp= f.next();
            if (temp.getIndustryType_id()==11&& temp.getYear()==year&&b0<4){
                if (temp.getQuarter()==b0+1){
                    gdpquarterrealvalue[b0]=temp.getGdpRealValue();
                    gdpquarterforecastvalue[b0]=temp.getGdpForecastValue();
                    gdpquartergrowratevalue[b0]=temp.getGdpGrowthRate();
                    b0++;
                }
            }
        }





        arrays.add(gdpquarterrealvalue);
        arrays.add(gdpquarterforecastvalue);
        arrays.add(gdpgrowratevalue);
        arrays.add(gdpquartergrowratevalue);
        Iterator<GdpForecastDO> g=gdpForecastDOList.iterator();
        int b1=0;
        while(g.hasNext()){
            GdpForecastDO temp=g.next();
            if (temp.getIndustryType_id()==12&&temp.getQuarter()==4&&temp.getYear()>year-10&&temp.getYear()<year+3){
              if (temp.getYear()<year) {
                  gdpfirstrealvalue[b1] = temp.getGdpRealValue();
                  b1++;
              }else if (temp.getYear()>=year){
                  gdpfirstrealvalue[b1]=temp.getGdpForecastValue();
                  b1++;
              }
            }
        }
        double temptent=0;
        for (int i=0;i<gdpfirstrealvalue.length-1;i++){
            for (int i2=0;i2<gdpfirstrealvalue.length-1-i;i2++){
                if(gdpfirstrealvalue[i2]>gdpfirstrealvalue[i2+1]){
                    temptent=gdpfirstrealvalue[i2];
                    gdpfirstrealvalue[i2]=gdpfirstrealvalue[i2+1];
                    gdpfirstrealvalue[i2+1]=temptent;
                }
            }
        }
        arrays.add(gdpfirstrealvalue);
        Iterator<GdpForecastDO> industry2=gdpForecastDOList.iterator();
        int b2=0;
        while(industry2.hasNext()){
            GdpForecastDO temp=industry2.next();
            if (temp.getIndustryType_id()==13&&temp.getQuarter()==4&&temp.getYear()>year-10&&temp.getYear()<year+3){
                if (temp.getYear()<year) {
                    gdpsecondrealvalue[b2] = temp.getGdpRealValue();
                    b2++;
                }else if (temp.getYear()>=year){
                    gdpsecondrealvalue[b2]=temp.getGdpForecastValue();
                    b2++;
                }
            }
        }
        double temptent2=0;
        for (int i=0;i<gdpsecondrealvalue.length-1;i++){
            for (int i2=0;i2<gdpsecondrealvalue.length-1-i;i2++){
                if(gdpsecondrealvalue[i2]>gdpsecondrealvalue[i2+1]){
                    temptent2=gdpsecondrealvalue[i2];
                    gdpsecondrealvalue[i2]=gdpsecondrealvalue[i2+1];
                    gdpsecondrealvalue[i2+1]=temptent2;
                }
            }
        }
        arrays.add(gdpsecondrealvalue);
        Iterator<GdpForecastDO> industry3=gdpForecastDOList.iterator();
        int b3=0;
        while(industry3.hasNext()){
            GdpForecastDO temp=industry3.next();
            if (temp.getIndustryType_id()==14&&temp.getQuarter()==4&&temp.getYear()>year-10&&temp.getYear()<year+3){
                if (temp.getYear()<year){
                    gdpthirdrealvalue[b3]=temp.getGdpRealValue();
                    b3++;
                }else if (temp.getYear()>=year){
                    gdpthirdrealvalue[b3]=temp.getGdpForecastValue();
                    b3++;
                }
            }
        }
        double temptent3=0;
        for (int i=0;i<gdpthirdrealvalue.length-1;i++){
            for (int i2=0;i2<gdpthirdrealvalue.length-1-i;i2++){
                if(gdpthirdrealvalue[i2]>gdpthirdrealvalue[i2+1]){
                    temptent3=gdpthirdrealvalue[i2];
                    gdpthirdrealvalue[i2]=gdpthirdrealvalue[i2+1];
                    gdpthirdrealvalue[i2+1]=temptent3;
                }
            }
        }
        arrays.add(gdpthirdrealvalue);

        Iterator<GdpForecastDO> thisyearindustry1=gdpForecastDOList.iterator();
        int b4=0;
        while(thisyearindustry1.hasNext()){
            GdpForecastDO temp=thisyearindustry1.next();
            if (temp.getIndustryType_id()==12&&temp.getYear()==year){
                if(temp.getQuarter()==b4+1){
                    thisyearfirstindustryvalue[b4]=temp.getGdpRealValue();
                    thisyearfirstindustryfcvalue[b4]=temp.getGdpForecastValue();
                    thisyearfirstindustrygrowvalue[b4]=temp.getGdpGrowthRate();
                    b4++;
                }
            }
        }
        arrays.add(thisyearfirstindustryvalue);
        arrays.add(thisyearfirstindustryfcvalue);
        arrays.add(thisyearfirstindustrygrowvalue);
        Iterator<GdpForecastDO> thisyearindustry2=gdpForecastDOList.iterator();
        int b5=0;
        while(thisyearindustry2.hasNext()){
            GdpForecastDO temp=thisyearindustry2.next();
            if (temp.getIndustryType_id()==13&&temp.getYear()==year){
                if (temp.getQuarter()==b5+1){
                    thisyearsecondindustryvalue[b5]=temp.getGdpRealValue();
                    thisyearsecondindustryfcvalue[b5]=temp.getGdpForecastValue();
                    thisyearsecondindustrygrowvalue[b5]=temp.getGdpGrowthRate();
                    b5++;
                }
            }
        }
        arrays.add(thisyearsecondindustryvalue);
        arrays.add(thisyearsecondindustryfcvalue);
        arrays.add(thisyearfirstindustrygrowvalue);
        Iterator<GdpForecastDO> thisyearindustry3=gdpForecastDOList.iterator();
        int b6=0;
        while(thisyearindustry3.hasNext()){
            GdpForecastDO temp=thisyearindustry3.next();
            if (temp.getIndustryType_id()==14&&temp.getYear()==year){
                if (temp.getQuarter()==b6+1){
                    thisyearthirdindustryvalue[b6]=temp.getGdpRealValue();
                    thisyearthirdindustryfcvalue[b6]=temp.getGdpForecastValue();
                    thisyearthirdindustrygrowvalue[b6]=temp.getGdpGrowthRate();
                    b6++;
                }
            }
        }
        arrays.add(thisyearthirdindustryvalue);
        arrays.add(thisyearthirdindustryfcvalue);
        arrays.add(thisyearthirdindustrygrowvalue);
        arrays.add(xyear);
        return new BaseResult(arrays);
    }


}
