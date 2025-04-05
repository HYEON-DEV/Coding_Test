/*
SEND + MORE = MONEY
각 알파벳은 하나의 숫자를 나타내고, 숫자의 첫 번째 자리에 '0'을 쓸 수는 없습니다.
=> 'S'와 'M'은 '0'이 아니다

Allen Kyonghun Jeon
ALLEN = K * JEON
이 문제의 답은 3가지

'SYNAP + SOFT = WANTS + YOU'

위 암호산술의 가능한 모든 답의 좌변 숫자를 더한 값을 제출하세요.
 */

package Java.ProjectEuler;

import java.util.HashMap;
import java.util.Map;

public class cryptographic1 {
    static char[] letters = {'S','Y','N','A','P','O','F','T','W','U'};  // 문제에 사용되는 고유 문자 
    static boolean[] used = new boolean[10];    // 숫자 사용 여부 체크 (0~9)
    static Map<Character,Integer> map = new HashMap<>();    // 문자 : 숫자 맵핑
    static int solutionCount = 0;   // 정답 개수 카운트
    static int sum = 0;     // 모든 답의 좌변 숫자 더한 값

    /* letters[idx] 문자에 숫자 할당하는 재귀함수 */
    public void solve (int idx) {

        // 모든 문자에 숫자 할당하면 계산 시도
        if (idx == letters.length) {
            int synap = getValue("SYNAP");
            int soft = getValue("SOFT");
            int wants = getValue("WANTS");
            int you = getValue("YOU");

            // 정답이면 출력, 합산 
            if (synap+soft == wants+you) {
                solutionCount++;
                sum += synap + soft;
                System.out.printf("[%d] %d + %d = %d + %d,  sum = %d\n", solutionCount, synap, soft, wants, you, sum);
            }
            return;
        }

        // 문자에 0~9 할당해보기
        for ( int i=0; i<10; i++) {

            // 첫 자리에 0 안됨
            if ((letters[idx]=='S' || letters[idx]=='W' || letters[idx]=='Y') && i==0) continue;
            // 이미 사용된 숫자는 건너뜀
            if (used[i]) continue;

            // 문자에 숫자 할당
            map.put(letters[idx], i);
            used[i] = true;

            // 다음 문자에 숫자 할당 재귀함수 호출
            solve(idx+1);

            // 원상복귀
            used[i] = false;
            map.remove(letters[idx]);
        }
    }

    /* 문자열을 숫자로 변환 */ 
    public static int getValue (String word) {
        int value = 0;
        for (char c : word.toCharArray()) {
            value = value*10 + map.get(c);
        }
        return value;
    }

    public static void main(String[] args) {
        cryptographic1 c = new cryptographic1();
        c.solve(0);     // 첫 문자부터 시작
    }

}
