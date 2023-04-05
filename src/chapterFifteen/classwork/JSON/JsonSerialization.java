package chapterFifteen.classwork.JSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerialization {
    public static String convertCatToJson(Cat cat){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(cat);
        } catch (JsonProcessingException e) {
            return e.getMessage();
        }
    }
}
