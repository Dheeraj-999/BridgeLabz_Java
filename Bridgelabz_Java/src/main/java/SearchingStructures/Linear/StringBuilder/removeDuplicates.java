import java.util.*;

public class removeDuplicates {
    public static void main(String[] args) {

        String str = "Hello";

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            if (!set.contains(str.charAt(i))) {
                sb.append(str.charAt(i));
                set.add(str.charAt(i));
            }
        }

        System.out.println(sb.toString());

    }
}