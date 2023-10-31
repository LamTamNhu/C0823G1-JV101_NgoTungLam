package ss19.prac.phone_number_validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    private static final String CLASS_NAME_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";

    public static boolean checkValidation(String phoneNumber) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
}
