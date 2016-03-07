/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.dataobject.account;

import tiger.common.data.dataobject.BaseDO;

import java.io.Serializable;

/**
 * Created by Bongo on 16/3/8.
 */
public class RoleDO extends BaseDO
        implements Serializable{

    private static final long serialVersionUID = 2571810061266833247L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
