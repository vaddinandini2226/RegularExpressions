package regex;

import java.util.regex.Pattern;

public class UserRegistrationEmail {

    // Method to validate Email Address
    public boolean validateEmail(String email) {
        return Pattern.matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$",
                email);
    }
}