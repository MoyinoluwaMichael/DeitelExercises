package chapterFifteen.exercises;

import leetcode.Lcm;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LcmTest {

    @Test void lcmFunctionTest(){
        assertEquals(Arrays.toString(new int[]{-5}), Arrays.toString(Lcm.getLcm(-5)));
    }

}