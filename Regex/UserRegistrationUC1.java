package regex;

/*
 * UC1 - User Registration
 *
 * Problem Statement:
 * As a User, I need to enter a valid First Name.
 *
 * Acceptance Criteria:
 * 1. First Name should start with a capital letter.
 * 2. It should contain only alphabets.
 * 3. It should have a minimum of 3 characters.
 *
 * Examples:
 * Valid   : Ram, Nandini, Rahul
 * Invalid : ram, RA, R1m, R@m
 */
import java.util.Scanner;
public class UserRegistrationUC1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name: ");
		String s=sc.nextLine();
		System.out.println(s.matches("^[A-Z][A-Za-z]{2,}"));
		sc.close();
	}

}
