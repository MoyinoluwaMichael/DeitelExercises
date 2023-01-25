package chapterEight.selfAssessment.phoneBook;

import java.util.Arrays;

public class Contact {

    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        validatePhoneNumber(phoneNumber);
        validateEmailAddress(emailAddress);
        name = firstName+" "+lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void editContactName(String firstName, String lastName) {
        name = firstName+" "+lastName;
    }

    @Override
    public String toString(){
        return String.format("""
                =================================
                Name: %s
                Phone number: %s
                Email address: %s
                =================================""", name, phoneNumber, emailAddress);
    }

    public String getName() {
        return name;
    }

    public void editContactPhoneNumber(String phoneNumber) {
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    }

    private void validatePhoneNumber(String phoneNumber) {
        char [] numbers = {'0','1','2','3','4','5','6','7','8','9'};
        for (int i = 0; i < phoneNumber.length(); i++) {
            int count = 0;
            for (char each : numbers) {
                if (each == phoneNumber.charAt(i)){
                    count++;
                }
            }
            if (count == 0){
                throw new IllegalArgumentException("Phone number contains invalid character. Number must be between 0 and 9");
            }
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void editContactEmailAddress(String newEmailAddress) {
        validateEmailAddress(newEmailAddress);
        this.emailAddress = newEmailAddress;
    }

    private void validateEmailAddress(String newEmailAddress) {
        String [] split = newEmailAddress.split("@");
        if (!split[1].equalsIgnoreCase("gmail.com") && !split[1].equalsIgnoreCase("yahoo.com")){
            throw new IllegalArgumentException("Invalid email address");
        }
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
