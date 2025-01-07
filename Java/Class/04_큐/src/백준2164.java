import java.util.LinkedList;
import java.util.Queue;

public class 백준2164 {

    public int solution(int N) {
        Queue<Integer> myQueue = new LinkedList<>();

        for (int i=1; i<=N; i++) {
            myQueue.add(i);
        }

        while (myQueue.size() > 1) {
            myQueue.poll();
            myQueue.add(myQueue.poll());
        }

        return myQueue.peek();
    }

    public static void main(String[] args) {
        백준2164 s = new 백준2164();
        System.out.println(s.solution(6));
    }
}
