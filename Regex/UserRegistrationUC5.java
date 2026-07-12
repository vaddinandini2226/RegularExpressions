package regex;

import java.util.Scanner;
/*
 * UC5 - User Registration
 *
 * Validate the user's Password.
 *
 * Rule 1:
 * 1. Password should contain a minimum of 8 characters.
 */
public class UserRegistrationUC5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user Password : ");
		String s=sc.nextLine();
		System.out.println(s.matches("^.{8,}$"));
		sc.close();

	}
}
