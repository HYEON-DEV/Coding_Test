/*
yellow_hat, green_turban
blue_sunglasses
 */

import java.util.HashMap;
import java.util.Map;

public class 의상 {

    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        int answer = 1;
        
        for (int i=0; i<clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }
        // System.out.println(map);
        // System.out.println(map.keySet());
        // System.out.println(map.size());

        for (String key : map.keySet()) {
            answer *= map.get(key)+1;
            // System.out.println(answer);
        }

        return answer-1;
    }
    
    public static void main(String[] args) {
        의상 s = new 의상();
        System.out.println(s.solution(new String[][] { {"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"} }));
        System.out.println(s.solution(new String[][] { {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"} }));
    }
}
