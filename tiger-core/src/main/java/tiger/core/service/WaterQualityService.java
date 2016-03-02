package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.WaterQualityDO;
import tiger.common.data.persistence.WaterQualityMapper;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
@Service
public class WaterQualityService {

    @Autowired
    private WaterQualityMapper waterQualityMapper;

    public List<WaterQualityDO> getWaterQualityData()
    {
        return waterQualityMapper.getWaterQualityData();
    }
}
