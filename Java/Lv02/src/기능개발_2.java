import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 기능개발_2 {

    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> result = new ArrayList<>();
        int n = progresses.length;
        int[] days = new int[n];

        // 각 작업마다 걸리는 날짜 계산
        for (int i=0; i<n; i++) {
            days[i] = (int) Math.ceil( (100.0-progresses[i]) / speeds[i]);
        }
        // System.out.println("각 작업마다 걸리는 날짜: " + Arrays.toString(days));

        // 앞에 있는 작업보다 늦게 끝나면 따로 배포, 아니면 같은 날 배포
        int cnt = 1;
        int prev = days[0];
        for (int i=1; i<n; i++) {
            if (days[i] <= prev) {
                cnt++;
            } else {
                result.add(cnt);
                cnt = 1;
                prev = days[i];
            }
        }
        result.add(cnt);
        // System.out.println(result);
        
        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        기능개발_2 s = new 기능개발_2();
        System.out.println(Arrays.toString(s.solution(new int[] {93, 30, 55}, new int[] {1, 30, 5})));
        System.out.println();
        System.out.println(Arrays.toString(s.solution(new int[] {95, 90, 99, 99, 80, 99}, new int[] {1, 1, 1, 1, 1, 1})));
    }
}