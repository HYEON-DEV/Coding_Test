import java.util.Arrays;

public class 프로그래머스_주식가격_2 {
    
    public int[] solution(int[] prices) {

        /**
         * prices 10만 이하 이므로 배열 2중반복문 안된다
         * 인덱스번호로 접근할때는 배열이 가장 빠르고
         * 길이가 정해져 있으므로 배열로 리턴한다 ⭐
         * 인덱스 접근은 배열이 가장 빠르다 ⭐
         */
        
        // 결과를 저장할 int[] answer 배열을 n 크기로 초기화
        int n = prices.length;
        int[] answer = new int[n];  
        // int[] answer = new int[prices.length] 좋은 코드 아님  위랑 같다.
        // 반복문 줄이는게 좋은 코드지 위와같이 줄이는건 좋은코드가 아니다

        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                answer[i]++;
                
                if(prices[i] > prices[j]) {
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        프로그래머스_주식가격_2 s = new 프로그래머스_주식가격_2();
        System.out.println(Arrays.toString(s.solution(new int[]{1,2,3,2,3})));
    }
}
