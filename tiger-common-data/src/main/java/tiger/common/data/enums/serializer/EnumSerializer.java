/**
 * 310 Inc.
 * All Right Reserved.
 */
package tiger.common.data.enums.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import tiger.common.data.enums.BaseEnum;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Bongo on 16/3/8.
 */
public class EnumSerializer extends JsonSerializer<BaseEnum> {

    @Override
    public void serialize(BaseEnum value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
        Map<String, String> map = new HashMap<>();
        map.put("code",value.getCode());
        map.put("value",value.getValue());
        jgen.writeObject(map);
    }

}
