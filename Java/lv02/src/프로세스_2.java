import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 프로세스_2 {
    
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();

        for (int i=0; i<priorities.length; i++) {
            queue.offer(new int[] {i, priorities[i]});
        }
        
        int cnt = 0;
        // System.out.println(Arrays.toString(queue.poll()));
        // System.out.println(Arrays.deepToString(queue.toArray()));
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            System.out.printf("cur: %s \n", Arrays.toString(current));
            boolean hasHigherPriority = false;

            for (int[] q : queue) {
                System.out.printf("q: %s \n", Arrays.toString(q));
                if (q[1] > current[1]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.offer(current);
                System.out.println(Arrays.deepToString(queue.toArray()));
            } else {
                cnt++;
                System.out.printf("cnt: %d \n", cnt);
                if (current[0] == location) {
                    return cnt;
                }
            }
        }

        return -1; // 이론상 도달 불가
    }

    public static void main(String[] args) {
        프로세스_2 s = new 프로세스_2();
        System.out.println(s.solution(new int[] {2, 1, 3, 2}, 2));
        System.out.println();
        System.out.println(s.solution(new int[] {1, 1, 9, 1, 1, 1}, 0));
    }
}
