
import java.util.Arrays;
import java.util.HashSet;


public class 영어끝말잇기_3 {
    
    /*
    - 시작하는 단어 체크
    - 이전에 말했던 단어인지 체크
    - 몇번째 턴인지 체크
     */

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        char chEnd = words[0].charAt(words[0].length()-1);
        char chStart;
        
        System.out.print(chEnd + " ");

        HashSet<String> log = new HashSet<>();
        log.add(words[0]);
        for (int i=1; i<words.length; i++) {
            chStart = words[i].charAt(0);
            log.add(words[i]);
            if (chEnd != chStart || log.size() != i+1) {
                System.out.print(i+1+"!");
                answer[0] = (i%n)+1;
                answer[1] = (i/n)+1;
                break;
            }
            chEnd = words[i].charAt(words[i].length()-1);
            System.out.print(chEnd+" ");
        }
        System.out.println();
        System.out.println("(" + answer[0] + ", " + answer[1] + ")");

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
        System.out.println(Arrays.toString(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }
}
