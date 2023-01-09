package chapterThree.classWork;

import java.util.Scanner;

public class NativeName {
    public static void main(String[] args){
        Native moyin = new Native();
        String hisName = moyin.getName();
        System.out.println(hisName);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name");
        String newName = input.nextLine();
        moyin.setName(newName);
        hisName = moyin.getName();
        System.out.println(hisName);

    }
}
