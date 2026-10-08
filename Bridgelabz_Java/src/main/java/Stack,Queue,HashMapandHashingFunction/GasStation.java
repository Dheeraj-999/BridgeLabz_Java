
import java.util.LinkedList;
import java.util.Queue;

public class GasStation {
    static int findStart(int[] gas, int[] cost) {
        Queue<Integer> q = new LinkedList<>();
        int totalgas = 0;
        int totalcost = 0;

        for (int i = 0; i < gas.length; i++) {
            totalgas += gas[i];
            totalcost += cost[i];
        }

        if (totalcost > totalgas) {
            return -1;
        }

        int currGas = 0;
        int start = 0;

        for (int i = 0; i < gas.length; i++) {
            q.add(i);
        }

        while (!q.isEmpty()) {

            int pump = q.remove();

            currGas = currGas + gas[pump] - cost[pump];

            if (currGas < 0) {
                start = pump + 1;
                currGas = 0;
            }

            if (start > gas.length) {
                return -1;
            }

        }
        return start;
    }

    public static void main(String[] args) {
        int[] gas = { 4, 6, 7, 4 };
        int[] cost = { 6, 5, 3, 5 };

        int start = findStart(gas, cost);

        System.out.println("Starting index: " + start);
    }
}