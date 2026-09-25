import java.util.Scanner;

public class numberChecker {

    public static int countDigits(int number) {
        int count = 0; // finding the count of the number;

        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;
    }

    public static int[] DigArr(int number) {
        int count = countDigits(number);
        int[] dig = new int[count];

        for (int i = count - 1; i >= 0; i--) {
            dig[i] = number % 10;
            number = number / 10; // storing in right sequence
        }

        return dig;
    }

    public static boolean duckNumber(int[] dig) {
        for (int i = 0; i < dig.length; i++) {
            if (dig[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // to find tallest height

    public static boolean isArmstrong(int[] dig) {
        int sum = 0;
        int power = dig.length;

        for (int i = 0; i < dig.length; i++) {
            sum += Math.pow(dig[i], power);
        }

        int number = 0;

        for (int i = 0; i < dig.length; i++) {
            number = number * 10 + dig[i];
        }

        return sum == number;
    }

    public static void findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE; // giving them min value

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] > largest) {
                secondLargest = largest; // largest and secondLargest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }

    public static void findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE; // for smallest giving them max value ,initializing them

        for (int i = 0; i < digits.length; i++) {
            if (digits[i] < smallest) {
                secondSmallest = smallest; // two cases
                smallest = digits[i];
            } else if (digits[i] < secondSmallest && digits[i] != smallest) {
                secondSmallest = digits[i];
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    // main function

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int count = countDigits(number);
        int[] digits = DigArr(number);

        System.out.println("Number of digits: " + count);

        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }

        System.out.println();

        System.out.println("Duck Number: " + duckNumber(digits));
        System.out.println("Armstrong Number: " + isArmstrong(digits));

        findLargest(digits);
        findSmallest(digits);

        sc.close();
    }
}