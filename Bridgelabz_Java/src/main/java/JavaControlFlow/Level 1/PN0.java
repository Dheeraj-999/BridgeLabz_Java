import java.util.Scanner;

public class PN0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("The number is positive");

        } else if (number == 0) {
            System.out.println("The number is zero " + number);

        } else if (number < 0) {
            System.out.println("The number is negative");

        }
        sc.close();
    }
}