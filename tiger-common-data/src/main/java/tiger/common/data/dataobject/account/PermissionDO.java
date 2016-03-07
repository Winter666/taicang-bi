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
public class PermissionDO extends BaseDO
        implements Serializable{

    private static final long serialVersionUID = 1153421926056906651L;

    private String name;

    private String operation;

    private String system;

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

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }
}
