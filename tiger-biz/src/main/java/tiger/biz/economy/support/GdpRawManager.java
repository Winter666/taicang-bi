package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.common.data.dataobject.GdpRawDO;

import java.util.List;
import tiger.core.service.GdpRawService;
/**
 * Created by xy86 on 16-3-1.
 */
@Service
public class GdpRawManager {
    @Autowired
    private GdpRawService gdpRawService;

    public List<GdpRawDO> getGdpRawData(){
        return gdpRawService.getGdpRawData();
    }
}
