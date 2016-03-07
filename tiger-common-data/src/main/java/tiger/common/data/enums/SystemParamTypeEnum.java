/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.enums;

/**
 * Created by Bongo on 16/3/8.
 */
public enum SystemParamTypeEnum implements BaseEnum{

    DEFAULT("DEFAULT", ""),
    SYSTEM_CONFIG("SYSTEM_CONFIG","系统基础配置"),
    MESSAGE("MESSAGE", "消息系统参数");

    private String code;
    private String value;

    /**
     * @param code
     * @param value
     */
    SystemParamTypeEnum(String code, String value) {
        this.code = code;
        this.value = value;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 通过<code>code</code>获取枚举
     *
     * @param code
     * @return
     */
    public static SystemParamTypeEnum getEnumByCode(String code) {
        for (SystemParamTypeEnum bt : SystemParamTypeEnum.values()) {
            if (bt.getCode().equals(code)) {
                return bt;
            }
        }
        return null;
    }
}
