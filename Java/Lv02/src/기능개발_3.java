import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 기능개발_3 {

    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i=0; i<progresses.length; i++) {
            int days = (int) Math.ceil( (100.0-progresses[i]) / speeds[i] );
            queue.add(days);
        }
        System.out.println("작업별 완료 날짜: " + queue);

        int current = queue.poll();
        int cnt = 1;

        while (!queue.isEmpty()) {
            int next = queue.poll();
            if (next <= current) {
                cnt++;
            } else {
                result.add(cnt);
                cnt = 1;
                current = next;
            }
        }
        result.add(cnt);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        기능개발_3 s = new 기능개발_3();
        System.out.println(Arrays.toString(s.solution(new int[] {93, 30, 55}, new int[] {1, 30, 5})));
        System.out.println();
        System.out.println(Arrays.toString(s.solution(new int[] {95, 90, 99, 99, 80, 99}, new int[] {1, 1, 1, 1, 1, 1})));
    }
}