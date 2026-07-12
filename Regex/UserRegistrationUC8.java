package regex;
import java.util.Scanner;
/*
 * UC8 - User Registration
 *
 * Validate the user's Password.
 *
 * Rule 1:
 * 1. Password should contain a minimum of 8 characters.
 * 2. Password should contain atleast 1 upper case Character
 * 3. Password should contain atleast 1 Numeric Character
 * 4. Password should contain atleast 1 special Character
 */
public class UserRegistrationUC8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user Password : ");
		String s=sc.nextLine();
		System.out.println(s.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.{8,}$)(?=[A-Za-z0-9]*[^A-Za-z0-9][A-Za-z0-9]*$).*$"));
		sc.close();
	}
}
