import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (int i=0; i<progresses.length; i++) {
            q.add(progresses[i]);
        }
        // System.out.println(q);

        int n = 1;
        for (int i=0; i<progresses.length; i++) {
            while (true) {
                if (progresses[i] + speeds[i]*n >= 100) {
                    q.poll();
                    map.put(n, map.getOrDefault(n, 0)+1);
                    System.out.printf("q: %s, map: %s \n", q, map);
                    break;
                } else {
                    n++;
                }
            }
        }
        // System.out.println(map.values());

        return map.values().stream().mapToInt(Integer::intValue).toArray();
    }
}