import java.util.Scanner;

public class UC5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        String password = sc.nextLine();

        boolean minlenght = password.length() >= 8;
        boolean Uppercase = password.matches(".*[A-Z].*");
        boolean digit = password.matches(".*\\d.*");
        boolean specialChar = password.matches("^[A-Za-z0-9]*[^A-Za-z0-9][A-Za-z0-9]*$");

        if (minlenght && Uppercase && digit && specialChar) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid");
        }

        sc.close();
    }
}