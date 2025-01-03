
import java.util.Arrays;
import java.util.List;
// import 문은 실행시간과 메모리에 영향을 주지 않는다.
import java.util.stream.Collectors;

public class 프로그래머스_나누어떨어지는숫자배열_3 {
    
    public int[] solution(int[] arr, int divisor) {
        
        // Stream을 사용하여 나누어 떨어지는 숫자 필터링
        List<Integer> result = Arrays.stream(arr)
        .filter(num -> num%divisor == 0)
        .sorted()
        .boxed()
        .collect(Collectors.toList());

        if(result.isEmpty()) {
            result.add(-1);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        프로그래머스_나누어떨어지는숫자배열_3 sol = new 프로그래머스_나누어떨어지는숫자배열_3();

        System.out.println(Arrays.toString(sol.solution(new int[]{5,9,7,10}, 5)));
        System.out.println(Arrays.toString(sol.solution(new int[]{2,36,1,3}, 1)));
        System.out.println(Arrays.toString(sol.solution(new int[]{3,2,6}, 10)));
    }

}
