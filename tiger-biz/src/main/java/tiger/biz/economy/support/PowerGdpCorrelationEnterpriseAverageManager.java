/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.biz.economy.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tiger.core.domain.PowerGdpCorrelationEnterpriseAverageDomain;
import tiger.core.service.PowerGdpCorrelationEnterpriseAverageService;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Bongo on 16/3/4.
 */
public interface PowerGdpCorrelationEnterpriseAverageManager {

    /**
     * 第一元素gdpValue[] 第二元素powerValue[]
     * */
    List<double[]> getPowerGdpArray();

}
