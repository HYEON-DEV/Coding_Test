import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 카카오_튜플_2 {

    public int[] solution(String s) {
        
        Set<String> set = new HashSet<>();
        String[] arr = s.replaceAll("[{]", " ").replaceAll("[}]", " ").trim().split(" , "); //⏰O(n)
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (a, b)->{return a.length() - b.length();});    //⏰O(n log n)
        System.out.println(Arrays.toString(arr));
        int[] answer = new int[arr.length];
        int idx = 0;
        for (String s1 : arr) {
            for (String s2 : s1.split(",")) {
                if (set.add(s2)) answer[idx++] = Integer.parseInt(s2);  //⏰O(n)
            }
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        카카오_튜플_2 s = new 카카오_튜플_2();
        // System.out.println(Arrays.toString(s.solution("{{2},{2,1},{2,1,3},{2,1,3,4}}")));   // 2,1,3,4
        // System.out.println();
        System.out.println(Arrays.toString(s.solution("{{1,2,3},{2,1},{1,2,4,3},{2}}")));   // 2,1,3,4
        // System.out.println();
        // System.out.println(Arrays.toString(s.solution("{{20,111},{111}}")));    // 111,20
        // System.out.println();
        // System.out.println(Arrays.toString(s.solution("{{123}}"))); // 123
        // System.out.println();
        // System.out.println(Arrays.toString(s.solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")));   // 3,2,4,1
    }
}
