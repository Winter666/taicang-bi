/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.enums;

import tiger.common.data.enums.BaseEnum;

/**
 * Created by Bongo on 16/3/8.
 */
public enum GenderEnum implements BaseEnum{

    MALE("MALE","男"),FEMALE("FEMALE","女");

    private String code;

    private String value;

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getValue() {
        return value;
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

}
