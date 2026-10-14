import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();

        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        removeDup(arr);

    }

    static void removeDup(List<Integer> lists) {
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer element : lists) {
            if (!list.contains(element)) {
                list.add(element);
            }
        }
        System.out.print(list);

    }
}
