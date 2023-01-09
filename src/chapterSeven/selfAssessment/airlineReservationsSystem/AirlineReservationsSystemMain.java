package chapterSeven.selfAssessment.AirlineReservationsSystem;

import java.util.Scanner;

public class AirlineReservationsSystemMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        AirlineReservationsSystem ars = new AirlineReservationsSystem();

        do {
            AirlineReservationsSystem.displayMenu();
            int menu = scanner.nextInt();
            while (menu < 1 || menu > 2){
                ars.displayErrorMessage();
                AirlineReservationsSystem.displayMenu();
                menu = scanner.nextInt();
            }
            switch (menu) {
                case 1 -> {
                    ars.bookFlight();
                }
                case 2 -> {
                    ars.exitApp();
                }
            }
        }
        while (true);
    }
}
