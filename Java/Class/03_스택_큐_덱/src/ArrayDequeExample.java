import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();

        stack.push(1);
        stack.push(2);

        System.out.println(stack.pop());    
        System.out.println(stack.peek());   
        System.out.println(stack.size());
        System.out.println(stack.isEmpty());

        
        Deque<Integer> deque = new ArrayDeque<>();
        System.out.println(deque);

        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque);

        System.out.println(deque.removeFirst());
        System.out.println(deque);

        System.out.println(deque.removeLast());
        System.out.println(deque);

        System.out.println(deque.size());
        System.out.println(deque.isEmpty());
    }
}