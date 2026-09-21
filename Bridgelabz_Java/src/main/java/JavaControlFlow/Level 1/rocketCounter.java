import java.util.Scanner;

public class rocketCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter counter: ");
        int counter = sc.nextInt();

        while (counter >= 1) {
            System.out.println(counter);
            counter--;

        }
        sc.close();
    }

}
