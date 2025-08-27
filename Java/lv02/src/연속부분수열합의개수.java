/*
반복문 {
    길이 1 => HashSet 추가
    길이 2 => 0-1 1-2 2-3 3-4 4-1 조합 HashSet 추가
    길이 3 => 0-2  1-3  2-4  3,4,0  4,0,1
    ...
    길이 elements.length => HashSet 추가
    HashSet.size 리턴
}
 */

import java.util.HashSet;
import java.util.Set;

public class 연속부분수열합의개수 {

    public static int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        int start = 1;
        while (start <= elements.length) {      // 시간 복잡도: O(n)
            for (int i=0; i<elements.length; i++) {     // 시간 복잡도: O(n)
                int value = 0;
                for (int j=i; j<i+start; j++) {     // 
                    value += elements[j%elements.length];
                    System.out.printf("j=%d, e[%d]=%d  ", j, j%elements.length, value);
                }
                set.add(value);
                System.out.println(set);
            }
            start++;
        }   // 전체 시간 복잡도는 O(n^3)
        
        return set.size();
    }

    public static int solution2(int[] elements) {
        Set<Integer> set = new HashSet<>();

        for (int i=0; i<elements.length; i++) {     // O(n)
            int sum = 0;
            for (int j=0; j<elements.length; j++) {     // O(n)
                sum += elements[(i+j)%elements.length];
                set.add(sum);
            }
        }   // O(n^2)
        
        return set.size();
    }

    public static void main(String[] args) {
        // System.out.println(solution(new int[] {7,9,1,1,4}));
        System.out.println(solution2(new int[] {7,9,1,1,4}));
    }
}
