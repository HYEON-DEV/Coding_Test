import java.util.ArrayList;
import java.util.List;

public class BJ1158_요세푸스 {

    public List<Integer> solution (int N, int K) {
        List<Integer> numbers = new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<N+1; i++) {
            numbers.add(i);
        }

        // N개의 요소가 제거될 때까지 이므로 N번 반복
        for (int i=0; i<N; i++) {
            int idx = K%numbers.size();
            result.add(numbers.remove(idx));    // 제거된 요소를 리스트에 추가

            for(int j=0; j<idx; j++) {
                numbers.add(numbers.remove(0)); // 제거된 요소 이전의 요소들을 뒤로 이동
            }
        }
        return result;
    }

    public static void main(String[] args) {
        BJ1158_요세푸스 ex = new BJ1158_요세푸스();
        System.out.println(ex.solution(7,2));
    }
}
