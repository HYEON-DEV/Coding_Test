public class 숫자의표현_2 {
    
    public static int solution(int n) {

        int answer = 0;

        // 주어진 자연수를 연속된 자연수의 합으로 표현하는 방법의 수는 주어진 수의 홀수 약수의 개수와 같다는 정수론 정리 !!
        for (int i=1; i<n+1; i+=2) {
            if (n%i == 0) {     
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(15));
    }
}
