import java.util.Arrays;

public class 프로그래머스_배열조각하기_2 {
    
    class Solution {
        public int[] solution(int[] arr, int[] query) {
            for(int i=0; i<query.length; i++) {
                if (i%2==0) {
                    arr = Arrays.copyOfRange(arr, i, i)
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int[] query = {4,1,2};
        Solution s = new 프로그래머스_배열조각하기_2().new Solution();
        System.out.println(Arrays.toString(s.solution(arr,query)));
    }
}
