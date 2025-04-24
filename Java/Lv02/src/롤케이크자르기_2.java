import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 롤케이크자르기_2 {

    public int solution(int[] topping) {
        Map<Integer, Integer> rightMap = new HashMap<>();
        Set<Integer> leftSet = new HashSet<>();
        int result = 0;

        for (int t : topping) {
            rightMap.put(t, rightMap.getOrDefault(t, 0)+1);
        }
        // System.out.println(rightMap);

        for (int i=0; i<topping.length; i++) {
            int t = topping[i];
            leftSet.add(t);
            rightMap.put(t, rightMap.get(t)-1);

            if (rightMap.get(t) == 0) {
                rightMap.remove(t);
            }

            if (leftSet.size() == rightMap.size()) {
                result++;
            } else if (leftSet.size() > rightMap.size()) {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        롤케이크자르기_2 s = new 롤케이크자르기_2();
        System.out.println(s.solution(new int[] {1, 2, 1, 3, 1, 4, 1, 2}));
        System.out.println();
        System.out.println(s.solution(new int[] {1,2,3,1,4}));
    }
}
