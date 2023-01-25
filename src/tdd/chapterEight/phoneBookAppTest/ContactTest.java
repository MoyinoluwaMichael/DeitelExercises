package tdd.chapterEight.phoneBookAppTest;

import chapterEight.selfAssessment.phoneBook.Contact;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContactTest {
    Contact contact;

    @BeforeEach
    public void startEachExecutionWith(){
        contact = new Contact("James", "Okafor", "08146400010", "Jamesokafor@gmail.com");
    }

    @Test
    public void testThatYouCanCheckAContactInformation(){
        String contactInformation = """
                =================================
                Name: James Okafor
                Phone number: 08146400010
                Email address: Jamesokafor@gmail.com
                =================================""";
        assertEquals(contactInformation, contact.toString());
    }

    @Test
    public void testThatContactNameCanBeEdited(){
        String newName = "James Bond";
        contact.editContactName("James", "Bond");
        assertEquals(newName, contact.getName());
    }
    @Test
    public void testThatContactPhoneNumberCanBeEdited(){
        String newPhoneNumber = "08089649909";
        contact.editContactPhoneNumber("08089649909");
        assertEquals(newPhoneNumber, contact.getPhoneNumber());
    }
    @Test
    public void phoneNumberContainingAnyOtherCharacterOtherThanIntegersThrowsExceptionTest(){
        assertThrows(IllegalArgumentException.class, ()-> contact.editContactPhoneNumber("0808dg9649909"));
    }
    @Test
    public void testThatContactEmailAddressCanBeEdited(){
        String newEmailAddress = "jamesbond@gmail.com";
        contact.editContactEmailAddress(newEmailAddress);
        assertEquals(newEmailAddress, contact.getEmailAddress());
    }
    @Test
    public void emailAddressNotEndingWithAtGmailOrYahooDotComThrowsExceptionTest(){
        assertThrows(IllegalArgumentException.class, ()-> contact.editContactEmailAddress("jamesbond@hfe.com"));
    }


}