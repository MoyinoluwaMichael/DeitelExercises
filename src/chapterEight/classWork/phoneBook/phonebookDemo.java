package chapterEight.classWork.phoneBook;

import javax.swing.*;
import java.io.*;
import java.rmi.AccessException;

public class phonebookDemo {
    private static PhoneBook phonebook = new PhoneBook("M", "1");

    public static void main(String[] args) throws IOException {
        try{
            FileInputStream file = new FileInputStream("f.txt");
            ObjectInputStream obj = new ObjectInputStream(file);
            phonebook = (PhoneBook) obj.readObject();
            obj.close();
        }
        catch (Exception e){display(e.getMessage());}
        gotoMainMenu();
    }

    private static void gotoMainMenu() throws IOException {
        display(String.valueOf(phonebook.getNumberOfContacts()));
        display("Your password is "+phonebook.getPassword());
        String mainMenu = """
                1 => Add Contact
                2 => View Contact
                3 => Delete Contact
                4 => Check Number of Contacts in Phonebook
                5 => Edit Contact
                6 => Lock Contact
                7 => Unlock Contact
                8 => Exit
                """;
        String userInput = input(mainMenu);
        switch (userInput.charAt(0)) {
            case '1' -> addContact();
            case '2' -> viewContact();
            case '3' -> deleteContact();
            case '4' -> CheckNumberOfContactsInPhonebook();
            case '5' -> editContact();
            case '6' -> lockContact();
            case '7' -> unlockContact();
            case '8' -> exitApp();
            default -> gotoMainMenu();
        }
    }

    private static void exitApp() throws IOException {
        try{
            FileOutputStream out = new FileOutputStream("f.txt");
            ObjectOutputStream obj = new ObjectOutputStream(out);
            obj.writeObject(phonebook);
            display("Serialized");
            obj.flush();
            obj.close();
        }
        catch (NotSerializableException e){
            display(e.getMessage());
        }
        display("Thank you for using this app");
        System.exit(1);
    }

    private static void addContact() throws IOException {
        checkIfPhonebookIsLocked("1");
        String firstName = input("Enter first name");
        String lastName = input("Enter last name");
        String phoneNumber = input("Enter phone number");
        String emailAddress = input("Enter email address");
        try {
            phonebook.addContact(firstName, lastName, phoneNumber, emailAddress);
        } catch (IllegalArgumentException e) {
            display(e.getMessage());
            gotoMainMenu();
        }
        display("Contact has been added successfully!");
        gotoMainMenu();
    }

    private static void viewContact() throws IOException {
        checkIfPhonebookIsLocked("2");
        String phoneNumber = input("Enter phone number");
        try {
            display(phonebook.findContactByPhoneNumber(phoneNumber).toString());
        } catch (FileNotFoundException e) {
            display(e.getMessage());
            gotoMainMenu();
        }
        gotoMainMenu();
    }

    private static void deleteContact() throws IOException {
        checkIfPhonebookIsLocked("3");
        String phoneNumber = input("Enter phone number");
        try {
            phonebook.deleteContactWith(phoneNumber);
        } catch (FileNotFoundException e) {
            display(e.getMessage());
            gotoMainMenu();
        }
        display("Contact specified has been deleted successfully");
        gotoMainMenu();
    }

    private static void CheckNumberOfContactsInPhonebook() throws IOException {
        checkIfPhonebookIsLocked("4");
        display(String.format("""
                Dear %s, you have %s contact(s) in your phonebook
                """, phonebook.getUsername(), phonebook.getNumberOfContacts()));
        gotoMainMenu();
    }

    private static void editContact() throws IOException {
        checkIfPhonebookIsLocked("5");
        String oldPhoneNumber = input("Enter phonenumber of the contact you want to edit");
        try {
            phonebook.findContactByPhoneNumber(oldPhoneNumber);
        } catch (FileNotFoundException e) {
            display(e.getMessage());
            gotoMainMenu();
        }
        String newFirstName = input("Enter first name");
        String newLastName = input("Enter last name");
        String newPhoneNumber = input("Enter phone number");
        String newEmailAddress = input("Enter email address");
        try {
            phonebook.editContact(oldPhoneNumber, newFirstName, newLastName, newPhoneNumber, newEmailAddress);
        } catch (FileNotFoundException e) {
            display(e.getMessage());
            gotoMainMenu();
        }
        display("Contact specified has been edited successfully!");
        gotoMainMenu();
    }

    private static void lockContact() throws IOException {
        checkIfPhonebookIsLocked("6");
        phonebook.lock();
        display("Phonebook is now locked");
        gotoMainMenu();
    }

    private static void unlockContact() throws IOException {
        checkIfPhonebookIsLocked("7");
        String username = input("Enter phonebook username");
        String password = input("Enter phonebook password");
        try {
            phonebook.unlock(username, password);
        } catch (IllegalArgumentException e) {
            display(e.getMessage());
            gotoMainMenu();
        }
        display("Phonebook is now unlocked");
        gotoMainMenu();
    }

    private static String input(String prompt) {
        String userInput = JOptionPane.showInputDialog(prompt);
        if (userInput.equals("")) {
            display("Invalid input. Try again");
            return ".";
        }
        return userInput;
    }

    private static void checkIfPhonebookIsLocked(String userInput) throws IOException {
        String message = "";
        if (userInput.charAt(0) == '6') {
            message = "Phonebook is already locked alaye";
        } else {
            message = "Phonebook is locked, unlock and try again.";
        }
        if (userInput.charAt(0) != '7') {
            try {
                phonebook.checkIfItIsLocked();
            } catch (AccessException e) {
                display(message);
                gotoMainMenu();
            }
        }
    }

    private static void display(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
