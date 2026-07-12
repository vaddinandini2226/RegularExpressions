package regex;

/*
 * UC3 - User Registration
 *
 * Problem Statement:
 * Validate the user's Email ID.
 *
 * Rules:
 * 1. Email must contain a username.
 * 2. It must contain '@'.
 * 3. It must contain a domain name.
 * 4. It must contain a valid extension like .co or .com.
 * 5. It may have an optional part before '@' (e.g., .xyz).
 * 6. It may have an optional extension after .co (e.g., .in).
 *
 * Valid Examples:
 * abc@bl.co
 * abc.xyz@bl.co
 * abc@bl.co.in
 * abc.xyz@bl.co.in
 */
import java.util.Scanner;

public class UserRegistrationUC3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Email: ");
		String s=sc.nextLine();
		System.out.println(s.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$"));
		sc.close();
	}
}
