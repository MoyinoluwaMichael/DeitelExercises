package chapterEight.classWork.phoneBook;

import chapterSix.selfAssessment.beautifyingStrings.BeautifyStrings;

import java.io.FileNotFoundException;
import java.io.Serializable;
import java.rmi.AccessException;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook implements Serializable {
    private final List <Contact> contacts = new ArrayList<>();
    private boolean isLocked = true;
    private String username;
    private String password;

    public PhoneBook(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void addContact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        contacts.add(new Contact(firstName, lastName, phoneNumber, emailAddress));
    }


    public int getNumberOfContacts(){
        return contacts.size();
    }

    public Contact findContactByPhoneNumber(String phoneNumber) throws FileNotFoundException {
        for (Contact contact: contacts) {
            if (contact.getPhoneNumber().equals(phoneNumber)){
                return contact;
            }
        }
        throw new FileNotFoundException("Contact does not exist");
    }

    public void editContact(String oldPhoneNumber, String newFirstName, String newLastName, String newPhoneNumber,
                            String newEmailAddress) throws FileNotFoundException {
        contacts.remove(findContactByPhoneNumber(oldPhoneNumber));
        addContact(newFirstName, newLastName, newPhoneNumber, newEmailAddress);
    }

    public void deleteContactWith(String phoneNumber) throws FileNotFoundException {
        contacts.remove(findContactByPhoneNumber(phoneNumber));
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void lock() {
        isLocked = true;
    }

    public void unlock(String username, String password) {
        if (isLocked){
            validatePhonebookSecurityDetails(username, password);
            isLocked = false;
        }
        else {
            throw new IllegalArgumentException("Phonebook is already unlocked");
        }
    }

    private void validatePhonebookSecurityDetails(String username, String password) {
        validateUsername(username);
        validatePassword(password);
    }

    private void validatePassword(String password) {
        if (this.password.equals(password)){
            return;
        }
        throw new IllegalArgumentException("Password is incorrect!");
    }

    private void validateUsername(String username) {
        if (this.username.equalsIgnoreCase(username)){
            return;
        }
        throw new IllegalArgumentException("Username is incorrect!");
    }
    public String getUsername(){
        return BeautifyStrings.capitalizeFirstLetter(username);
    }

    public void checkIfItIsLocked() throws AccessException {
        if (!isLocked()) {
            return;
        }
        throw new AccessException("Phonebook is locked");
    }

    public String getPassword() {
        return password;
    }
}
