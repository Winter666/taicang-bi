package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.TaxForecastDO;

import java.util.List;
import tiger.common.data.persistence.TaxForecastMapper;
/**
 * Created by xy86 on 16-2-28.
 */
@Service
public class TaxForecastService {
    @Autowired
    private TaxForecastMapper taxForecastMapper;

    public List<TaxForecastDO> gettaxForecastData(){
        return taxForecastMapper.getTaxForecastData();
    }
}
