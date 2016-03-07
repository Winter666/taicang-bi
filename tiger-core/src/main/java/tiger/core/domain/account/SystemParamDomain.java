/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.core.domain.account;

import tiger.common.data.enums.SystemParamTypeEnum;
import tiger.common.util.annotation.CopyIgnore;
import tiger.core.base.BaseDomain;

import java.io.Serializable;

/**
 * Created by Bongo on 16/3/8.
 */
public class SystemParamDomain extends BaseDomain
        implements Serializable{

    private static final long serialVersionUID = -8003627093125831184L;

    private String paramName;

    private String paramValue;

    @CopyIgnore
    private boolean isActive;

    @CopyIgnore
    private SystemParamTypeEnum paramType;

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public SystemParamTypeEnum getParamType() {
        return paramType;
    }

    public void setParamType(SystemParamTypeEnum paramType) {
        this.paramType = paramType;
    }
}
