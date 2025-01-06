import java.util.*;

public class 프로그래머스_같은숫자는싫어_2 {
    
    public Deque<Integer> solution(int[] arr) {
        /**
         * 배열arr 크기가 100만 이하이므로 2중반복문은 안된다는 뜻
         * 배열의 길이를 늘려하는게 있으면 적어도 자바에서는 배열이 정답이 아니라는 뜻
         * 예시 ) 쿠폰적용, 중복X
         */

        // 결과를 저장할 덱
        Deque<Integer> answer = new ArrayDeque<>();

        // 이전 숫자를 저장할 변수 previous를 -1로 초기화
        int previous = -1;  // => 첫 번째 숫자와 비교할 때 사용

        for (int num : arr) {  // 향상된 for문
            if (num != previous) {
                answer.add(num);
                previous = num;
            }
        }
        
        return answer;
    }      

    public static void main(String[] args) {
        프로그래머스_같은숫자는싫어_2 s = new 프로그래머스_같은숫자는싫어_2();
        System.out.println(s.solution(new int[]{1,1,3,3,0,1,1}));
        System.out.println(s.solution(new int[]{4,4,4,3,3}));
    }
    
}
