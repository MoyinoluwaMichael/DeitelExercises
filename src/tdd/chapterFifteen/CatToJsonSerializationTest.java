package tdd.chapterFifteen;

import chapterFifteen.classwork.JSON.Cat;
import chapterFifteen.classwork.JSON.JsonSerialization;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

import static org.junit.jupiter.api.Assertions.*;

public class CatToJsonSerializationTest {
    Cat cat;
    DateTimeFormatter formatter;
    LocalDateTime dob =  LocalDateTime.now();

    @BeforeEach
    public void setUp(){
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        formatter.format(dob);
        cat = new Cat("Bingo", "pink", "EranIyaOsogbo",dob);
    }

    @Test
    public void testConvertCatToJson(){
        String catJson = JsonSerialization.convertCatToJson(cat);
        System.out.println(catJson);
        assertNotNull(catJson);
        assertEquals("{\"()name\":\"Bingo\",\"colour\":\"pink\",\"type\":\"EranIyaOsogbo\",\"dob\":"+"\""+formatter.format(dob)+"\""+"}", catJson);
    }

}
