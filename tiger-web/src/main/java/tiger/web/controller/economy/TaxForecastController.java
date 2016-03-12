package tiger.web.controller.economy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tiger.common.data.dataobject.GdpForecastDO;
import tiger.core.base.BaseResult;
import tiger.common.data.dataobject.TaxForecastDO;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import tiger.biz.economy.support.TaxForecastManager;
/**
 * Created by xy86 on 16-2-28.
 */
@RestController
public class TaxForecastController {

    @Autowired
    private TaxForecastManager taxForecastManager;
    @RequestMapping(value="/api/predictData/taxForecastData/*", method = RequestMethod.GET)
    public BaseResult gettaxForecastData(@RequestParam(value="year",defaultValue = "2015") int year){
        List<TaxForecastDO> taxForecastDOList= taxForecastManager.gettaxForecastData();
        List<double[]> arrays=new ArrayList<double[]>();
        Calendar a= Calendar.getInstance();
        int ayear=a.get(Calendar.YEAR);
        double taxrealvalue[]=new double[13];
        double taxforecastvalue[]=new double[13];
        double taxgrowvalue[]=new double[13];
        double taxthisyearrealvalue[]=new double[11];
        double taxthisyearforecastvalue[]=new double[11];
        double taxthisyeargrowratevalue[]=new double[11];
        double xyear[]=new double[13];
//        double xyearvalue=year;
        double balancevalue=-9;
        for (int xy=0;xy<13;xy++){
            xyear[xy]=year+balancevalue;
            balancevalue++;
        };
        Iterator<TaxForecastDO> e=taxForecastDOList.iterator();
        int i=0;
        while(e.hasNext()){
            TaxForecastDO temp=e.next();
            if (temp.getMonth()==12&&temp.getYear()>=year-9&&temp.getYear()<year+4){
                taxrealvalue[i]=temp.getTaxRealValue();
                taxforecastvalue[i]=temp.getTaxForecastValue();
                taxgrowvalue[i]=temp.getTaxGrowthRate();
                i++;
            }
        }
        arrays.add(taxrealvalue);
        arrays.add(taxforecastvalue);
        arrays.add(taxgrowvalue);
         int j=0;
        Iterator<TaxForecastDO> t=taxForecastDOList.iterator();
        while(t.hasNext()){
            TaxForecastDO temp=t.next();
            if (temp.getYear()==year&&temp.getMonth()>=2&&temp.getMonth()<=12){
                if(year>=ayear+1){
                    taxthisyearrealvalue[j]=0;
                    taxthisyearforecastvalue[j]=0;
                    taxthisyeargrowratevalue[j]=0;
                    j++;
                }else{
                taxthisyearrealvalue[j]=temp.getTaxRealValue();
                taxthisyearforecastvalue[j]=temp.getTaxForecastValue();
                taxthisyeargrowratevalue[j]=temp.getTaxGrowthRate();
                j++;
                }
            }

        }
//        double temptent=0;
//        for (int w=0;w<taxthisyearrealvalue.length-1;w++){
//            for (int i2=0;i2<taxthisyearrealvalue.length-1-w;i2++){
//                if(taxthisyearrealvalue[i2]>taxthisyearrealvalue[i2+1]){
//                    temptent=taxthisyearrealvalue[i2];
//                    taxthisyearrealvalue[i2]=taxthisyearrealvalue[i2+1];
//                    taxthisyearrealvalue[i2+1]=temptent;
//                }
//            }
//        }
//        arrays.add(taxthisyearrealvalue);
//        double temptent2=0;
//        for (int j1=0;j1<taxthisyearforecastvalue.length-1;j1++){
//            for (int j2=0;j2<taxthisyearforecastvalue.length-1-j1;j2++){
//                if(taxthisyearforecastvalue[j2]>taxthisyearforecastvalue[j2+1]){
//                    temptent2=taxthisyearforecastvalue[j2];
//                    taxthisyearforecastvalue[j2]=taxthisyearforecastvalue[j2+1];
//                    taxthisyearforecastvalue[j2+1]=temptent2;
//                }
//            }
//        }
        arrays.add(taxthisyearrealvalue);
        arrays.add(taxthisyearforecastvalue);
        arrays.add(taxthisyeargrowratevalue);
        arrays.add(xyear);
        return new BaseResult(arrays);
    }
}
