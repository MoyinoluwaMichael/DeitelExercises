package chapterEight.classWork.diary;

import javax.swing.*;

public class Main {
    private static Diary myDiary = new Diary();
    public static void main(String[] args) {
        gotoMainMenu();
    }

    private static void gotoMainMenu() {
        String mainMenu = """
                1 -> Create Entry
                2 -> View Entry
                3 -> Delete Entry
                4 -> Check Number of Entries Created
                5 -> Edit Entry
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> createEntry();
            case '2' -> viewEntry();
            case '3' -> deleteEntry();
            case '4' -> checkNumberOfEntriesCreated();
            case '5' -> editEntry();
            default -> gotoMainMenu();
        }

    }
    private static void createEntry() {
        String entryTitle = input("Enter the title of your Entry");
        String entryBody = input("Enter the body of your Entry");
        try{
            myDiary.createEntry(entryTitle, entryBody);
        }catch (NullPointerException e){
            display(e.getMessage());
            gotoMainMenu();
        }
        gotoMainMenu();
    }
    private static void viewEntry(){
        String idNumber = input("Enter Entry ID number");
        try{
            String entry = myDiary.viewEntryAt(Integer.parseInt(idNumber));
            display(entry);
        }catch (NullPointerException e){
            display(e.getMessage());
            gotoMainMenu();
        }
        gotoMainMenu();
    }
    private static void deleteEntry(){
        String idNumber = input("Enter Entry ID number");
        int id = Integer.parseInt(idNumber);
        String title = "";
        try{
            title = myDiary.getEntryTitle(id);
            myDiary.deleteEntryAt(id);
        }catch (NullPointerException e){
            display(e.getMessage());
            gotoMainMenu();
        }
        display("Entry titled "+title+" has been deleted successfully!");
        gotoMainMenu();
    }
    private static void checkNumberOfEntriesCreated(){
        int numberOfEntries = 0;
        try{
            numberOfEntries = myDiary.getNumberOfEntriesCreated();
        }catch (NullPointerException e){
            display(e.getMessage());
            gotoMainMenu();
        }
        display("Total number of entries in your diary is "+numberOfEntries);
        gotoMainMenu();
    }
    private static void editEntry(){
        String idNumber = input("Enter Entry ID number");
        String entry = "";
        try{
            entry = myDiary.viewEntryAt(Integer.parseInt(idNumber));
        }catch (NullPointerException e){
            display(e.getMessage());
            gotoMainMenu();
        }
        display(entry);
        String newEntryBody = input("Enter the new body of your entry");
        myDiary.editEntryAt(Integer.parseInt(idNumber), newEntryBody);
        gotoMainMenu();
    }
    private static String input(String prompt) {
        return JOptionPane.showInputDialog(prompt);
    }

    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private static void exitApplication() {
        display("Bye bye");
        System.exit(1);
    }

}
