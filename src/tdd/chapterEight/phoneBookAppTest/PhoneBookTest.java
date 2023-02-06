package tdd.chapterEight.phoneBookAppTest;

import chapterEight.classWork.phoneBook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.rmi.AccessException;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    PhoneBook phoneBook;

    @BeforeEach
    public void startWith() throws AccessException {
        phoneBook = new PhoneBook("Moyin", "Moyin1234");
        phoneBook.unlock("moyin", "Moyin1234");
        phoneBook.addContact("Ugo", "James", "08146400010", "ugojames@gmail.com");
    }

    @Test
    public void contactCanBeAddedToPhoneBookTest() throws AccessException {assertEquals(1, phoneBook.getNumberOfContacts());
    }

    @Test
    public void contactCanBeFoundByPhoneNumberTest() throws FileNotFoundException, AccessException {
        String expected = """
                =================================
                Name: Ugo James
                Phone number: 08146400010
                Email address: ugojames@gmail.com
                =================================""";
        assertEquals(expected, phoneBook.findContactByPhoneNumber("08146400010").toString());
    }
    @Test
    public void contactCanBeEditedAfterCreationTest() throws FileNotFoundException, AccessException {
        phoneBook.editContact("08146400010", "Moyinoluwa", "Michael", "08089649909", "ogunsmoyin.m@gmail.com");
        String expected = """
                =================================
                Name: Moyinoluwa Michael
                Phone number: 08089649909
                Email address: ogunsmoyin.m@gmail.com
                =================================""";
        assertEquals(1, phoneBook.getNumberOfContacts());
        assertEquals(expected, phoneBook.findContactByPhoneNumber("08089649909").toString());
    }
    @Test
    public void contactCanBeDeletedAfterCreationTest() throws FileNotFoundException, AccessException {
        phoneBook.addContact("Adekunle", "Ajasin", "08167917371", "adekunleajasin@gmail.com");
        phoneBook.deleteContactWith("08146400010");
        assertEquals(1, phoneBook.getNumberOfContacts());
    }
    @Test
    public void contactThatDoesNotExistThrowExceptionTest(){
        assertThrows(FileNotFoundException.class, ()-> phoneBook.findContactByPhoneNumber("08100935776"));
    }
    @Test
    public void phoneNumberHavingMoreThan11LengthAndNumberContainingLetterThrowsExceptionTest(){
        assertThrows(IllegalArgumentException.class, ()-> phoneBook.addContact(
                "Adekunle", "Ajasin", "081675456917371", "adekunleajasin@gmail.com"));
        assertThrows(IllegalArgumentException.class, ()-> phoneBook.addContact(
                "Adekunle", "Ajasin", "0819sdfgh171", "adekunleajasin@gmail.com"));
    }
    @Test
    public void emailAddressWithoutGmailOrYahooDotComThrowsException(){
        assertThrows(IllegalArgumentException.class, ()-> phoneBook.addContact(
                "Adekunle", "Ajasin", "08034257384", "adekunleajasin"));
    }
    @Test
    public void phonebookCanBeLockedTest() throws AccessException {
        phoneBook.lock();
        assertTrue(phoneBook.isLocked());
    }
    @Test
    public void phonebookCanBeUnlockedWithUsernameAndPasswordTest() throws AccessException {
        phoneBook.lock();
        phoneBook.unlock("moyin", "Moyin1234");
        assertFalse(phoneBook.isLocked());
    }
    @Test
    public void unlockingPhonebookWhenItIsAlreadyUnlockedThrowsException(){
        assertThrows(IllegalArgumentException.class, ()-> phoneBook.unlock("moyin", "Moyin1234"));
    }
    @Test
    public void unlockingPhonebookWithInvalidSecurityDetailsThrowsException(){
        assertThrows(IllegalArgumentException.class, ()-> phoneBook.unlock("Moyin", "moyin1234"));
    }

}
