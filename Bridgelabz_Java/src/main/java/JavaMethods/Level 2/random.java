import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class random {

    public static int[] generate4DigitRandomArray(int size) {
        int arr[] = new int[5];

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            arr[i] = random.nextInt(9000) + 1000;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        arr = generate4DigitRandomArray(size);

        System.out.println("the 5 random numbers are " + Arrays.toString(arr));

        sc.close();
    }
}