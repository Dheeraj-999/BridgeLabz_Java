
public class smallestNum {

    static int findSmall(int[] arr) {

        int st = 0;
        int end = arr.length - 1;
        int ans = Integer.MAX_VALUE;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            if (arr[mid] >= arr[st]) {
                ans = Math.min(ans, arr[st]);
                st = mid + 1;
            } else {
                ans = Math.min(ans, arr[mid]);
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };

        System.out.print(findSmall(arr));

    }
}