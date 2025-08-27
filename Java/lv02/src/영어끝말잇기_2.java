import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 영어끝말잇기_2 {
    
    /*
    - 시작하는 단어 체크
    - 이전에 말했던 단어인지 체크
    - 몇번째 턴인지 체크
     */

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        List<String> list = new ArrayList<>();
        list.add(words[0]);

        for (int i=1; i<words.length; i++) {
            if (list.contains(words[i]) || same(list.get(list.size()-1), words[i])) {
                answer[0] = i%n+1;
                answer[1] = i/n+1;
                break;
            }
            list.add(words[i]);
        }

        return answer;
    }

    public static boolean same(String word1, String word2) {
        if (word1.charAt(word1.length()-1) == word2.charAt(0)) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
        System.out.println(Arrays.toString(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }
}
