package chapterFour.selfAssessment.tipCalculateor;

import java.util.Scanner;

public class TipCalculator{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Product newProduct1 = new Product();


        System.out.println("""
                WELCOME TO INTELI JAMES STORE
                Dear valued customer, it's a privilege to have you patronize us.
                We are here to meet your needs and serve you better.
                """);
        System.out.println("""
               How do you want to patronize us?
               1. Purchase
               2. Know About us
               Kindly make your choice from the above highlighted items by typing the option or entering the number.
               """);
        String patronize = input.nextLine();


        while (!patronize.equalsIgnoreCase("purchase") && !patronize.equalsIgnoreCase("1") &&
                !patronize.equalsIgnoreCase("know about us") && !patronize.equalsIgnoreCase("2")){
            System.out.println("""
                   Wrong input! Try again.
                   How do you want to patronize us?
                   1. Purchase
                   2. Know About us
                   Kindly make your choice from the above highlighted means by typing the option or entering the number.
                   """);
            patronize = input.nextLine();
        }

        if (patronize.equalsIgnoreCase("purchase") || patronize.equalsIgnoreCase("1")){
            System.out.println("""
                    Below are the available items in our store:
                    1. Bread
                    2. Noodles
                    
                    Kindly select from the above highlighted available items by typing the option or entering the number.
                    """);
            String itemName = input.nextLine();
            while (!itemName.equalsIgnoreCase("Bread") && !itemName.equalsIgnoreCase("1") &&
                    !itemName.equalsIgnoreCase("Noodles") && !itemName.equalsIgnoreCase("2")){
                System.out.println("""
                        Wrong input! Try again.Below are the available items in our store:
                        1. Bread
                        2. Noodles
                    
                        Kindly select from the above highlighted available items by typing the option or entering the number.                        
                        """);
                itemName = input.nextLine();
            }
            if (itemName.equalsIgnoreCase("bread")){
                newProduct1.setProductName(itemName);
                System.out.println("""
                        Please select the size of bread
                        """);
            }








        } else if (patronize.equalsIgnoreCase("know about us") || patronize.equalsIgnoreCase("2")) {
            System.out.println("""
                    Welcome to Inteli James Store.
                    """);
        }


    }
}