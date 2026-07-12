package regex;
import java.util.Scanner;
/*
 * UC7 - User Registration
 *
 * Validate the user's Password.
 *
 * Rule 1:
 * 1. Password should contain a minimum of 8 characters.
 * 2. Password should contain atleast 1 upper case Character
 * 3. Password should contain atleast 1 Numeric Character
 */
public class UserRegistrationUC7 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user Password : ");
		String s=sc.nextLine();
		System.out.println(s.matches("^(?=.*[A-Z])(?=.*[0-9]).{8,}$"));
		sc.close();
	}
}
