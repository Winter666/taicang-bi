/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.enums;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import tiger.common.data.enums.serializer.EnumSerializer;

/**
 * Created by Bongo on 16/3/8.
 */
@JsonSerialize(using = EnumSerializer.class)
public interface BaseEnum {

    String getCode();

    void setCode(String code);

    String getValue();

    void setValue(String value);

}
