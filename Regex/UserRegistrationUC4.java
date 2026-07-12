package regex;

import java.util.Scanner;

/*
 * UC4 - User Registration
 *
 * Validate the user's Mobile Number.
 *
 * Rules:
 * 1. Country code should be 91.
 * 2. One space after the country code.
 * 3. Mobile number should contain 10 digits.
 * 4. Mobile number should start with 6, 7, 8, or 9.
 *
 * Example:
 * Valid : 91 9919819801
 * Invalid: 919919819801, 91-9919819801, 91 1234567890
 */
public class UserRegistrationUC4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile number: ");
		String s=sc.nextLine();
		System.out.println(s.matches("^91\\s[6-9]\\d{9}$"));
		sc.close();
	}
}
