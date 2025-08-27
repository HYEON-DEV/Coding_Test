public class 다음큰숫자 {

    public static int solution(int n) {

        /*
         while( true ) {
            if( n의 2진수 1의 갯수 == ++n의 2진수 1의 갯수 ) {
                break
            }
         }
         return n
         
        */

        int cnt = Integer.bitCount(n);  // n의 이진수에서 1의 개수 계산

        while (true) {
            if (cnt == Integer.bitCount(++n)) {
                break;
            }
        }
        
        return n;
    }

    public static void main(String[] args) {
        System.out.println(solution(78));
        System.out.println(solution(15));
    }
    
}
