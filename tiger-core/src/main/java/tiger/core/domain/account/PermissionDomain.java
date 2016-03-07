/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.domain.account;

import tiger.common.data.enums.SystemEnum;
import tiger.core.base.BaseDomain;

import java.io.Serializable;

/**
 * Created by Bongo on 16/3/8.
 */
public class PermissionDomain extends BaseDomain
        implements Serializable{

    private static final long serialVersionUID = 874468527202259228L;

    private String name;

    private String operation;

    private SystemEnum system;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public SystemEnum getSystem() {
        return system;
    }

    public void setSystem(SystemEnum system) {
        this.system = system;
    }

    @Override
    public int hashCode() {
        return new Long(id).hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (object instanceof PermissionDomain) {
            PermissionDomain permissionDomain = (PermissionDomain) object;
            if (permissionDomain.getId()>0) {
                return this.getId().equals(permissionDomain.getId());
            }
        }
        return false;
    }
}
