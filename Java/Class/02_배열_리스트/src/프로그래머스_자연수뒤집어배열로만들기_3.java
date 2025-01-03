import java.util.Arrays;

public class 프로그래머스_자연수뒤집어배열로만들기_3 {
    
    class Solution {
        public int[] solution(long n) {
            String str = new StringBuilder(String.valueOf(n)).reverse().toString();

            return str.chars().map( c -> c - '0' ).toArray();
        }
    }

    public static void main(String[] args) {
        Solution s = new 프로그래머스_자연수뒤집어배열로만들기_3().new Solution();

        System.out.println(Arrays.toString(s.solution(12345)));
    }

}
