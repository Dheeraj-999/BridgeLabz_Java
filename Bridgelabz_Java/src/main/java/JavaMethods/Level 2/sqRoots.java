import java.util.Scanner;

public class sqRoots {

    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;

        double root1[] = new double[2];
        if (delta > 0) {
            root1[0] = (-b + Math.sqrt(delta)) / (2 * a);
            root1[1] = (-b - Math.sqrt(delta)) / (2 * a);
        } else if (delta == 0) {
            root1[0] = -b / (2 * a);
        }
        return root1;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number a: ");
        double a = sc.nextDouble();

        System.out.println("Enter number b: ");
        double b = sc.nextDouble();

        System.out.println("Enter number c: ");
        double c = sc.nextDouble();

        double arr[] = new double[2];
        arr = findRoots(a, b, c);

        if (arr[0] > 0 && arr[1] > 0 || arr[0] < 0 && arr[1] < 0 || arr[0] > 0 && arr[1] < 0
                || arr[0] < 0 && arr[1] > 0) {
            System.out.println("The first root is : " + arr[0]);
            System.out.println("The first root is : " + arr[1]);

        } else if (arr[0] > 0 && arr[1] == 0 || arr[0] < 0 && arr[1] == 0) {
            System.out.println("The roots are eqaul and are : " + arr[0] + "and " + arr[0]);

        } else {
            System.out.println("No roots are there ");

        }

        sc.close();
    }
}
