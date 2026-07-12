package regex;

import java.util.regex.Pattern;

// Custom Exception Class
class UserRegistrationException extends Exception {

    public UserRegistrationException(String message) {
        super(message);
    }
}

// User Registration Class
public class UserRegistrationAll {

    public boolean validateFirstName(String firstName) throws UserRegistrationException {

        if (Pattern.matches("^[A-Z][a-z]{2,}$", firstName))
            return true;

        throw new UserRegistrationException("Invalid First Name");
    }

    public boolean validateLastName(String lastName) throws UserRegistrationException {

        if (Pattern.matches("^[A-Z][a-z]{2,}$", lastName))
            return true;

        throw new UserRegistrationException("Invalid Last Name");
    }

    public boolean validateEmail(String email) throws UserRegistrationException {

        if (Pattern.matches(
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$",
                email))
            return true;

        throw new UserRegistrationException("Invalid Email");
    }

    public boolean validateMobile(String mobile) throws UserRegistrationException {

        if (Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", mobile))
            return true;

        throw new UserRegistrationException("Invalid Mobile Number");
    }

    public boolean validatePassword(String password) throws UserRegistrationException {

        if (Pattern.matches(
                "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$",
                password))
            return true;

        throw new UserRegistrationException("Invalid Password");
    }
}