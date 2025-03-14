import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class 귤고르기 {
    
    /*
    배열을 정렬하고
    같은 종류의 원소 갯수 구하기
    갯수가 많은 것 부터 k개 고르기
     */

    public static int solution(int k, int[] tangerine) {
        int sum = 0; // 고를 귤의 개수
        int cnt = 0; // 최솟값 카운트

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num : tangerine) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        // System.out.println("map: " + map);

        ArrayList<Integer> valueList = new ArrayList<>(map.values());
        Collections.sort(valueList, Collections.reverseOrder());
        // System.out.println(valueList);

        for(int v : valueList) {
            if (sum+v >= k) {
                cnt++;
                break;
            } else {
                sum += v;
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        System.out.println(solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(4, new int[]{1, 3, 2, 5, 4, 5, 2, 3}));
        System.out.println(solution(2, new int[]{1, 1, 1, 1, 2, 2, 2, 3}));
    }
}
