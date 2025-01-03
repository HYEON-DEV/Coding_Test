import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// import 문은 실행시간과 메모리에 영향을 주지 않는다.

public class 프로그래머스_나누어떨어지는숫자배열_2 {
    
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] % divisor == 0) {
                result.add(arr[i]);
            }
        }

        if(result.isEmpty()) {
            result.add(-1);
        } else {
            Collections.sort(result);
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        프로그래머스_나누어떨어지는숫자배열_2 sol = new 프로그래머스_나누어떨어지는숫자배열_2();

        System.out.println(Arrays.toString(sol.solution(new int[]{5,9,7,10}, 5)));
        System.out.println(Arrays.toString(sol.solution(new int[]{2,36,1,3}, 1)));
        System.out.println(Arrays.toString(sol.solution(new int[]{3,2,6}, 10)));
    }

}
