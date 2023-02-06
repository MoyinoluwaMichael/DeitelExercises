package chapterEight.classWork.phoneBook;

import chapterSix.selfAssessment.beautifyingStrings.BeautifyStrings;

public class Contact {

    private String name;
    private String phoneNumber;
    private String emailAddress;

    public Contact(String firstName, String lastName, String phoneNumber, String emailAddress) {
        validatePhoneNumber(phoneNumber);
        validateEmailAddress(emailAddress);
        name = BeautifyStrings.capitalizeFirstLetter(firstName) + " " + BeautifyStrings.capitalizeFirstLetter(lastName);
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public void editContactName(String firstName, String lastName) {
        name = firstName + " " + lastName;
    }

    @Override
    public String toString() {
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
        validateNumberLength(phoneNumber);
        validateNumberContent(phoneNumber);
    }

    private void validateNumberContent(String phoneNumber) {
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < phoneNumber.length(); i++) {
            boolean isFound = false;
            for (char each : numbers) {
                if (each == phoneNumber.charAt(i)) {
                    isFound = true;
                }
            }
            if (!isFound) {
                throw new IllegalArgumentException("Phone number contains invalid character. Number must be between 0 and 9");
            }
        }
    }

    private void validateNumberLength(String phoneNumber) {
        if (phoneNumber.length() > 11) {
            throw new IllegalArgumentException("Phone number must be of 11 length");
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
        String[] split = newEmailAddress.split("@");
        if (split.length != 2 || (!split[1].equalsIgnoreCase("gmail.com") && !split[1].equalsIgnoreCase("yahoo.com"))) {
            throw new IllegalArgumentException("Invalid email address. Valid email contains @gmail.com pr @yahoo.com");
        }
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
