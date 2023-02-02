package chapterEight.classWork.phoneBook;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private final List <Contact> contacts = new ArrayList<>();



    public void addContact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        contacts.add(new Contact(firstName, lastName, phoneNumber, emailAddress));
    }

    public int getNumberOfContacts() {
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

    public void editContact(String oldPhoneNumber, String newFirstName, String newLastName, String newPhoneNumber, String newEmailAddress) throws FileNotFoundException {
        contacts.remove(findContactByPhoneNumber(oldPhoneNumber));
        addContact(newFirstName, newLastName, newPhoneNumber, newEmailAddress);
    }

    public void deleteContactWith(String phoneNumber) throws FileNotFoundException {
        contacts.remove(findContactByPhoneNumber(phoneNumber));
    }
}
