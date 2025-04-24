/*
for(배열) {
    큐1 <= 큐2.poll()
    if(큐1.가짓수 == 큐2.가짓수) {
        result++;
    }
}
 */

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 롤케이크자르기 {

    public int solution(int[] topping) {
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q1 = new LinkedList<>();
        for (int i: topping) {
            q2.add(i);
        }
        // System.out.println(q2);

        int result = 0;
        int cnt1, cnt2;
        while (true) {  // ⏰ 시간복잡도는 O(N²)
            q1.add(q2.poll());
            System.out.printf("q1: %s,  q2: %s \n", q1, q2);

            cnt1 = (int) Arrays.stream(q1.toArray(new Integer[0])).distinct().count();
            // q1.toArray(new Integer[0])는 O(N)
            // stream().distinct()는 내부적으로 HashSet을 써서 O(N)
            // Queue 두 개, toArray() 내부 복사 등도 불필요한 메모리를 많이 사용한다 
            cnt2 = (int) Arrays.stream(q2.toArray(new Integer[0])).distinct().count();
            
            if (cnt1 > cnt2) break;
            
            if (cnt1 == cnt2) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        롤케이크자르기 s = new 롤케이크자르기();
        System.out.println(s.solution(new int[] {1, 2, 1, 3, 1, 4, 1, 2}));
        System.out.println();
        System.out.println(s.solution(new int[] {1,2,3,1,4}));
    }
}
