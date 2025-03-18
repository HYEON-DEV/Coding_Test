import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n, String[] words) {
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
}