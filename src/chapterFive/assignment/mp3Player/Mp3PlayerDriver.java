package chapterFive.assignment.mp3Player;

import java.util.Scanner;

public class Mp3PlayerDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mp3Player loudPlay = new Mp3Player();

        System.out.print("""
                LOUDPLAY
                
                1. Login
                2. I don't have an account (Register)
                
               Select: """);
        int initialDisplay = input.nextInt();
        while (initialDisplay < 1 || initialDisplay > 2){
            System.out.print("""
                Wrong input!
                
                1. Login
                2. I don't have an account (Register)
                
               Select: """);
            initialDisplay = input.nextInt();
        }
        switch (initialDisplay){
//            case 1 -> {loudPlay.login();}
//            case 2 -> {loudPlay.register();}
        }

    }
}
