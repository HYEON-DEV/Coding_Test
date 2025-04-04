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
public class cryptographic1 {
    static char[] letters = {'S','E','N','D','M','O','R','Y'};
    static boolean[] used = new boolean[10];
    static Map<Character,Integer> mapping = new HashMap<>();

    public void solve (int idx) {
        // 모든 문자에 숫자 할당하면 계산 시도
        if (idx == letters.length) {
            int send = getValue("SEND");
            int more = getValue("MORE");
            int money = getValue("MONEY");

            System.out.println("SEND = " + send + ", MORE = " + more + ", MONEY = " + money);
            
            // 정답이면
            if (send + more == money) {
                for (char c : letters) {
                    System.out.println(c + " = " + mapping.get(c));
                }
                System.out.println("SEND + MORE = MONEY");
                System.out.println(send + " + " + more + " = " + money);
                System.exit(0);
            }
            return;
        }

        // 문자에 0~9 할당해보기
        for ( int i=0; i<10; i++) {
            char curChar = letters[idx];
            
            // 첫 자리에 0 안됨
            if ((letters[idx]=='S' || letters[idx]=='M') && i==0) continue;
            if (used[i]) continue;

            mapping.put(letters[idx], i);
            used[i] = true;
            solve(idx+1);
            used[i] = false;
            mapping.remove(letters[idx]);
        }
    }

    public static int getValue (String word) {
        int value = 0;
        for (char c : word.toCharArray()) {
            value = value*10 + mapping.get(c);
        }
        return value;
    }
    public static void main(String[] args) {
        cryptographic1 c = new cryptographic1();
        System.out.println("---START---");
        c.solve(0);
        System.out.println("가능한 해답이 없습니다.");
    }

}
