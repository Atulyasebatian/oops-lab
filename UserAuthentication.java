import java.util.Scanner;

class InvalidCredentialsException extends Exception {
    public InvalidCredentialsException(String message) {
        super(message);
    }
}

class UserAuthentication {

    private String validUsername = "athulya";
    private String validPassword = "athulya@123";

    public void authenticate(String username, String password) throws InvalidCredentialsException {
        if (!username.equals(validUsername) || !password.equals(validPassword)) {
            throw new InvalidCredentialsException("Invalid username or password!");
        } else {
            System.out.println("Authentication successful!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserAuthentication auth = new UserAuthentication();

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        try {
            auth.authenticate(username, password);
        } catch (InvalidCredentialsException e) {
            System.out.println(e.getMessage());
        }
    }
}





(base) ksb@ksb-H410M-H-V2:~/athulya/oops$ javac UserAuthentication.java
(base) ksb@ksb-H410M-H-V2:~/athulya/oops$ java UserAuthentication 
Enter username: aahana
Enter password: athulya@123
Authentication successful!


Enter username: athulya
Enter password: athulya123
Invalid username or password!
  
