import java.util.Stack;

class Solution {
    boolean solution(String s) {
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
}