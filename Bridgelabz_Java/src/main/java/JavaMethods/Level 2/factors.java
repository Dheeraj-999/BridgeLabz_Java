import java.util.Scanner;

public class factors {

    public static int[] totalFac(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }

        return factors;
    }

    // am finding sum here;.

    public static int findSum(int[] factors) {
        int sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum = sum + factors[i];
        }

        return sum;
    }

    // am finding product here;.

    public static int findProduct(int[] factors) {
        int product = 1;

        for (int factor : factors) {
            product = product * factor;
        }

        return product;
    }

    // now i am finding sum of sqaures

    public static double findSumOfSquares(int[] factors) {
        double sum = 0;

        for (int i = 0; i < factors.length; i++) {
            sum = sum + factors[i] * factors[i];
        }

        return sum;
    }

    //
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int num = sc.nextInt();

        int[] factors = totalFac(num);

        System.out.print("Factors are: ");

        for (int factor : factors) {
            System.out.print(factor + " ");
        }

        int sum = findSum(factors);

        int product = findProduct(factors);

        double sumOfSquares = findSumOfSquares(factors);

        System.out.println("Sum of factors = " + sum);

        System.out.println("Product of factors = " + product);
        System.out.println("Sum of squares of factors = " + sumOfSquares);

        sc.close();
    }
}