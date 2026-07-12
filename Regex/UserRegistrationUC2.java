package regex;
import java.util.Scanner;
/*
 * UC2 - User Registration
 *
 * Problem Statement:
 * As a User, I need to enter a valid Last Name.
 *
 * Acceptance Criteria:
 * 1. Last Name should start with a capital letter.
 * 2. It should contain only alphabets.
 * 3. It should have a minimum of 3 characters.
 *
 * Examples:
 * Valid   : Ram, Nandini, Rahul
 * Invalid : ram, RA, R1m, R@m
 */
public class UserRegistrationUC2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user Last name: ");
		String s=sc.nextLine();
		System.out.println(s.matches("^[A-Z][A-Za-z]{2,}"));
		sc.close();
	}

}
