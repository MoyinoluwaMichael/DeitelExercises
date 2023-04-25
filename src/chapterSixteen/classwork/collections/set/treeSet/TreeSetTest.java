package chapterSixteen.classwork.collections.set.treeSet;

import java.util.*;

public class TreeSetTest {

    public static void main(String[] args) {

        Set<Integer> nums = new TreeSet<>();
        nums.add(2);
        nums.add(5);
        nums.add(46);
        nums.add(345);
        nums.add(2);
        nums.add(34);
        nums.add(343);
        nums.add(12);
        nums.add(34);

        System.out.println(nums);

        Set<Customer> customers = new TreeSet<>();
        customers.add(new Customer(1, "Zainab", 10000));
        customers.add(new Customer(2, "Toyin", 20000));
        customers.add(new Customer(3, "Tayo", 5000));
        customers.add(new Customer(5, "Kunle", 2000));

        System.out.println(customers);
        Comparator<Customer> comparator = Comparator.comparingInt(Customer::getBalance);

        Set<Customer> customers2 = new TreeSet<>(comparator);
        customers2.add(new Customer(1, "Zainab", 10000));
        customers2.add(new Customer(2, "Toyin", 20000));
        customers2.add(new Customer(3, "Tayo", 5000));
        customers2.add(new Customer(5, "Kunle", 2000));


    }
}
