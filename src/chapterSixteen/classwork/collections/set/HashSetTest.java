package chapterSixteen.classwork.collections.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
    public static void main(String[] args) {

        Set<Integer> nums = new HashSet<>();
        nums.add(34);
        nums.add(5);
        nums.add(46);
        nums.add(345);
        nums.add(34);
        nums.add(343);
        nums.add(12);
        nums.add(34);


        System.out.println(nums);
    }
}
