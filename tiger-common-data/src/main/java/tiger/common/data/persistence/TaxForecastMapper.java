package tiger.common.data.persistence;

import tiger.common.data.dataobject.TaxForecastDO;

import java.util.List;

/**
 * Created by xy86 on 16-2-28.
 */
public interface TaxForecastMapper {
    List<TaxForecastDO> getTaxForecastData();
}
