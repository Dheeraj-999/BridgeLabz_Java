import java.util.Stack;

public class stockSpan {

    static void findSpan(int[] price) {
        Stack<Integer> s = new Stack<>();
        int[] span = new int[price.length];

        for (int i = 0; i < price.length; i++) {

            while (!s.isEmpty() && price[s.peek()] < price[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - s.peek();
            }

            s.push(i);

        }

        for (int i = 0; i < span.length; i++) {
            System.out.print(span[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] price = { 100, 80, 60, 70, 60, 75, 85 };
        findSpan(price);
    }
}