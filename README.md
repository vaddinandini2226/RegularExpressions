# Regular Expressions - Java

This repository contains Java programs that demonstrate the use of **Regular Expressions (Regex)** and **JUnit Testing** for validating user registration details.

## 📌 Project Description

The project validates different user inputs using Java Regular Expressions and JUnit 5.

The validation includes:

- First Name
- Last Name
- Email Address
- Mobile Number
- Password

The project also demonstrates:

- Writing JUnit Test Cases
- Parameterized JUnit Tests
- Custom Exception Handling

---

## 📂 Project Structure

```
Regex
│
├── UC1  - Validate First Name
├── UC2  - Validate Last Name
├── UC3  - Validate Email
├── UC4  - Validate Mobile Number
├── UC5  - Password Rule 1
├── UC6  - Password Rule 2
├── UC7  - Password Rule 3
├── UC8  - Password Rule 4
├── UC9  - Validate Multiple Email Addresses
├── UC10 - JUnit Test Cases for User Registration
├── UC11 - Parameterized JUnit Tests for Email Validation
├── UC12 - Refactored Code using Custom Exceptions
```

---

## 🚀 Technologies Used

- Java
- Eclipse IDE
- Regular Expressions (Regex)
- JUnit 5
- Git
- GitHub

---

## 📖 Use Cases

### UC1
Validate First Name
- Starts with a capital letter
- Minimum 3 characters

### UC2
Validate Last Name
- Starts with a capital letter
- Minimum 3 characters

### UC3
Validate Email Address

Examples:

```
abc@yahoo.com
abc-100@yahoo.com
abc.100@yahoo.com
abc111@abc.com
abc-100@abc.net
abc.100@abc.com.au
abc@1.com
abc@gmail.com.com
abc+100@gmail.com
```

---

### UC4

Validate Mobile Number

Example:

```
91 9876543210
```

---

### UC5

Password Rule 1

- Minimum 8 characters

---

### UC6

Password Rule 2

- Minimum 8 characters
- At least one Uppercase letter

---

### UC7

Password Rule 3

- Minimum 8 characters
- One Uppercase letter
- One Numeric digit

---

### UC8

Password Rule 4

- Minimum 8 characters
- One Uppercase letter
- One Numeric digit
- One Special Character

---

### UC9

Validate Multiple Email Addresses using Regex.

---

### UC10

JUnit Test Cases

Happy Test Cases

- First Name
- Last Name
- Email
- Mobile Number
- Password

Sad Test Cases

- Invalid First Name
- Invalid Last Name
- Invalid Email
- Invalid Mobile Number
- Invalid Password

---

### UC11

Parameterized JUnit Test

Validate multiple email addresses using:

- `@ParameterizedTest`
- `@ValueSource`

---

### UC12

Refactor the code to throw **Custom Exceptions** for invalid user details.

Custom Exception:

```
UserRegistrationException
```

Handles invalid:

- First Name
- Last Name
- Email
- Mobile Number
- Password

---

## ▶️ How to Run

1. Clone the repository

```
git clone https://github.com/vaddinandini2226/RegularExpressions.git
```

2. Open the project in Eclipse.

3. Run Java files as:

```
Run As → Java Application
```

4. Run JUnit test files as:

```
Run As → JUnit Test
```

---

## 📸 Sample Output

```
Runs: 18/18
Failures: 0
Errors: 0

✔ All Test Cases Passed
```

---

## 📚 Concepts Covered

- Java Regular Expressions
- Pattern.matches()
- Exception Handling
- Custom Exceptions
- JUnit 5
- Assertions
- Parameterized Testing
- Code Refactoring

---

## 👩‍💻 Author

**Vaddi Nandini**

GitHub: https://github.com/vaddinandini2226

---

⭐ If you found this repository useful, consider giving it a Star.
