import java.util.HashSet;
import java.util.Set;

public class UnionnIntersection {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);

        findUnion(set1, set2);
        findIntersection(set1, set2);

    }

    static <T> void findUnion(Set<T> set1, Set<T> set2) {
        Set<T> setUnion = new HashSet<>(set1);

        setUnion.addAll(set2);

        System.out.println(setUnion);

    }

    static <T> void findIntersection(Set<T> set1, Set<T> set2) {
        Set<T> setIntersection = new HashSet<>(set1);

        setIntersection.retainAll(set2);

        System.out.println(setIntersection);

    }
}
