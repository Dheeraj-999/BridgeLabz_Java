import java.util.Scanner;

public class aaa {

    public static int findYoungest(int[] ages) {

        int youngest = 0;

        for (int i = 1; i < ages.length; i++) {

            if (ages[i] < ages[youngest]) {
                youngest = i;
            }
        }

        return youngest;
    }

    public static int findTallest(int[] heights) {

        int tallest = 0;

        for (int i = 1; i < heights.length; i++) {

            if (heights[i] > heights[tallest]) {
                tallest = i;
            }
        }

        return tallest;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] friends = { "Amar", "Akbar", "Anthony" };

        int[] ages = new int[3];
        int[] heights = new int[3];

        for (int i = 0; i < 3; i++) {

            System.out.print("Enter age of " + friends[i] + ": ");

            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + friends[i] + ": ");
            heights[i] = sc.nextInt();
        }

        int youngest = findYoungest(ages);
        int tallest = findTallest(heights);

        System.out.println("Youngest friend = " + friends[youngest]);
        System.out.println("Tallest friend = " + friends[tallest]);

        sc.close();
    }
}