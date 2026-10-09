import java.util.*;

public class FirstNegative {
    static int LinearSer(int arr[]) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 3, 1, -5, 8 };
        System.out.print(LinearSer(arr));
    }
}