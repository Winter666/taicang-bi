package tiger.web.controller.population;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tiger.biz.population.PopulationStructurePreManager;
import tiger.common.data.dataobject.BirthrateDO;
import tiger.common.data.dataobject.PopulationStructurePreDO;
import tiger.core.base.BaseResult;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PopulationStructureController {

	 @Autowired
	    private PopulationStructurePreManager populationStructurePreManager;

	    @RequestMapping(value="/api/predictData/populationStructurePreData/list", method = RequestMethod.GET)
	    public BaseResult getPopulationStructurePreData()
	    {
	        List<PopulationStructurePreDO> populationStructurePreDOList = populationStructurePreManager.getPopulationStructurePreData();

	        System.out.println(populationStructurePreDOList.get(0).getSexType_id());
	        List list=new ArrayList();
	        
	        List sum1=new ArrayList();
	        double sum16=0;
	        double sum17=0;
	        double sum18=0;
	        double sum19=0;
	        double sum20=0;
	        double sum21=0;
	        double sum22=0;
	        double sum23=0;
	        double sum24=0;
	        double sum25=0;
	       
	        for(int i=0;i<populationStructurePreDOList.size();i++){
	        	if(populationStructurePreDOList.get(i).getPreYear()==2016){
	        		 sum16+=populationStructurePreDOList.get(i).getPreResidentPopulation();
	        	}
	        	if(populationStructurePreDOList.get(i).getPreYear()==2017){
	        		 sum17+=populationStructurePreDOList.get(i).getPreResidentPopulation();
	        	}
	        	if(populationStructurePreDOList.get(i).getPreYear()==2018){
	        		 sum18+=populationStructurePreDOList.get(i).getPreResidentPopulation();
	        	}
	        	if(populationStructurePreDOList.get(i).getPreYear()==2019){
	        		 sum19+=populationStructurePreDOList.get(i).getPreResidentPopulation();
	        	}
	        	if(populationStructurePreDOList.get(i).getPreYear()==2020){
	        		 sum20+=populationStructurePreDOList.get(i).getPreResidentPopulation();
	        	}
	        	if(populationStructurePreDOList.get(i).getPreYear()==2021){
	        		 sum21+=populationStructurePreDOList.get(i).getPreResidentPopulation();
	        	}
	        	if(populationStructurePreDOList.get(i).getPreYear()==2022){
	        		 sum22+=populationStructurePreDOList.get(i).getPreResidentPopulation();
	        	}
	        	if(populationStructurePreDOList.get(i).getPreYear()==2023){
	        		 sum23+=populationStructurePreDOList.get(i).getPreResidentPopulation();
	        	}
	        	if(populationStructurePreDOList.get(i).getPreYear()==2024){
	        		 sum24+=populationStructurePreDOList.get(i).getPreResidentPopulation();
	        	}
	        	if(populationStructurePreDOList.get(i).getPreYear()==2025){
	        		 sum25+=populationStructurePreDOList.get(i).getPreResidentPopulation();
	        	}
	        }
	        sum1.add(sum16);
	        sum1.add(sum17);
	        sum1.add(sum18);
	        sum1.add(sum19);
	        sum1.add(sum20);
	        sum1.add(sum21);
	        sum1.add(sum22);
	        sum1.add(sum23);
	        sum1.add(sum24);
	        sum1.add(sum25);
	     

	        return new BaseResult(populationStructurePreDOList);
	    }
	    
	    
	    @Autowired
	    private PopulationStructurePreManager birthrateManager;

	    @RequestMapping(value="/api/predictData/birthrateData/list", method = RequestMethod.GET)
	    public BaseResult getBirthrateData()
	    {
	        List<BirthrateDO> birthrateDOList = birthrateManager.getBirthrateData();

	        System.out.println(birthrateDOList.get(0).getPopulation());

	        return new BaseResult(birthrateDOList);
	    }
}
