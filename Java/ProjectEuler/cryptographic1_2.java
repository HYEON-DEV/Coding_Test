package Java.ProjectEuler;

import java.util.HashMap;
import java.util.Map;

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
public class cryptographic1_2 {
    static char[] letters = {'A','L','E','N','K','J','O'};
    static boolean[] used = new boolean[10];
    static Map<Character,Integer> map = new HashMap<>();
    static int solutionCount = 0;

    public void solve (int idx) {
        // 모든 문자에 숫자 할당하면 계산 시도
        if (idx == letters.length) {
            int allen = getValue("ALLEN");
            int jeon = getValue("JEON");
            int k = map.get('K');

            // 정답이면
            if (allen == k * jeon) {
                solutionCount++;
                // for (char c : letters) {
                //     System.out.println(c + " = " + map.get(c));
                // }
                System.out.printf("[%d] %d = %d * %d\n", solutionCount, allen, k, jeon);
            }
            return;
        }

        // 문자에 0~9 할당해보기
        for ( int i=0; i<10; i++) {
            // 첫 자리에 0 안됨
            if ((letters[idx]=='A' || letters[idx]=='K' || letters[idx]=='J') && i==0) continue;
            if (used[i]) continue;

            // System.out.println(letters[idx] + " : " + i);

            map.put(letters[idx], i);
            used[i] = true;

            solve(idx+1);

            used[i] = false;
            map.remove(letters[idx]);
        }
    }

    public static int getValue (String word) {
        int value = 0;
        for (char c : word.toCharArray()) {
            value = value*10 + map.get(c);
        }
        return value;
    }
    public static void main(String[] args) {
        cryptographic1_2 c = new cryptographic1_2();
        c.solve(0);
    }

}
