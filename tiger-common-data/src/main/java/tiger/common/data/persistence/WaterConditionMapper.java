package tiger.common.data.persistence;

import tiger.common.data.dataobject.AirConditionDO;

import java.util.List;
import tiger.common.data.dataobject.WaterConditionDO;
/**
 * Created by lisite on 16-2-29.
 */
public interface WaterConditionMapper {
    List<WaterConditionDO> getWaterConditionData();
}
