package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.WaterIndustryDO;
import tiger.common.data.persistence.WaterIndustryMapper;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@Service
public class WaterIndustryService {

    @Autowired
    private WaterIndustryMapper waterIndustryMapper;

    public List<WaterIndustryDO> getWaterIndustryData()
    {
        return waterIndustryMapper.getWaterIndustryData();
    }
}
