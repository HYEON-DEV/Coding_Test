public class 최댓값과_최솟값 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        // Solution 클래스의 인스턴스 생성

        String str1 = "1 2 3 4";
        String str2 = "-1 -2 -3 -4";
        String str3 = "-1 -1";
        
        System.out.println(solution.solution(str1));
        System.out.println(solution.solution(str2));
        System.out.println(solution.solution(str3));
    }
}

class Solution {
    public String solution(String s) {

        String[] arr = s.split(" ");
        
        int[] arrInt = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            arrInt[i] = Integer.parseInt(arr[i]);
        }

        int max = arrInt[0];
        int min = arrInt[0];

        for (int i=1; i<arrInt.length; i++) {
            if( max < arrInt[i] ) {
                max = arrInt[i];
            }
            if( min > arrInt[i] ) {
                min = arrInt[i];
            }
        }
        
        String answer = min + " " + max ;
        return answer;
    }
}