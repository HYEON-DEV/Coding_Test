import java.util.LinkedList;
import java.util.Queue;

public class 프로세스 {
    
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        
        // Queue에 index와 priority를 함께 저장
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(new int[]{i, priorities[i]});
        }

        int count = 0;
        
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            boolean hasHigherPriority = false;

            // 현재 큐에 더 높은 우선순위가 있는지 확인
            for (int[] q : queue) {
                if (q[1] > current[1]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.offer(current); // 다시 큐 뒤로
            } else {
                count++; // 실행됨
                if (current[0] == location) {
                    return count;
                }
            }
        }

        return -1; // 이론상 도달 불가
    }

}
