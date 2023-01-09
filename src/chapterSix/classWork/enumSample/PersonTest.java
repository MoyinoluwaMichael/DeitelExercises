package chapterSix.classWork.enumSample;

import java.util.Arrays;
import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Person person = new Person("John Doe", 25, Gender.MALE);
        Person person2 = new Person("Johnny Doe", 20, Gender.MALE);
        Person person3 = new Person("Jane Doe", 19, Gender.FEMALE);
        Person person4 = new Person("Janet Doe", 18, Gender.NON_BINARY);

        Gender gender = person.getGender();
        System.out.println("Dear Moyinoluwa, you are a "+gender);
        System.out.print("Enter your gender in caps: ");
        Gender newGender = Gender.valueOf(input.next());
        person.setGender(newGender);

        gender = person.getGender();

        System.out.println("Dear Moyinoluwa, you are now a "+gender);



    }
    private static int countMales(Person... people){
        int counter = 0;
        for (int i = 0; i < people.length; i++){
            if (people[i].getGender()==Gender.MALE){
                counter++;
            }
        }
        return counter;
    }
}
