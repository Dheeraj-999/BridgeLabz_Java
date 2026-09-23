import java.util.Scanner;

public class leapYear {

    public static void checkLeap(int n) {
        if (n < 1582) {
            System.out.print("enter a valid year: ");
        } else if ((n % 4 == 0 && n % 100 != 0) || n % 400 == 0) {
            System.out.print("The " + n + " year is a Leap year");

        } else {

            System.out.print("The " + n + " year is not a Leap year");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int n = sc.nextInt();

        checkLeap(n);

        sc.close();
    }
}