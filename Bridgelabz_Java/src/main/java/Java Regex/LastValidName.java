
import java.util.Scanner;
import java.util.regex.Pattern;

public class LastValidName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        if (Pattern.matches(regex, lastName)) {
            System.out.println("Valid Last Name");
        } else {
            System.out.println("Invalid Last Name");
        }

        sc.close();
    }
}
