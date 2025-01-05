import java.util.Stack;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<prices.length-1; i++) {
            for (int j=i+1; j<prices.length; j++) {
                if(prices[i]-prices[j] > 0 || j==prices.length-1) {
                    stack.push(j-i);
                    break;
                }
            }
        }
        stack.push(0);

        return stack.stream().mapToInt(i -> i).toArray();
    }
}