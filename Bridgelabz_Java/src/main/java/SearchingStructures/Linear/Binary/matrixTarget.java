public class matrixTarget {
    static boolean findTarget(int arr[][], int target) {

        int rows = arr.length;
        int cols = arr[0].length;

        int st = 0;
        int end = rows * cols - 1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            int row = mid / cols;
            int col = mid % cols;

            if (arr[row][col] == target) {
                return true;
            } else if (arr[row][col] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        int target = 19;

        System.out.print("Found: " + findTarget(arr, target));

    }
}