/*
n편 중
h번 이상 인용이 h편이고
나머지는 h번 이하 인용
h의 최댓값이 hindex

citations 내림차순 정렬  // 6 5 3 1 0
h = citations[0]
for (배열 반복) {
    if (원소 >= h) {
        cnt++
    }
    if (cnt >= h) {
        break;
    } else {
        h = citations[++i] 
    }
}
return h;
 */

import java.util.Arrays;

public class HIndex {

    public int solution(int[] citations) {

        Arrays.sort(citations);
        // System.out.println(Arrays.toString(citations));

        int answer = 0;
        
        for (int i=0; i<citations.length; i++) {
            int h = citations.length-i;     

            if (citations[i] >= h) {    
                answer = h;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        HIndex s = new HIndex();
        System.out.println(s.solution(new int[] {3,0,6,1,5}));
    }
}