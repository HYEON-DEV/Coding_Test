import java.util.Arrays;
import java.util.Stack;

public class 프로그래머스_주식가격 {
    
    public int[] solution(int[] prices) {

        /**
         * 반복돌면서 (i)-(j)>0 이면 j-i, break
         * 마지막은 0
         */
        
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

    public static void main(String[] args){
        프로그래머스_주식가격 s = new 프로그래머스_주식가격();
        System.out.println(Arrays.toString(s.solution(new int[]{1,2,3,2,3})));
    }
}
