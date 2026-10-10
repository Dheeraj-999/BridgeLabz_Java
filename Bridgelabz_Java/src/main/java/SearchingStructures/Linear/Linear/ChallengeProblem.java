
public class ChallengeProblem {

    static int LinearSer(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int newArr[] = new int[max + 2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                newArr[arr[i]] = 1;
            }
        }

        for (int i = 1; i < newArr.length; i++) {
            if (newArr[i] == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 6, 7 };

        System.out.print("Missing Number : " + LinearSer(arr));

    }
}