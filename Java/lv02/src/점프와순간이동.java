public class 점프와순간이동 {

    /*
    배터리를 최소로 사용하기 위해
    순간이동을 최대한 많이 사용하고
    점프를 최소로 사용한다
     */
    public static int solution(int n) {     
        int ans = 0;

        while ( n != 0 ) {
            if ( n%2 == 0 ) {
                n /= 2;
            } else {
                n--;
                ans++;
            }
        }
        
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solution(5));
        System.out.println(solution(6));
        System.out.println(solution(5000));
    }
}
