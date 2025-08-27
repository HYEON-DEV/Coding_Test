public class 피보나치수 {

    /*
    F(0) = 0, F(1) = 1일 때, 1 이상의 n에 대하여 F(n) = F(n-1) + F(n-2) 가 적용되는 수
    F(2) = F(0) + F(1) = 0 + 1 = 1
    F(3) = F(1) + F(2) = 1 + 1 = 2
    F(4) = F(2) + F(3) = 1 + 2 = 3
    F(5) = F(3) + F(4) = 2 + 3 = 5

    2 이상의 n이 입력되었을 때, n번째 피보나치 수를 1234567으로 나눈 나머지를 리턴하는 함수, solution을 완성

    n은 2 이상 100,000 이하인 자연수
     */

     /*
        n=2
        f[2] = (f[0]+f[1])%1234567

        n=3
        f[2] = (f[0]+f[1])%1234567
        f[3] = (f[1]+f[2])%1234567

        n=4
        f[2] = (f[0]+f[1])%1234567
        f[3] = (f[1]+f[2])%1234567
        f[4] = (f[2]+f[3])%1234567
    */

    public static int solution(int n) {

        int[] f = new int[n+1];

        f[0] = 0;
        f[1] = 1;

        for (int i=2; i<n+1; i++) {
            f[i] = (f[i-2] + f[i-1]) % 1234567;
        }

        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(3));
        System.out.println(solution(5));
    }
}

