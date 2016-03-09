/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.core.domain.PowerGdpCorrelationDomain;
import tiger.core.service.PowerGdpCorrelationService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Bongo on 16/3/1.
 */
public interface PowerGdpCorrelationManager {


    /**
     * 将PowerGdpCorrelationDomainList转换为前端可用的数组对象,第一元素gdpValue[] 第二元素powerValue[]
     * */
    List<double[]> getPowerGdpArray();

}
