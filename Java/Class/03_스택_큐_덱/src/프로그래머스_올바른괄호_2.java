import java.util.ArrayDeque;
import java.util.Deque;

public class 프로그래머스_올바른괄호_2 {
    
    public boolean solution(String s) {

        /**
         * ( 스택에 넣고
         * ) 이면 (제거
         */
        
        // 빈 스택 생성 => 여는 괄호를 저장하는 용도
        Deque<Character> deque = new ArrayDeque<>();

        // 문자열 s의 각 글자 순회
        for (char ch : s.toCharArray()) {
            if ( ch == '(') {
                deque.add(ch);
            } else {
                if (deque.isEmpty()) {
                    return false;   // ex : ()))
                } else {
                    deque.removeLast();
                }
            }
        }

        return deque.isEmpty();
    }

    public static void main(String[] args) {
        프로그래머스_올바른괄호_2 s = new 프로그래머스_올바른괄호_2();

        System.out.println(s.solution("()()"));
        System.out.println(s.solution("(())()"));
        System.out.println(s.solution(")()("));
        System.out.println(s.solution("(()("));
    }
}
