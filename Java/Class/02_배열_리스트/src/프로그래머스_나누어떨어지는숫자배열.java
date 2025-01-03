import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class 프로그래머스_나누어떨어지는숫자배열 {
    
    class Solution {
        public int[] solution(int[] arr, int divisor) {

            List<Integer> result = new ArrayList<Integer>();

            for(int i=0; i<arr.length; i++){
                if (arr[i]%divisor == 0) {
                    result.add(arr[i]);
                }
            }

            Collections.sort(result);

            int[] answer = {};

            if (result.size() > 0) {
                answer = new int[result.size()];
                for(int i=0; i<result.size(); i++) {
                    answer[i] = result.get(i);
                }
            } else {
                answer = new int[1];
                answer[0] = -1;
            }
            
            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new 프로그래머스_나누어떨어지는숫자배열().new Solution();

        System.out.println(Arrays.toString(s.solution(new int[]{5,9,7,10}, 5)));
        System.out.println(Arrays.toString(s.solution(new int[]{2,36,1,3}, 1)));
        System.out.println(Arrays.toString(s.solution(new int[]{3,2,6}, 10)));
    }
}
