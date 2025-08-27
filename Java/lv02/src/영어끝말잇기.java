import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 영어끝말잇기 {
    
    /*
    - 시작하는 단어 체크
    - 이전에 말했던 단어인지 체크
    - 몇번째 턴인지 체크
     */

    public static int[] solution2(int n, String[] words) {
        int i=0;
        int cnt=0;
        int cnt2;
        List<String> words2 = new ArrayList<>();
        
        while (i<words.length) {
            i++;
            cnt = i%n;

            String pre = words[i-1];
            // String cur = words[i];
            if (pre.charAt(pre.length()-1) != words[i].charAt(0)) {
                break;
            }

            words2.add(pre);
            cnt2=0;
            for (int j=0; j<words2.size(); j++) {
                if(words2.get(j).equals(words[i])) {
                    cnt2++;
                    break;
                }
            }   
            if (cnt2>0) {
                break;
            }
        }
        
        if (cnt==0) {
            return new int[] {0,0};
        } else {
            return new int[]{i % n, cnt};
        }
    }

    public static int[] solution(int n, String[] words) {
        List<String> words2 = new ArrayList<>();
        words2.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String pre = words[i - 1];
            String cur = words[i];
            
            // 단어의 마지막 문자와 다음 단어의 첫 문자 체크
            if (pre.charAt(pre.length() - 1) != cur.charAt(0)) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            
            // 이전에 말했던 단어인지 체크
            if (words2.contains(cur)) {
                return new int[]{(i % n) + 1, (i / n) + 1};
            }
            
            // 단어를 리스트에 추가
            words2.add(cur);
        }
        
        // 모든 단어가 올바르게 이어진 경우
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"})));
        System.out.println(Arrays.toString(solution(5, new String[]{"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"})));
        System.out.println(Arrays.toString(solution(2, new String[]{"hello", "one", "even", "never", "now", "world", "draw"})));
    }
}
