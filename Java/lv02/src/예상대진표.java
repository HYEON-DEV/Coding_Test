public class 예상대진표 {
    
    /*
    1 2  3 4  5 6  7 8
    1    2    3    4
       1         2
    매라운드 절반으로 줄어든다
    라운드마다 참가자 번호를 업데이트

    각 라운드마다 a,b 2로 나눈 다음 라운드의 번호 계산
    2로 나눈값이 같으면 같은 라운드
    */

    public static int solution(int n, int a, int b)
    {
        int round = 0;

        // 참가자 번호 0부터 n-1까지
        a--;
        b--; 

        // 라운드마다 참가자 번호는 절반으로 줄어든다 
        // 라운드 수는 최대 log2(n) 
        // => 시간복잡도 O(logN)
        while (a!=b) {
            a /= 2;  // (4-1)/2=1, 1/2=0, 0/2=0
            System.out.print(a + "  ");
            b /= 2;  // (7-1)/2=3, 3/2=1, 1/2=0
            System.out.print(b + "  ");
            round++;
            System.out.println(round);
        }
        
        return round;
    }

    public static void main(String[] args) {
        System.out.println(solution(8,4,7));
        System.out.println(solution(16,12,16));
    }
}
