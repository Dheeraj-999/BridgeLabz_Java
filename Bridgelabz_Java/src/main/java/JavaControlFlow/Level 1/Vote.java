import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter persons age: ");
        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("The persons age is " + age + " and can vote");

        } else {
            System.out.println("The persons age is " + age + " and cannot vote");

        }
        sc.close();
    }
}