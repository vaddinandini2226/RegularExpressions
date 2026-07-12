
package regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateFirstName(String firstName) {
		return Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
	}

	public boolean validateLastName(String lastName) {
		return Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
	}

	public boolean validateEmail(String email) {
		return Pattern.matches(
				"^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$",
				email);
	}

	public boolean validateMobile(String mobile) {
		return Pattern.matches("^[0-9]{2}\\s[0-9]{10}$", mobile);
	}

	public boolean validatePassword(String password) {
		return Pattern.matches(
				"^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&+=!]).{8,}$",
				password);
	}
}

