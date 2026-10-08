import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    void push(int val) {
        while (!s1.empty()) {
            s2.push(s1.peek());
            s1.pop();
        }
        s1.push(val);

        while (!s2.empty()) {
            s1.push(s2.peek());
            s2.pop();
        }
    }

    int pop() {
        int x = s1.peek();
        s1.pop();
        return x;
    }

    int peak() {
        return s1.peek();
    }

    boolean empty() {
        return s1.empty();
    }

}

public class QueueUsingStack {
    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();
        queue.push(10);
        System.out.println("pushed 10");
        queue.push(20);
        System.out.println("pushed 20");

        queue.push(30);
        System.out.println("pushed 30");

        queue.pop();
        System.out.println("top element " + queue.peak());

    }
}
