package login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Account {
    private static Pattern pattern;

    private static final String Account_REGEX ="^[A-Za-z0-9]+$";

    public Account() {
        pattern = Pattern.compile(Account_REGEX);
    }

    public boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}