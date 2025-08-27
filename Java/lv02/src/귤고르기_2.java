import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 귤고르기_2 {
    
    /*
    배열을 정렬하고
    같은 종류의 원소 갯수 구하기
    갯수가 많은 것 부터 k개 고르기
     */

    public static int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : tangerine) {
            map.put(i, map.getOrDefault(i,0)+1);
        }

        List<Integer> keyList = new ArrayList<>(map.keySet());
        // System.out.println(keyList);
        keyList.sort( (o1,o2) -> map.get(o2) - map.get(o1) );
        System.out.println(keyList);

        for (Integer i : keyList) {
            if (k <= 0) {
                break;
            }
            answer++;
            k -= map.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }
}
