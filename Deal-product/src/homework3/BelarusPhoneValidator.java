package homework3;

import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

    private static final Pattern belarusPhoneValidator = Pattern.compile("(\\+375)(17|29|44|33|25)(-\\d{3}-\\d{2}-\\d{2})");

    @Override
    public Pattern getPattern() {
        return belarusPhoneValidator;
    }
}