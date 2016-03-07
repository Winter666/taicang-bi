/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.domain.account;

import tiger.common.data.enums.RoleEnum;
import tiger.core.base.BaseDomain;

import java.io.Serializable;

/**
 * Created by Bongo on 16/3/8.
 */
public class RoleDomain extends BaseDomain
        implements Serializable{

    private static final long serialVersionUID = -7753628030126730834L;

    private RoleEnum name;

    public RoleEnum getName() {
        return name;
    }

    public void setName(RoleEnum name) {
        this.name = name;
    }
}
