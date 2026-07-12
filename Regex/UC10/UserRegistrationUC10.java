package regex;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationUC10 {

    UserRegistration user = new UserRegistration();

    @Test
    void givenValidFirstName_ShouldReturnTrue() {
        assertTrue(user.validateFirstName("Nandini"));
    }

    @Test
    void givenInvalidFirstName_ShouldReturnFalse() {
        assertFalse(user.validateFirstName("nandini"));
    }

    @Test
    void givenValidLastName_ShouldReturnTrue() {
        assertTrue(user.validateLastName("Vaddi"));
    }

    @Test
    void givenInvalidLastName_ShouldReturnFalse() {
        assertFalse(user.validateLastName("vaddi"));
    }

    @Test
    void givenValidEmail_ShouldReturnTrue() {
        assertTrue(user.validateEmail("abc@gmail.com"));
    }

    @Test
    void givenInvalidEmail_ShouldReturnFalse() {
        assertFalse(user.validateEmail("abcgmail.com"));
    }

    @Test
    void givenValidMobile_ShouldReturnTrue() {
        assertTrue(user.validateMobile("91 9876543210"));
    }

    @Test
    void givenInvalidMobile_ShouldReturnFalse() {
        assertFalse(user.validateMobile("9876543210"));
    }

    @Test
    void givenValidPassword_ShouldReturnTrue() {
        assertTrue(user.validatePassword("Password@1"));
    }

    @Test
    void givenInvalidPassword_ShouldReturnFalse() {
        assertFalse(user.validatePassword("password"));
    }
}