package tiger.common.data.persistence;

import tiger.common.data.dataobject.WaterPollutionDO;

import java.util.List;

/**
 * Created by lisite on 16-2-29.
 */
public interface WaterPollutionMapper {
    List<WaterPollutionDO> getWaterPollutionData();
}
