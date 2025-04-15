import java.util.Arrays;

public class 카카오_튜플_2 {

    public int[] solution(String s) {
        
        
        return new int[] {};
    }
    
    public static void main(String[] args) {
        카카오_튜플_2 s = new 카카오_튜플_2();
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
