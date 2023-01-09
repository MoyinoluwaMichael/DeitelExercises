package chapterSix.selfAssessment.crapsGame;
//You roll two dice. Each die has six faces, which contain one, two, three, four, five and
//six spots, respectively. After the dice have come to rest, the sum of the spots on the two
//upward faces is calculated. If the sum is 7 or 11 on the first throw, you win. If the sum
//is 2, 3 or 12 on the first throw (called “craps”), you lose (i.e., the “house” wins). If the
//sum is 4, 5, 6, 8, 9 or 10 on the first throw, that sum becomes your “point.” To win,
//you must continue rolling the dice until you “make your point” (i.e., roll that same
//point value). You lose by rolling a 7 before making your point.


import java.util.Scanner;


public class CrapsGameMain {
    public static void main(String[] args) throws InterruptedException {
        double wager = 0;
            Scanner input = new Scanner(System.in);
            CrapsGame crapsGame = new CrapsGame();

        do {
            Status gameStatus = crapsGame.getStatus();

            System.out.println("How much do you want to wage?");
            ;
            wager = input.nextDouble();
            crapsGame.layAWage(wager);
            while (wager < 1 || wager > crapsGame.getWager()) {
                System.out.println("How much do you want to wage?");
                ;
                wager = input.nextDouble();
                crapsGame.layAWage(wager);
            }
            do {
                System.out.print(CrapsGame.displayMenu());

                int menu = input.nextInt();
                while (menu < 1 || menu > 2) {
                    System.out.println(CrapsGame.displayErrorMessage() + CrapsGame.displayMenu());
                    menu = input.nextInt();
                }
                switch (menu) {
                    case 1 -> {
                        System.out.println("\n" + crapsGame.rollDice());
                    }
                    case 2 -> {
                        CrapsGame.exitGame();
                    }
                }
                gameStatus = crapsGame.getStatus();
                System.out.println(crapsGame.displayStatusMessage());
            } while (gameStatus == Status.CONTINUE);
            System.out.println(crapsGame.getBankBalance());
        }
        while (wager > 0);
        CrapsGame.gameOver();


    }
}
