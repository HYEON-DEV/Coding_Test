import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class 기능개발 {

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

    public static void main(String[] args) {
        기능개발 s = new 기능개발();
        System.out.println(Arrays.toString(s.solution(new int[] {93, 30, 55}, new int[] {1, 30, 5})));
        System.out.println();
        System.out.println(Arrays.toString(s.solution(new int[] {95, 90, 99, 99, 80, 99}, new int[] {1, 1, 1, 1, 1, 1})));
    }
}