import java.util.Arrays;

/**
 * 부분 수열의 합 k
 * 여러개인 경우 짧은 부분 수열 찾기
 * 짧은 부분 수열 여러개인 경우 시작 인덱스가 작은 수열 찾기
 * 
 * 투포인터 이용
 * 
 * 배열길이 최솟값 초기화
 * 
 * if (구간합=k) {
 *      현재배열길이 구하기
 * 
 *      if ( 배열길이 < minLenth ) {
 *          시작인덱스, 마지막인덱스 저장
 *      }
 * }
 */

public class 프178870_연속된부분수열의합 {
    
    public int[] solution(int[] sequence, int k) {

        int s=0, e=0, sum=0, len=0;

        // int[] prefixsum = new int[sequence.length+1];
        // for (int i=1; i<sequence.length+1; i++) {
        //     prefixsum[i] = prefixsum[i-1] + sequence[i-1];
        // }
        // System.out.println(Arrays.toString(prefixsum));
        
        int[] answer = new int[2];
        
        int minLength = Integer.MAX_VALUE;

        while (s < k) {
            System.out.printf("s: %d,  e: %d,  sum: %d,  len: %d \n", s,e,sum,len);

            if (sum<k && e<k) {
                sum += sequence[e];
                e++;
            } else if (sum > k) {
                sum -= sequence[s];
                s++;
            } else {
                int curLength = e-s;
                if (curLength < minLength) {
                    minLength = curLength;
                    answer[0] = s;
                    answer[1] = e;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        프178870_연속된부분수열의합 s = new 프178870_연속된부분수열의합();
        System.out.println(s.solution(new int[]{1,2,3,4,5}, 7));
        System.out.println(Arrays.toString(s.solution(new int[]{1,1,1,2,3,4,5}, 5)));
        System.out.println(Arrays.toString(s.solution(new int[]{2,2,2,2,2}, 6)));
    }
}
