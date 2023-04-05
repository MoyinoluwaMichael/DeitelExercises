package chapterFifteen.classwork.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class JsonDeserialization {
    public static Cat convertToObject(String json){
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(json.getBytes(), Cat.class);
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
