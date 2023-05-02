package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfDigitTest {
    @Test void test(){
        int result = NumberOfDigit.getNumberOfDigit(new String[]{")0Ab1396", "Q2RBs", "G381ac"});
        assertEquals(9, result);
    }

}