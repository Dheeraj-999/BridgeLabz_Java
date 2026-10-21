
import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidFirstName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = sc.next();

        String regex = "^[A-Z][a-zA-Z]{2,}$";

        if (Pattern.matches(regex, firstName)) {
            System.out.println("Valid first name ");

        } else {
            System.out.println("not valid ");

        }

    }
}
