package homework3;

import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

    private static final Pattern americanPhoneValidator = Pattern.compile("\\+\\d\\-\\d{3}-\\d{3}-\\d{4}");
    @Override
    public Pattern getPattern() {
        return americanPhoneValidator;
    }
}