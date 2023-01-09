package chapterSix.selfAssessment.computerAssistedInstruction;

import java.util.Scanner;

public class ComputerAssistedInstructionMain {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        ComputerAssistedInstruction cai = new ComputerAssistedInstruction();

        ComputerAssistedInstruction.displayMenu();
        int problem = scanner.nextInt();
        while (problem < 1 || problem > 5){
            System.out.println("Wrong input. Please try again.");
            ComputerAssistedInstruction.displayMenu();
            problem = scanner.nextInt();
        }
        switch (problem) {
            case 1 -> {
                do {
                    cai.displayAdditionQuestion();
                }
                while (cai.getQuestionCount() < 10);
            }
            case 2 -> {
                do {
                    cai.displaySubtractionQuestion();
                    cai.confirmAnswer(scanner.nextInt());
                }
                while (cai.getQuestionCount() < 10);
            }
            case 3 -> {
                do {
                    cai.displayMultiplicationQuestion();
                    cai.confirmAnswer(scanner.nextInt());
                }
                while (cai.getQuestionCount() < 10);
            }
            case 4 -> {
                do {
                    cai.displayDivisionQuestion();
                    cai.confirmAnswer(scanner.nextInt());
                }
                while (cai.getQuestionCount() < 10);
            }
            case 5 -> {
                do {
                    cai.displayRandomQuestion();
                }
                while (cai.getQuestionCount() < 10);
            }
        }
    }
}
