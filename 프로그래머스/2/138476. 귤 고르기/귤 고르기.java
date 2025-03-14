import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public int solution(int k, int[] tangerine) {
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
}