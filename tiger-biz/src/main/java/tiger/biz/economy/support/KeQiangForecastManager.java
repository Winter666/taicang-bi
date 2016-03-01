package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.KeQiangDO;
import tiger.core.service.KeQiangForecastService;
import java.util.List;

/**
 * Created by xy86 on 16-2-29.
 */
@Service
public class KeQiangForecastManager {
    @Autowired
    private KeQiangForecastService keQiangForecastService;
    public List<KeQiangDO> getkeqiangForecastData(){
        return keQiangForecastService.getkeqiangForecastData();
    }
}
