import java.util.Arrays;

public class 프로그래머스_자연수뒤집어배열로만들기 {
    
    class Solution {
        public int[] solution(long n) {
            String str = String.valueOf(n);
            int end = str.length();
            int[] answer = new int[end];            

            for(int i=0; i<end; i++) {
                answer[i] = Character.getNumericValue(str.charAt(end-i-1));
            }
            System.out.println(end);

            return answer;
        }
    }

    public static void main(String[] args) {
        Solution s = new 프로그래머스_자연수뒤집어배열로만들기().new Solution();

        System.out.println(Arrays.toString(s.solution(12345)));
    }

}
