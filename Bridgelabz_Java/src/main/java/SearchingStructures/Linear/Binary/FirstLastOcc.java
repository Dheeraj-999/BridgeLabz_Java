
public class FirstLastOcc {

    static int findFirstOcc(int[] arr, int target) {

        int st = 0;
        int end = arr.length - 1;
        int first = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                first = mid;
                end = mid - 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return first;
    }

    static int findLastOcc(int[] arr, int target) {

        int st = 0;
        int end = arr.length - 1;
        int last = -1;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] == target) {
                last = mid;
                st = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return last;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 6, 6, 7 };
        int target = 6;

        System.out.print("First Occ: " + findFirstOcc(arr, target));
        System.out.print("Last Occ: " + findLastOcc(arr, target));

    }
}