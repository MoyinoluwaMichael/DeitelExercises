package chapterSix.selfAssessment.computerAssistedInstruction;

import java.security.SecureRandom;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ComputerAssistedInstruction {
    private final Scanner scanner = new Scanner(System.in);
    private final SecureRandom secureRandom = new SecureRandom();
    private int answer;
    private Status status;
    private final String[] correctResponseMessage = {"Very good!", "Excellent!", "Nice work!", "Keep up the good work!"};
    private final String[] incorrectResponseMessage = {"No. Please try again.", "Wrong. Try once more.!", "Don't give up!", "No. Keep trying."};
    private int passCount;
    private int questionCount;
    private int difficultyLevelCount = 1;
    private int difficultyRandomNumbers2 = 10;
    private int difficultyRandomDivisionNumbers = 10;
    private int difficultyRandomNumbers1 = 1;
    private String difficultyLevelMessage;

    public static void displayMenu() {
        System.out.println("""
                PROBLEMS
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Random
                """);
    }

    public void displayAdditionQuestion() throws InterruptedException {
        addNewLine();
        questionCount++;
        int firstPositiveInteger = secureRandom.nextInt(difficultyRandomNumbers1, difficultyRandomNumbers2);
        int secondPositiveInteger = secureRandom.nextInt(difficultyRandomNumbers1, difficultyRandomNumbers2);
        answer = firstPositiveInteger + secondPositiveInteger;
        System.out.println("Question " + questionCount);
        System.out.println("How much is " + (firstPositiveInteger) + " + " + (secondPositiveInteger) + "?");
        confirmAnswer(scanner.nextInt());
    }

    public void displaySubtractionQuestion() throws InterruptedException {
        addNewLine();
        questionCount++;
        int firstPositiveInteger = secureRandom.nextInt(difficultyRandomNumbers1, difficultyRandomNumbers2);
        int secondPositiveInteger = secureRandom.nextInt(difficultyRandomNumbers1, difficultyRandomNumbers2);
        int max = Math.max(firstPositiveInteger, secondPositiveInteger);
        int min = Math.min(firstPositiveInteger, secondPositiveInteger);
        answer = max - min;
        System.out.println("Question " + questionCount);
        System.out.println("How much is " + (max) + " - " + (min) + "?");
        confirmAnswer(scanner.nextInt());
    }

    public void displayMultiplicationQuestion() throws InterruptedException {
        addNewLine();
        questionCount++;
        int firstPositiveInteger = secureRandom.nextInt(difficultyRandomNumbers1, difficultyRandomNumbers2);
        int secondPositiveInteger = secureRandom.nextInt(difficultyRandomNumbers1, difficultyRandomNumbers2);
        answer = firstPositiveInteger * secondPositiveInteger;
        System.out.println("Question " + questionCount);
        System.out.println("How much is " + (firstPositiveInteger) + " * " + (secondPositiveInteger) + "?");
        confirmAnswer(scanner.nextInt());
    }

    public void displayDivisionQuestion() throws InterruptedException {
        int firstPositiveInteger = secureRandom.nextInt(difficultyRandomNumbers1, difficultyRandomNumbers2);
        int secondPositiveInteger = 1 + secureRandom.nextInt(difficultyRandomDivisionNumbers);
        int max = Math.max(firstPositiveInteger, secondPositiveInteger);
        int min = Math.min(firstPositiveInteger, secondPositiveInteger);
        if (max % min == 0) {
            addNewLine();
            questionCount++;
            answer = max / min;
            System.out.println("Question " + questionCount);
            System.out.println("How much is " + (max) + " / " + (min) + "?");
            confirmAnswer(scanner.nextInt());
        } else {
            displayDivisionQuestion();
        }
    }

    public void displayRandomQuestion() throws InterruptedException {
        int random = secureRandom.nextInt(5);
        switch (random) {
            case 1 -> {
                displayAdditionQuestion();
            }
            case 2 -> {
                displaySubtractionQuestion();
            }
            case 3 -> {
                displayMultiplicationQuestion();
            }
            case 4 -> {
                displayDivisionQuestion();
            }
        }
    }


    private void resetCounts() {
        passCount = 0;
        questionCount = 0;
    }

    public int getAnswer() {
        return answer;
    }

    public void confirmAnswer(int expectedAnswer) throws InterruptedException {
        if (expectedAnswer == getAnswer()) {
            status = Status.PASS;
            passCount++;
            System.out.println(correctResponseMessage[secureRandom.nextInt(4)]);
        } else {
            status = Status.FAIL;
            System.out.println(incorrectResponseMessage[secureRandom.nextInt(4)]);
        }
        if (questionCount == 10) {
            addNewLine();
            System.out.println(displayStudentPerformance());
            delay();
            resetCounts();
        }
    }

    public Status getStatus() {
        return status;
    }

    private void addNewLine() {
        System.out.println("""
                                
                                
                                
                    
                                
                                
                                
                                
                """);
    }

    private String displayStudentPerformance() {
        if (passCount > 7) {
            difficultyLevelCount++;
            difficultyRandomDivisionNumbers = difficultyRandomNumbers2;
            difficultyRandomNumbers1 *= 10;
            difficultyRandomNumbers2 *= 10;
            difficultyLevelMessage = "You scored " + passCount + " out of 10 questions in this level\nLevel " + difficultyLevelCount + " loading";
            return "Congratulations, you are ready to go to the next level!";
        } else {
            difficultyLevelMessage = "You scored " + passCount + " out of 10 questions in this level\nRepeating level " + difficultyLevelCount;
            return "Please ask your teacher for extra help.";
        }
    }

    public int getQuestionCount() {
        return questionCount;
    }

    private void delay() throws InterruptedException {
        System.out.print(difficultyLevelMessage);
        for (int count = 1; count <= 6; count++) {
            System.out.print(".");
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
