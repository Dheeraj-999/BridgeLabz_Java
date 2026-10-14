import java.util.HashSet;
import java.util.Set;

public class SymmetryDifference {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        findDiff(set1, set2);

    }

    static <T> void findDiff(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        Set<T> common = new HashSet<>(set1);

        result.addAll(set2);
        common.retainAll(set2);

        result.removeAll(common);
        System.out.println(result);

    }
}
