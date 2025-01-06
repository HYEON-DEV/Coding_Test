import java.util.ArrayDeque;
import java.util.Deque;

public class 프로그래머스_짝지어제거하기_2 {
    
    public int solution(String s)
    {
        /**
         * 문자열 반복돌면서 stack 준비
         * 비어있으면 첫번째 문자 넣기
         * 그 다음 문자와 스택의 맨 위의 요소와 비교하며 
         * 같으면 stack 맨 위의 요소 제거
         */

        Deque<Character> deque = new ArrayDeque<>();

        // for(char c : s.toCharArray()) {
        //     deque.addFirst(c);
        //     System.out.println(deque);
        // }

        for(char c : s.toCharArray()) {
            if (!deque.isEmpty() && deque.peekFirst()==c) {
                deque.pollFirst();
            } else {
                deque.addFirst(c);
            }
        }

        return deque.isEmpty()? 1 : 0;
    }

    public static void main(String[] args) {
        프로그래머스_짝지어제거하기_2 s = new 프로그래머스_짝지어제거하기_2();
        System.out.println(s.solution("baabaa"));
        System.out.println(s.solution("cdcd"));
    }
}
