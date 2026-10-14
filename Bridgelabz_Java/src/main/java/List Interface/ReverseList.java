
import java.util.ArrayList;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {

        ArrayList<Integer> arrlist = new ArrayList<>();
        arrlist.add(1);
        arrlist.add(2);
        arrlist.add(3);
        arrlist.add(4);

        reverseList(arrlist);
        System.out.println("Array list: " + arrlist);

        ArrayList<Integer> linkedlist = new ArrayList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);

        reverseList(linkedlist);
        System.out.println("Linked list: " + linkedlist);
    }

    static void reverseList(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}
