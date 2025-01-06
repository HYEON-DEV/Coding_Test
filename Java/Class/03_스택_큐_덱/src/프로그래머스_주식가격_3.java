import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class 프로그래머스_주식가격_3 {
    
    public int[] solution(int[] prices) {

        /**
         * prices 10만 이하 이므로 배열 2중반복문 안된다
         * 인덱스번호로 접근할때는 배열이 가장 빠르고
         * 길이가 정해져 있으므로 배열로 리턴한다 ⭐
         * 인덱스 접근은 배열이 가장 빠르다 ⭐
         * 
         * 1 2 3 2 3
         * 가격이 떨어지지 않으면 인덱스 저장
         * i=0 : stack 0     
         * i=1 : (1>2) : stack 1 0
         * i=2 : (2>3) : stack 2 1 0
         * i=3 : (3>2) : answer[2]=3-2=1 : stack 
         * i=4 : ()
         */
        
        int n = prices.length;
        int[] answer = new int[n];  
        Deque<Integer> stack = new ArrayDeque<>(); // ArrayDeque를 스택처럼 사용
        
        for (int i=0; i<n; i++) {
            // 현재 가격이 스택 상단 인덱스의 가격보다 낮으면 처리
            while(!stack.isEmpty() && prices[stack.getFirst()] > prices[i]) {
                int idx = stack.removeFirst(); // 스택에서 첫 번째 요소 제거
                answer[idx] = i-idx; // 유지 시간 계산
            }
            stack.addFirst(i);  // 현재 인덱스를 스택에 추가
        }

        // 스택에 남아 있는 인덱스 처리 (끝까지 가격 유지)
        while (!stack.isEmpty()) {
            int idx = stack.removeFirst();  // 스택에서 첫 번째 요소 제거
            answer[idx] = n - idx - 1;  // 남은 시간 계산
        }

        return answer;
    }

    public static void main(String[] args){
        프로그래머스_주식가격_3 s = new 프로그래머스_주식가격_3();
        System.out.println(Arrays.toString(s.solution(new int[]{1,2,3,2,3})));
    }
}
