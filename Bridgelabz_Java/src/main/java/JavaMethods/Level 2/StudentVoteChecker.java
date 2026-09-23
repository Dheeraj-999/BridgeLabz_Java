import java.util.Scanner;

public class StudentVoteChecker {

    public static boolean canStudentVote(int n) {
        if (n < 18 || n < 0) {
            return false;
        } else {

            return true;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter student " + (i + 1) + " age : ");
            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < 10; i++) {
            if (canStudentVote(arr[i])) {
                System.out.println("The student with age" + arr[i] + " can vote");

            } else {
                System.out.println("Sorry,The student with age" + arr[i] + " cannot vote.");

            }
        }

        System.out.print("Enter : ");
        int n = sc.nextInt();

        canStudentVote(n);

        sc.close();
    }
}