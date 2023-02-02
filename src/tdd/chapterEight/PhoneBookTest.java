package tdd.chapterEight;

import chapterEight.classWork.phoneBook.PhoneBook;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {

    PhoneBook phoneBook;

    @BeforeEach
    public void startWith() {
        phoneBook = new PhoneBook();
        phoneBook.addContact("Ugo", "James", "08146400010", "ugojames@gmail.com");
    }

    @Test
    public void contactCanBeAddedToPhoneBookTest(){assertEquals(1, phoneBook.getNumberOfContacts());
    }

    @Test
    public void contactCanBeFoundByPhoneNumberTest() throws FileNotFoundException {
        String expected = """
                =================================
                Name: Ugo James
                Phone number: 08146400010
                Email address: ugojames@gmail.com
                =================================""";
        assertEquals(expected, phoneBook.findContactByPhoneNumber("08146400010").toString());
    }
    @Test
    public void contactCanBeEditedAfterCreationTest() throws FileNotFoundException {
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
    public void contactCanBeDeletedAfterCreationTest() throws FileNotFoundException {
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

}
