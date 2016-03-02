package tiger.biz.environment.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.WaterIndustryDO;
import tiger.core.service.WaterIndustryService;

import java.util.List;

/**
 * Created by lisite on 16-3-1.
 */
@Service
public class WaterIndustryManager {

    @Autowired
    private WaterIndustryService waterIndustryService;

    public List<WaterIndustryDO> getWaterIndustryData()
    {
        return waterIndustryService.getWaterIndustryData();
    }

}
