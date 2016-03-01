package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.KeQiangDO;
import tiger.common.data.persistence.KeQiangForecastMapper;
import java.util.List;

/**
 * Created by xy86 on 16-2-29.
 */
@Service
public class KeQiangForecastService {
    @Autowired
    private KeQiangForecastMapper keQiangForecastMapper;
    public List<KeQiangDO> getkeqiangForecastData(){
        return keQiangForecastMapper.getkeqiangForecastData();
    }
}
