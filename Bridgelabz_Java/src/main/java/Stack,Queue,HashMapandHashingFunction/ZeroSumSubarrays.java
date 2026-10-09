
import java.util.*;

public class ZeroSumSubarrays {

    static void findSubarrays(int[] arr) {

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == 0) {
                System.out.println("0 to " + i);
            }

            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    System.out.println((start + 1) + " to " + i);
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 2, -2, 3, 1, -4 };

        findSubarrays(arr);
    }
}