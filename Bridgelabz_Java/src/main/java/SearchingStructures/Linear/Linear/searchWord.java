
public class searchWord {

    static String LinearSearch(String[] arr, String word) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains(word)) {
                return arr[i];
            }
        }

        return "Not Found";
    }

    public static void main(String[] args) {

        String[] arr = {
                "programming language",
                "I am doing searching",
                "Java supports oops",
                "Linear search is easy"
        };

        String word = "Java";

        System.out.println(LinearSearch(arr, word));
    }
}