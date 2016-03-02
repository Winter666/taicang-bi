package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.AirConditionDO;
import tiger.common.data.persistence.AirConditionMapper;

import java.util.List;
import tiger.common.data.persistence.WaterConditionMapper;
import tiger.common.data.dataobject.WaterConditionDO;
/**
 * Created by lisite on 16-2-29.
 */
@Service
public class WaterConditionService {

    @Autowired
    private WaterConditionMapper waterConditionMapper;

    public List<WaterConditionDO> getWaterConditionData()
    {
        return waterConditionMapper.getWaterConditionData();
    }
}
