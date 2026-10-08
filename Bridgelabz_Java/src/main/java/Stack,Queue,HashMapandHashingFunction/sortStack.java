import java.util.Stack;

public class sortStack {

    static void sortStack(Stack<Integer> stack) {

        if (stack.isEmpty()) {
            return;
        }

        int temp = stack.pop();

        sortStack(stack);

        insert(stack, temp);
    }

    static void insert(Stack<Integer> stack, int value) {

        if (stack.isEmpty() || stack.peek() > value) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();

        insert(stack, value);

        stack.push(temp);
    }

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        System.out.println("Before sorting: " + stack);

        sortStack(stack);

        System.out.println("After sorting: " + stack);

        System.out.println("Top element: " + stack.peek());
    }
}