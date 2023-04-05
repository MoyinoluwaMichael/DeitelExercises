package tdd;

import chapterFifteen.exercises.Exercise;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExerciseTest {
    @Test
    void testConsecutiveNumbersExercise(){
        assertEquals(5, Exercise.getConsecutiveNumberIndex(4,14,3));
    }

}