package chapterSeven.selfAssessment.AirlineReservationsSystem;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AirlineReservationsSystem {
    static Scanner scanner = new Scanner(System.in);

    private boolean[] numberOfAvailableSeat = new boolean[10];
    private int firstClassSeatCount = 0;
    private int economySeatCount = 5;
    private int totalAvailableSeat = 10;


    public static void displayMenu() {
        addNewLine();
        System.out.println("""
                1. Book flight
                2. Exit""");
    }

    private static int displayClassType() {
        addNewLine();
        System.out.println("""
                1. First class
                2. Economy""");
        return scanner.nextInt();
    }

    public void bookFlight() throws InterruptedException {
        if (totalAvailableSeat > 0) {
            int classType = displayClassType();
            while (classType < 1 || classType > 2){
                displayErrorMessage();
                classType = displayClassType();
            }
            switch (classType) {
                case 1 -> {
                    assignFirstClassSeat();
                }
                case 2 -> {
                    assignEconomySeat();
                }
            }
        }
        else {
            displayNoSeatMessage();
        }
    }

    private void assignEconomySeat() throws InterruptedException {
        if (economySeatCount < 10) {
            numberOfAvailableSeat[economySeatCount] = true;
            totalAvailableSeat--;
            addBookingLoad();
            processBoardingPass(economySeatCount + 1, "Economy");
            economySeatCount++;
        } else if (economySeatCount > 9 && firstClassSeatCount < 5) {
            assignAlternativeSeat("First Class");
        }
    }


    private void assignFirstClassSeat() throws InterruptedException {
        if (firstClassSeatCount < 5) {
            numberOfAvailableSeat[firstClassSeatCount] = true;
            totalAvailableSeat--;
            addBookingLoad();
            processBoardingPass(firstClassSeatCount + 1, "First Class");
            firstClassSeatCount++;
        } else if (firstClassSeatCount > 4 && economySeatCount < 10) {
            assignAlternativeSeat("Economy");
        }
    }

    private void addBookingLoad() throws InterruptedException {
        System.out.print("Booking");
        for (int count =1; count<=3; count++){
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println();
    }
    private void displayNoSeatMessage() {
        System.out.println("There is no more available seat. Please check later.");
    }

    private void assignAlternativeSeat(String seatType) throws InterruptedException {
        if (seatType.equals("First Class")) {
            System.out.println("""
                    "Dear passenger, there is no more space in the Economy section, would you accept to be placed in the first class section?
                    1. Yes
                    2. No""");
            int alternative = scanner.nextInt();
            while (alternative < 1 || alternative > 2){
                displayClassType();
                alternative = scanner.nextInt();
            }
            switch (alternative) {
                case 1 -> {
                    assignFirstClassSeat();
                }
                case 2 -> {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            }
        } else if (seatType.equals("Economy")) {
            System.out.println("""
                    "Dear passenger, there is no more space in the First class section, would you accept to be placed in the Economy section?
                    1. Yes
                    2. No""");
            int alternative = scanner.nextInt();
            switch (alternative) {
                case 1 -> {
                    assignEconomySeat();
                }
                case 2 -> {
                    System.out.println("Next flight leaves in 3 hours.");
                }
            }
        }
    }

    private void processBoardingPass(int seatNumber, String section) {
        System.out.printf("""
                BOARDING PASS
                Seat No: %d
                Section: %s
                """, seatNumber, section);
    }

    public int getTotalAvailableSeat() {
        return totalAvailableSeat;
    }

    void exitApp() throws InterruptedException {
        System.out.print("Exiting App");
        for (int count = 1; count <= 5; count++) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }
        System.exit(0);
    }
    private static void addNewLine(){
        System.out.println("""
                
                
                
                
                
                
                
                """);
    }
    public void displayErrorMessage(){
        System.out.println("Wrong input. Please try again.");
    }
}
