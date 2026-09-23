import java.util.Scanner;

public class sumOfNatural {

    public static int recursion(int num) {
        if (num == 0) { // this is my base case
            return 0;
        }

        return num + recursion(num - 1);
    }

    public static int formula(int n) {

        return n * (n + 1) / 2;
    }

    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int sumRecursion = recursion(num);

        int sumFormula = formula(num);
        if (sumFormula == sumRecursion) {
            System.out.println("Both methods generate same answers");
        }
        sc.close();
    }
}