
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class frequency {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>();
        str.add("apple");
        str.add("orange");
        str.add("banana");
        str.add("apple");

        Map<String, Integer> result = freq(str);

        System.out.println(result);

    }

    static Map<String, Integer> freq(List<String> list) {
        Map<String, Integer> map = new HashMap<>();

        for (String fruit : list) {
            if (map.containsKey(fruit)) {
                map.put(fruit, map.get(fruit) + 1);
            } else {
                map.put(fruit, 1);
            }
        }
        return map;

    }
}
