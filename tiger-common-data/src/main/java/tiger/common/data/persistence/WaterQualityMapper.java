package tiger.common.data.persistence;

import tiger.common.data.dataobject.WaterQualityDO;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
public interface WaterQualityMapper {
    List<WaterQualityDO> getWaterQualityData();
}
