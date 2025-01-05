import java.util.*;

public class 프로그래머스_같은숫자는싫어 {
    
    public int[] solution(int[] arr) {

        Stack<Integer> stack = new Stack<>();
        
        for (int i : arr) {
            if(stack.empty() || !stack.peek().equals(i)) {
                stack.push(i);
            }
        }
        
        return stack.stream().mapToInt(i -> i).toArray();
    }      

    public static void main(String[] args) {
        프로그래머스_같은숫자는싫어 s = new 프로그래머스_같은숫자는싫어();
        System.out.println(Arrays.toString(s.solution(new int[]{1,1,3,3,0,1,1})));
        System.out.println(Arrays.toString(s.solution(new int[]{4,4,4,3,3})));
    }
    
}
