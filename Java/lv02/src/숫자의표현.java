public class 숫자의표현 {
    
    /**
     * for (1부터 n까지 1씩 증가) {
     *      sum = 0;
     * 
     *      for (1부터 n까지 1씩 증가) {
     *              1부터 더해가면서 합(sum)을 계산
     *              if( sum >= n ) {
     *                  cnt += sum==n ? 1 : 0
     *                  break
     *              } 
     *      }
     * } 
     */

    public static int solution(int n) {

        int cnt = 0;

        for (int i=1; i<n+1; i++) {     // => O(n)
            int sum = 0;

            for (int j=i; j<n+1; j++) {     // => O(n)
                sum += j;

                if(sum >= n ) {
                    cnt += sum==n? 1 : 0;
                    break;
                }
            }
        }   // => O(n^2)

        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
