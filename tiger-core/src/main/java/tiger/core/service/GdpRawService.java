package tiger.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.GdpRawDO;
import tiger.common.data.persistence.GdpRawMapper;
import java.util.List;

/**
 * Created by xy86 on 16-3-1.
 */
@Service
public class GdpRawService {
    @Autowired
    private GdpRawMapper gdpRawMapper;

    public List<GdpRawDO> getGdpRawData(){
        return gdpRawMapper.getGdpRawData();
    }
}
