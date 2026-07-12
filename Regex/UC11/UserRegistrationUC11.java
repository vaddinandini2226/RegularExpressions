package regex;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class UserRegistrationUC11 {

    UserRegistration user = new UserRegistration();

    // Happy Test Cases (Valid Emails)
    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.com",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc.100@abc.com.au",
            "abc@1.com",
            "abc@gmail.com.com",
            "abc+100@gmail.com"
    })
    void givenValidEmails_ShouldReturnTrue(String email) {
        assertTrue(user.validateEmail(email));
    }

    // Sad Test Cases (Invalid Emails)
    @ParameterizedTest
    @ValueSource(strings = {
            "abc",
            "abc@.com",
            "abc123@.com",
            "@gmail.com",
            "abc@gmail",
            "abc@gmail,com",
            "abcgmail.com",
            "abc@ gmail.com",
            "abc@@gmail.com"
    })
    void givenInvalidEmails_ShouldReturnFalse(String email) {
        assertFalse(user.validateEmail(email));
    }
}