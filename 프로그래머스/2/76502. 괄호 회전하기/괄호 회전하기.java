import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(String s) {
        int count = 0;
        char[] chars = s.toCharArray();
        // System.out.println(chars);
        int len = chars.length;

        for (int i=0; i<len; i++) {
            if (isValid(chars, i)) {
                count++;
            }
        }

        return count;
    }

    private boolean isValid(char[] chars, int offset) {
        Deque<Character> dq = new ArrayDeque<>();
        int len = chars.length;

        for (int i=0; i<len; i++) {
            char ch = chars[(i+offset) % len];

            if (ch=='(' || ch=='[' || ch=='{') {
                dq.push(ch);
            } else {
                if (dq.isEmpty()) return false;

                char open = dq.pop();
                
                if (!isPair(open, ch)) return false;
            }
        }

        return dq.isEmpty();
    }

    private boolean isPair (char open, char close) {
        return (open=='(' && close==')') ||
               (open=='[' && close==']') ||
               (open=='{' && close=='}');               
    }
}