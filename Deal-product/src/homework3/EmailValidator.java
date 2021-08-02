package homework3;

import java.util.regex.Pattern;

public class EmailValidator implements Validator {

    private static final Pattern emailValidator = Pattern.compile("([\\w\\-\\.]+)@([\\w\\-]+\\.)([a-zA-Z]{2,4})");

    @Override
    public Pattern getPattern() {
        return emailValidator;
    }
}
