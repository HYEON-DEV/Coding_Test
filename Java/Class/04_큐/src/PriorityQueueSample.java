import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueSample {
    public static void main(String[] args) {

        /** 우선순위 큐 (Priority Queue) (2) */
        
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());

        heap.add(10);
        heap.add(5);
        heap.add(20);
        heap.add(1);

        System.out.println(Arrays.toString(heap.toArray()));

        while (!heap.isEmpty()) {
            System.out.println(heap.poll());
        }
    }
}
