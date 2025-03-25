import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 괄호회전하기 {

    public int solution(String s) {
        int cnt = 0;
        Queue<String> queue = new LinkedList<>();

        for (int i=0; i<s.length(); i++) {
            String str = s.substring(i, i+1);
            queue.add(str);
        }
        // System.out.println(queue);

        Stack<String> stack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            String first = queue.poll();
            queue.add(first);

            stack.clear();

            for (int j=0; j<s.length(); j++) {
                String wait = queue.poll();
                queue.add(wait);

                if (stack.isEmpty()) {
                    stack.push(wait);
                } else if (wait.equals(")") && stack.peek().equals("(")) {
                    stack.pop();
                } else if (wait.equals("]") && stack.peek().equals("[")) {
                    stack.pop();
                } else if (wait.equals("}") && stack.peek().equals("{")) {
                    stack.pop();
                } else {
                    stack.push(wait);
                }
            }

            if (stack.isEmpty()) {
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        괄호회전하기 s = new 괄호회전하기();
        System.out.println(s.solution("[](){}"));
        System.out.println(s.solution("}]()[{"));
        System.out.println(s.solution("[)(]"));
        System.out.println(s.solution("}}}"));
    }
}
