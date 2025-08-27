import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class 카카오_튜플 {

    public int[] solution(String s) {
        // {{}} 제거,  },{ 로 분리
        s = s.substring(2, s.length()-2);
        String[] sets = s.split("},\\{");   // ⏰O(n)
        // System.out.println(Arrays.toString(sets));

        // 각 집합을 int[]로 변환
        List<List<Integer>> tupleList = new ArrayList<>();
        for (String set : sets) {   // ⏰O(m*k)≈O(n)
            // System.out.println(set);
            List<Integer> nums = new ArrayList<>();
            for (String num : set.split(",")) {
                nums.add(Integer.parseInt(num));
            }
            tupleList.add(nums);
        }
        // System.out.println(tupleList);

        tupleList.sort(Comparator.comparingInt(List::size));    // ⏰O(n log n)
        // System.out.println(tupleList);

        Set<Integer> seen = new LinkedHashSet<>();
        for (List<Integer> tuple : tupleList) {     // ⏰O(n)
            for (int num : tuple) {
                if (!seen.contains(num)) {
                    seen.add(num);
                }
            }
        }
        // System.out.println(seen);
        
        return seen.stream().mapToInt(Integer::intValue).toArray();     // ⏰O(n)
        // => ⏰O(n log n)
    }
    
    public static void main(String[] args) {
        카카오_튜플 s = new 카카오_튜플();
        System.out.println(Arrays.toString(s.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));   // 2,1,3,4
        System.out.println();
        System.out.println(Arrays.toString(s.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));   // 2,1,3,4
        System.out.println();
        System.out.println(Arrays.toString(s.solution("{{20,111},{111}}")));    // 111,20
        System.out.println();
        System.out.println(Arrays.toString(s.solution("{{123}}"))); // 123
        System.out.println();
        System.out.println(Arrays.toString(s.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));   // 3,2,4,1
    }
}
