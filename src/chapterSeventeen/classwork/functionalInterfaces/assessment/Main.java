package chapterSeventeen.classwork.functionalInterfaces.assessment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Felix", 19));
        students.add(new Student("Prof", 90));
        students.add(new Student("James", 90));
        students.add(new Student("Blessing", 15));
        students.add(new Student("Moyin", 10));

        students.sort(Comparator.comparing(Student::getAge).thenComparing(Student::getName));

        System.out.println(students);

    }
}
