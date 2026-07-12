package regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class UserRegistrationUC12 {

    UserRegistration user = new UserRegistration();

    // First Name

    @Test
    void givenValidFirstName_ShouldReturnTrue() throws UserRegistrationException {

        assertTrue(user.validateFirstName("Nandini"));
    }

    @Test
    void givenInvalidFirstName_ShouldThrowException() {

        Exception exception = assertThrows(UserRegistrationException.class, () -> {
            user.validateFirstName("nandini");
        });

        assertEquals("Invalid First Name", exception.getMessage());
    }

    // Last Name

    @Test
    void givenValidLastName_ShouldReturnTrue() throws UserRegistrationException {

        assertTrue(user.validateLastName("Vaddi"));
    }

    @Test
    void givenInvalidLastName_ShouldThrowException() {

        Exception exception = assertThrows(UserRegistrationException.class, () -> {
            user.validateLastName("vaddi");
        });

        assertEquals("Invalid Last Name", exception.getMessage());
    }

    // Email

    @Test
    void givenValidEmail_ShouldReturnTrue() throws UserRegistrationException {

        assertTrue(user.validateEmail("abc@gmail.com"));
    }

    @Test
    void givenInvalidEmail_ShouldThrowException() {

        Exception exception = assertThrows(UserRegistrationException.class, () -> {
            user.validateEmail("abcgmail.com");
        });

        assertEquals("Invalid Email", exception.getMessage());
    }

    // Mobile

    @Test
    void givenValidMobile_ShouldReturnTrue() throws UserRegistrationException {

        assertTrue(user.validateMobile("91 9876543210"));
    }

    @Test
    void givenInvalidMobile_ShouldThrowException() {

        Exception exception = assertThrows(UserRegistrationException.class, () -> {
            user.validateMobile("9876543210");
        });

        assertEquals("Invalid Mobile Number", exception.getMessage());
    }

    // Password

    @Test
    void givenValidPassword_ShouldReturnTrue() throws UserRegistrationException {

        assertTrue(user.validatePassword("Password@1"));
    }

    @Test
    void givenInvalidPassword_ShouldThrowException() {

        Exception exception = assertThrows(UserRegistrationException.class, () -> {
            user.validatePassword("password");
        });

        assertEquals("Invalid Password", exception.getMessage());
    }
}