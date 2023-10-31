package ss19.prac.class_name_validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidation {
    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";

    public static boolean checkValidation(String className) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
}
