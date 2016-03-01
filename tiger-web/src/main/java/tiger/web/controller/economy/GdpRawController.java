package tiger.web.controller.economy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tiger.common.data.dataobject.GdpRawDO;
import tiger.core.base.BaseResult;

import java.util.List;
import tiger.biz.economy.support.GdpRawManager;
/**
 * Created by xy86 on 16-3-1.
 */
@RestController
public class GdpRawController {
    @Autowired
    private GdpRawManager gdpRawManager;

    @RequestMapping(value="/api/predictData/gdpRawData/list",method= RequestMethod.GET)
    public BaseResult getGdpRawData(){

        List<GdpRawDO> gdpRawDOList=gdpRawManager.getGdpRawData();

        return new BaseResult(gdpRawDOList);
    }
}
