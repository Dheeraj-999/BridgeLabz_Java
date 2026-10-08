import java.util.HashMap;

public class LongestConsequence {
    static int LongCons(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int max = 0;

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            if (!map.containsKey(arr[i] - 1)) {
                int count = 1;
                int next = num + 1;

                while (map.containsKey(next)) {
                    count++;
                    next++;
                }

                max = Math.max(max, count);
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] arr = { 100, 4, 200, 1, 3, 2 };

        System.out.println(LongCons(arr));
    }
}
