package tiger.biz.environment.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import tiger.common.data.dataobject.AqiScopeDO;

import tiger.common.data.dataobject.AqiScopeDO;
import tiger.core.service.AqiScopeService;
/**
 * Created by lisite on 16-2-29.
 */
@Service
public class AqiScopeManager {

    @Autowired
    private AqiScopeService aqiScopeService;

    public List<AqiScopeDO> getAqiScopeData()
    {
        return aqiScopeService.getAqiScopeData();
    }

}
