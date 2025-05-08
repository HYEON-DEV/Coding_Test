import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> multiset1 = getMultiset(str1.toLowerCase());
        Map<String, Integer> multiset2 = getMultiset(str2.toLowerCase());

        // 교집합
        int intersection = 0;
        for (String key : multiset1.keySet()) {
            if (multiset2.containsKey(key)) {
                intersection += Math.min(multiset1.get(key), multiset2.get(key));
            }
        }

        // 합집합
        int union = 0;
        Set<String> allKeys = new HashSet<>(multiset1.keySet());
        allKeys.addAll(multiset2.keySet());
        for (String key : allKeys) {
            int cnt1 = multiset1.getOrDefault(key, 0);
            int cnt2 = multiset2.getOrDefault(key, 0);
            union += Math.max(cnt1, cnt2);
        } 

        // 유사도 계산
        if (union == 0) return 65536;
        return (int) (((double) intersection/union) * 65536);
    }

    /* 다중 집합 생성 */
    private Map<String,Integer> getMultiset(String str) {
        Map<String,Integer> map = new HashMap<>();
        for (int i=0; i<str.length()-1; i++) {
            char a = str.charAt(i);
            char b = str.charAt(i+1);
            if (Character.isLetter(a) && Character.isLetter(b)) {
                String pair = "" + a + b;
                map.put(pair, map.getOrDefault(pair, 0)+1);
            }
        }
        return map;
    }
}