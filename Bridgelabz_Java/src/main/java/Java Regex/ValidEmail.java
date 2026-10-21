import java.util.Scanner;

public class ValidEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter email: ");
        String email = sc.next();

        System.out.println(email.matches("^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]+$"));

        sc.close();
    }
}
