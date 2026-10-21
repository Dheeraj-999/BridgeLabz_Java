
import java.util.Scanner;

public class ValidPhoneNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        String number = sc.nextLine();

        System.out.println(number.matches("^[0-9]{2} [0-9]{10}$"));

        sc.close();
    }
}