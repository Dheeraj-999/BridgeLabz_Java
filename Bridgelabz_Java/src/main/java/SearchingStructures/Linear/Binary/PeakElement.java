public class PeakElement {

    static int findPeak(int[] arr) {
        int left = 1;
        int right = arr.length - 2;

        if (arr.length == 1) {
            return arr[0];
        }

        if (arr[0] > arr[1]) {
            return arr[0];
        }

        if (arr[arr.length - 1] > arr[arr.length - 2]) {
            return arr[arr.length - 1];
        }

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return arr[mid];
            } else if (arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };

        System.out.print(findPeak(arr));
    }
}