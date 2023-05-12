package leetcode.numberToWords.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void testPerimeterOfARectangle(){
        Rectangle rectangle = new Rectangle(4, 3);
        assertEquals(14.0, rectangle.calculatePerimeter());
    }

}