import java.util.Stack;

public class 프로그래머스_짝지어제거하기 {
    
    public int solution(String s)
    {
        /**
         * 문자열 반복돌면서 스택에 넣기
         * 비어있으면 push
         * top과 현재문자가 같지 않다면  push
         * top과 현재문자가 같다면      pop
         * 
         * 반복 다 돌고 stack이 비어있으면 return 1
         * 있으면 return 0
         */

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            if (stack.isEmpty() || stack.peek() != c) {
                stack.push(c);
            } else {
                stack.pop();
            }
        }

        if(stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
        
    }

    public static void main(String[] args) {
        프로그래머스_짝지어제거하기 s = new 프로그래머스_짝지어제거하기();
        System.out.println(s.solution("baabaa"));
        System.out.println(s.solution("cdcd"));
    }
}
