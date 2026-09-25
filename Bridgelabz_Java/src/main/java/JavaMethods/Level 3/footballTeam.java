import java.util.Scanner;
import java.util.Random;

public class footballTeam {

    // a function to find sum of all heights
    public static int sumOfElements(int[] heights) {
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum = sum + heights[i];
        }
        return sum;
    }

    // method for finding mean value

    public static int meanHeight(int[] heights) {
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            sum = sum + heights[i];
        }
        return sum / heights.length; // finding mean
    }

    // to find shortest height

    public static int shortestHeight(int[] heights) {
        int shortest = 0;
        for (int i = 1; i < 11; i++) {
            if (heights[i] < heights[shortest]) {
                shortest = i;
            }
        }
        return heights[shortest];
    }

    // to find tallest height

    public static int tallestHeight(int[] heights) {
        int tallest = 0;
        for (int i = 1; i < 11; i++) {
            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }
        return heights[tallest];
    }

    // main function

    public static void main(String[] args) {
        Random random = new Random();

        Scanner sc = new Scanner(System.in);
        int[] heights = new int[11];

        for (int i = 0; i < 11; i++) {

            heights[i] = random.nextInt(101) + 150; // generating random numbers of 3 digits between 150 to 250;

        }

        int sum = sumOfElements(heights);
        int mean = meanHeight(heights);
        int shortest = shortestHeight(heights);
        int tallest = tallestHeight(heights);

        for (int i = 0; i < 11; i++) {
            System.out.println("the height of player " + (i + 1) + " is: " + heights[i]);
        }

        System.out.println(sum); // calling the methods
        System.out.println(mean);
        System.out.println(shortest);
        System.out.println(tallest);

        sc.close();
    }
}