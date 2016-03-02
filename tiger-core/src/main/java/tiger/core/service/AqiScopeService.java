package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import tiger.common.data.persistence.AqiScopeMapper;
import tiger.common.data.dataobject.AqiScopeDO;

/**
 * Created by lisite on 16-2-29.
 */
@Service
public class AqiScopeService {

    @Autowired
    private AqiScopeMapper aqiScopeMapper;

    public List<AqiScopeDO> getAqiScopeData()
    {
        return aqiScopeMapper.getAqiScopeData();
    }
}
