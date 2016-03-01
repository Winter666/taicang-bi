package tiger.core.converter;

import tiger.common.data.dataobject.GdpForecastDO;
import tiger.core.domain.GdpDomain;

/**
 * Created by xy86 on 16-3-2.
 */
public class GdpConverter {
    public static GdpDomain convert(GdpForecastDO gdpForecastDO){
        GdpDomain gdpDomain=new GdpDomain();
        gdpDomain.setGdpRealValue(gdpForecastDO.getGdpRealValue());
        gdpDomain.setErrorValue(gdpForecastDO.getErrorValue());
        gdpDomain.setGdpForecastValue(gdpForecastDO.getGdpForecastValue());
        gdpDomain.setGdpGrowthRate(gdpForecastDO.getGdpGrowthRate());
        gdpDomain.setGdpYearTarget(gdpForecastDO.getGdpYearTarget());
        gdpDomain.setQuarter(gdpForecastDO.getQuarter());
        gdpDomain.setYear(gdpForecastDO.getYear());
        gdpDomain.setIndustryType_id(gdpForecastDO.getIndustryType_id());
        return gdpDomain;
    }
}
