/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.dataobject.account;

import tiger.common.data.dataobject.BaseDO;
import tiger.common.util.annotation.CopyIgnore;

import java.io.Serializable;

/**
 * Created by Bongo on 16/3/8.
 */
public class SystemParamsDO extends BaseDO
        implements Serializable{

    private static final long serialVersionUID = -1770965478525685694L;

    private String paramName;

    private String paramValue;

    @CopyIgnore
    private String paramType;

    @CopyIgnore
    private Byte isActive;

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

    public Byte getIsActive() {
        return isActive;
    }

    public void setIsActive(Byte isActive) {
        this.isActive = isActive;
    }

    public String getParamType() {
        return paramType;
    }

    public void setParamType(String paramType) {
        this.paramType = paramType;
    }
}
