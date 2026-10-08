import java.util.HashMap;

public class TwoSum {
    static void twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> m = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];

            if (m.containsKey(needed)) {
                System.out.println(m.get(needed) + " " + i);
                return;
            }

            m.put(arr[i], i);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 7, 11, 15 };
        int target = 17;

        twoSum(arr, target);
    }
}