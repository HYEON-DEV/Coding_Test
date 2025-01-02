import java.util.ArrayList;
import java.util.List;

public class Ex03_B1158_요세푸스문제 {
    public List<Integer> solution(int N, int K) {
        List<Integer> numbers = new ArrayList<>();
        for(int i=1; i<=N; i++) {
            numbers.add(i);
        }

        List<Integer> result = new ArrayList<>();
        int index = 0;
        while(!numbers.isEmpty()) {
            index = (index + K - 1) % numbers.size();
            result.add(numbers.remove(index));
        }
        return result;
    }

    public static void main(String[] args) {
        Ex03_B1158_요세푸스문제 ex = new Ex03_B1158_요세푸스문제();

        System.out.println(ex.solution(7,2));
    }
}