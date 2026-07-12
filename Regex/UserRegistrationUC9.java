package regex;

import java.util.Scanner;

/*
 * UC - Email Validation
 *
 * Rules:
 * 1. Username starts with letter or digit.
 * 2. Username may contain '.', '-', '_', '+'.
 * 3. Username cannot start/end with '.'.
 * 4. Consecutive dots are not allowed.
 * 5. Exactly one '@'.
 * 6. Domain should not start with '.'.
 * 7. Last TLD should contain only alphabets and minimum 2 characters.
 * 8. Multiple subdomains are allowed.
 */

public class UserRegistrationUC9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Email: ");
        String email = sc.nextLine();

        String regex =
                "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        System.out.println(email.matches(regex));

        sc.close();
    }
}