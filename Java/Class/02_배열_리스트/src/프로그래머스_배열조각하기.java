import java.util.Arrays;

public class 프로그래머스_배열조각하기 {
    
    /**
     * 5 ≤ arr의 길이 ≤ 100,000  =>  95000
     *      0 ≤ arr의 원소 ≤ 100    =>  100     9500000
     * 1 ≤ query의 길이 < min(50, arr의 길이 / 2)
     *      query의 각 원소는 0보다 크거나 같고 남아있는 arr의 길이 보다 작습니다.
     */
    
    class Solution {
        public int[] solution(int[] arr, int[] query) {
            int[] answer = {};

            for (int i=0; i<query.length; i++) {  //  n
                if (i%2==0) {
                    arr = Arrays.copyOfRange(arr, 0, query[i]+1);   //  n
                } else {
                    arr = Arrays.copyOfRange(arr, query[i], arr.length);  //  n
                }
            }   // n^2

            answer = arr;

            return answer;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};
        int[] query = {4,1,2};
        Solution s = new 프로그래머스_배열조각하기().new Solution();
        System.out.println(Arrays.toString(s.solution(arr,query)));
    }
}
