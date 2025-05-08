/*
교집합 크기를 합집합 크기로 나눈 값
공집합 J(A,B)=1

다중집합 교=>min 합=>max

공백,숫자,특수문자 => 글자쌍 버린다 
대소문자 구분 X

*65536, 정수부만 출력

리스트1,2 만들기 [메서드 makeList]
for(;;i+=2) {
    word = substring(i,i+3)
    for(word){
        if(charAt(j) > 문자){
            can = false;
            break;
        }
    }
    if(!can){
        소문자로 바꿔서 리스트 추가 
    } else {
        continue; 
    }
}

리스트1,2 정렬
합집합 추가 (리스트1)
for(리스트1) {
    if(리스트1[i].equlas(리스트2[i])){
        교집합 추가 (리스트1[i])
    } else {
        합집합 추가 (리스트2[i].peek)
        i--; 
    }
}
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class 뉴스클러스터링 {
    
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
        System.out.println(intersection);

        // 합집합
        int union = 0;
        Set<String> allKeys = new HashSet<>(multiset1.keySet());
        allKeys.addAll(multiset2.keySet());
        for (String key : allKeys) {
            int cnt1 = multiset1.getOrDefault(key, 0);
            int cnt2 = multiset2.getOrDefault(key, 0);
            union += Math.max(cnt1, cnt2);
        } 
        System.out.println(union);

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

    public static void main(String[] args) {
        뉴스클러스터링 s = new 뉴스클러스터링();
        System.out.println(s.solution("FRANCE", "french"));
        System.out.println();
        System.out.println(s.solution("handshake", "shake hands"));
        System.out.println();
        System.out.println(s.solution("aa1+aa2", "AAAA12"));
        System.out.println();
        System.out.println(s.solution("E=M*C^2", "e=m*c^2"));
    }
}
