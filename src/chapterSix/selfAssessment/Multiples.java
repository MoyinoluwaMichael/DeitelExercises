//Write a method isMultiple that determines, for a pair of integers, whether the
//second integer is a multiple of the first. The method should take two integer arguments and return
//true if the second is a multiple of the first and false otherwise.

package chapterSix.selfAssessment;

public class Multiples {
    private static boolean isMultiple(int firstInteger, int secondInteger) {
        return secondInteger % firstInteger == 0;
    }

    public static void main(String[] args) {

        System.out.println(isMultiple(3,5));
    }
}
