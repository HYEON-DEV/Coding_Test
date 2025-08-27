/*
효진이가 끝에 도달하는 방법이 몇 가지인지
여기에 1234567를 나눈 나머지를 리턴
n은 1 이상, 2000 이하
 */
/*
1 => 1

2 => 2
(1,1)
(2)

3 => 3 (1+2)
(1,1,1)
(1,2)
(2,1)

4 => 5 (2+3)
(1,1,1,1)
(1,2,1)
(1,1,2)
(2,1,1)
(2,2)

5 => 8  (3+5)
(1,1,1,1,1) 
(2,1,1,1)   
(1,2,1,1)
(1,1,2,1)
(1,1,1,2)   
(2,2,1)
(2,1,2)
(1,2,2)     
 */

public class 멀리뛰기 {
    public static long solution(int n) {
        long[] f = new long[n+2];
        f[1] = 1;
        f[2] = 2;
        
        if(n>2) {
            for (int i=3; i<n+1; i++) {
                f[i] = (f[i-2]+f[i-1]) % 1234567;
            }
        }

        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(4));
        System.out.println(solution(3));
        System.out.println(solution(1));
    }
}
