import java.util.Stack;

public class 프로그래머스_올바른괄호 {
    
    public boolean solution(String s) {

        Stack<Character> stack = new Stack<>();
        
        for (char i : s.toCharArray()) {
            if (i=='(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        } 

        return stack.isEmpty()? true : false;
    }

    public static void main(String[] args) {
        프로그래머스_올바른괄호 s = new 프로그래머스_올바른괄호();

        System.out.println(s.solution("()()"));
        System.out.println(s.solution("(())()"));
        System.out.println(s.solution(")()("));
        System.out.println(s.solution("(()("));
    }
}
