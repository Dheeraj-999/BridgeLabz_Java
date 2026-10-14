import java.util.*;

public class ConvertSetIntoList {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();

        set1.add(5);
        set1.add(1);
        set1.add(3);
        set1.add(2);
        set1.add(4);

        findConvert(set1);

    }

    static <T extends Comparable<T>> void findConvert(Set<T> set1) {
        List<T> list = new ArrayList<>(set1);

        Collections.sort(list);

        System.out.println(list);

    }
}
