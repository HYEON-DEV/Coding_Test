import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public int[] solution(String s) {
        // {{}} 제거,  },{ 로 분리
        s = s.substring(2, s.length()-2);
        String[] sets = s.split("},\\{");
        // System.out.println(Arrays.toString(sets));

        // 각 집합을 int[]로 변환
        List<List<Integer>> tupleList = new ArrayList<>();
        for (String set : sets) {
            // System.out.println(set);
            List<Integer> nums = new ArrayList<>();
            for (String num : set.split(",")) {
                nums.add(Integer.parseInt(num));
            }
            tupleList.add(nums);
        }
        // System.out.println(tupleList);

        tupleList.sort(Comparator.comparingInt(List::size));
        // System.out.println(tupleList);

        Set<Integer> seen = new LinkedHashSet<>();
        for (List<Integer> tuple : tupleList) {
            for (int num : tuple) {
                if (!seen.contains(num)) {
                    seen.add(num);
                }
            }
        }
        // System.out.println(seen);
        
        return seen.stream().mapToInt(Integer::intValue).toArray();
    }
}