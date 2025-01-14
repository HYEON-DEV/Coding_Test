import java.util.Arrays;

public class 프120808_분수의덧셈 {

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // denom1,denom2 큰수찾기
        // denom에 따라 분자 계산
        // 분수 더하기
        // 기약분수처리

        int denom = denom1 * denom2;
        int numer = numer1*denom2 + numer2*denom1;

        int max = 1;
        for (int i=1; i<denom+1 && i<numer+1; i++) {
            if(denom%i==0 && numer%i==0) {
                max = i;
            }
        }

        int[] answer = {numer/max, denom/max};
        return answer;
    }

    public static void main(String[] args) {
        프120808_분수의덧셈 ex = new 프120808_분수의덧셈();
        System.out.println(Arrays.toString(ex.solution(1,2,3,4)));
        System.out.println(Arrays.toString(ex.solution(9,2,1,3)));
    }
}
