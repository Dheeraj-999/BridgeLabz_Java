
public class PeakElement {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 8, 7, 6, 5 };
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (mid == 0 || arr[mid] > arr[mid - 1]) {
                if (mid == arr.length - 1 || arr[mid] > arr[mid + 1]) {
                    System.out.println("Peak element: " + arr[mid]);
                    return;
                }
            }

            if (mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
    }
}
