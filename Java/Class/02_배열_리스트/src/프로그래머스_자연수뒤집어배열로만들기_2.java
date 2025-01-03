import java.util.Arrays;

public class 프로그래머스_자연수뒤집어배열로만들기_2 {
    
    class Solution {
        public int[] solution(long n) {
            char[] c = String.valueOf(n).toCharArray();

            int size = c.length;
            int half = size/2;

            for(int i=0; i<half; i++) {
                int p = size-i-1;

                char temp = c[i];
                c[i] = c[p];
                c[p] = temp;
            }
            
            int[] answer = new int[size];
            for(int i=0; i<size; i++) {
                answer[i] = c[i] - '0';
            }

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new 프로그래머스_자연수뒤집어배열로만들기_2().new Solution();

        System.out.println(Arrays.toString(s.solution(93847)));
    }

}
