package tiger.common.data.persistence;

import tiger.common.data.dataobject.GdpForecastDO;

import java.util.List;

/**
 * Created by Eason on 2016/2/28.
 */
public interface GdpForecastMapper {
    List<GdpForecastDO> getGdpForecastData();
}
