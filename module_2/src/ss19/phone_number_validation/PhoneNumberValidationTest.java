package ss19.phone_number_validation;

public class PhoneNumberValidationTest {
    public static final String[] validNumber = new String[]{"(84)-(0978489648)"};
    public static final String[] invalidNumber = new String[]{"(a8)-(22222222)", "(84)-(22b22222)", "(84)-(9978489648)"};

    public static void main(String[] args) {
        boolean isValid;
        for (String number : validNumber) {
            isValid = PhoneNumberValidation.checkValidation(number);
            System.out.println("Number: " + number + " is valid: " + isValid);
        }
        for (String number : invalidNumber) {
            isValid = PhoneNumberValidation.checkValidation(number);
            System.out.println("Number: " + number + " is valid: " + isValid);
        }
    }
}
