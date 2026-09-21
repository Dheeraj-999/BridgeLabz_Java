import java.util.Scanner;

public class NaturalNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        int sum = number * ((number + 1) / 2);

        if (number > 0) {
            System.out.println("The sum of " + number + " natural numbers is" + sum);
        } else {
            System.out.println("The number " + number + " is not a natural number");
        }
        sc.close();
    }
}