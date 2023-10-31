package ss19.prac.class_name_validation;

public class ClassNameValidationTest {
    public static final String[] validName = new String[]{ "C0223G", "A0323K"};
    public static final String[] invalidName = new String[]{"M0318G", "P0323A"};

    public static void main(String[] args) {
        boolean isValid;
        for (String name : validName) {
            isValid = ClassNameValidation.checkValidation(name);
            System.out.println("Name: " + name + " is valid: " + isValid);
        }
        for (String name : invalidName) {
            isValid = ClassNameValidation.checkValidation(name);
            System.out.println("Name: " + name + " is valid: " + isValid);
        }
    }
}
