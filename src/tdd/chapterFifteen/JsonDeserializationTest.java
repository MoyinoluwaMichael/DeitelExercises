package tdd.chapterFifteen;

import chapterFifteen.classwork.JSON.Cat;
import chapterFifteen.classwork.JSON.JsonDeserialization;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class JsonDeserializationTest {

    String json;
    DateTimeFormatter formatter;
    LocalDateTime dob;

    @BeforeEach
    void setUp() {
        dob = LocalDateTime.now();
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        json = "{\"name\":\"Bingo\",\"colour\":\"pink\",\"type\":\"EranIyaOsogbo\",\"dob\":"+"\""+formatter.format(dob)+"\""+"}";
    }

    @Test
    public void testConvertToObject() {
        Cat cat = JsonDeserialization.convertToObject(json);
        assertNotNull(cat);
        assertTrue(cat.getName().equals("Bingo"));
        assertEquals(formatter.format(dob), cat.getDob());
    }
}