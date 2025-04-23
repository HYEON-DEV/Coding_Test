/*
for(배열) {
    큐1 <= 큐2.poll()
    if(큐1.가짓수 == 큐2.가짓수) {
        result++;
    }
}
 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class 롤케이크자르기_2 {

    public int solution(int[] topping) {
        Set<Integer> set1 = new HashSet<>();
        // for (int i: topping) {
        //     q2.add(i);
        // }
        // System.out.println(q2);
        // System.out.println(q2.poll());
        // System.out.println(q2);

        int result = 0;
        int cnt1, cnt2;
        for (int i=0; i<topping.length-1; i++) {
            System.out.printf("q1: %s,  q2: %s \n", q1, q2);
            q1.add(q2.poll());

            cnt1 = (int) Arrays.stream(q1.toArray(new Integer[0])).distinct().count();
            // if ()
        }

        int answer = -1;
        return answer;
    }

    public static void main(String[] args) {
        롤케이크자르기_2 s = new 롤케이크자르기_2();
        System.out.println(s.solution(new int[] {1, 2, 1, 3, 1, 4, 1, 2}));
        // System.out.println();
        // System.out.println(new int[] {1,2,3,1,4});
    }
}
