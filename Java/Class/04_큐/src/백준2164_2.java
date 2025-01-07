import java.util.ArrayDeque;
import java.util.Deque;

public class 백준2164_2 {

    public int solution(int N) {
        Deque<Integer> myDeque = new ArrayDeque<>();

        for (int i=1; i<=N; i++) {
            myDeque.add(i);
        }

        while (myDeque.size() > 1) {
            myDeque.poll();
            myDeque.add(myDeque.poll());
        }

        return myDeque.peek();
    }

    public static void main(String[] args) {
        백준2164_2 s = new 백준2164_2();
        System.out.println(s.solution(6));
    }
}
