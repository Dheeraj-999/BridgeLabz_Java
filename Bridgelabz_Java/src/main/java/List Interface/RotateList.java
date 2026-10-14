
import java.util.ArrayList;
import java.util.List;

public class RotateList {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        rotate(arr, 2);

        System.out.print(arr);

    }

    static void rotate(List<Integer> list, int num) {

        num = num % list.size();

        for (int i = 0; i < num; i++) {
            int temp = list.get(0);
            list.remove(0);
            list.add(temp);
        }

    }

}