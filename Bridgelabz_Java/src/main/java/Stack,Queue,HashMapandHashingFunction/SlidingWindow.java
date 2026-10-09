
import java.util.*;

public class SlidingWindow {
    static int[] window(int[] arr, int k) {

        int[] maxArr = new int[arr.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            while (!deque.isEmpty() && arr[deque.peekLast()] <= arr[i]) {
                deque.pollLast();
            }
            deque.offerLast(i);
        }
        maxArr[0] = arr[deque.peekFirst()];

        for (int i = k; i < arr.length; i++) {

            while (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && arr[i] >= deque.peekLast()) {
                deque.pollLast();
            }

            deque.addLast(i);

            maxArr[i - k + 1] = arr[deque.peekFirst()];
        }
        return maxArr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        int[] result = window(arr, k);

        System.out.println(Arrays.toString(result));
    }
}