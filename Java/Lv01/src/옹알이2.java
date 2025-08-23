package Java.Lv01.src;

import java.util.ArrayList;
import java.util.List;

public class 옹알이2 {
    public int solution(String[] babbling) {
        /*
        List<String> sayings = new ArrayList<>(List.of("aya", "ye", "woo", "ma"));
        int answer = 0;

        for (String b : babbling) {
            for (String s : sayings) {
                System.out.printf("test word : %s,  saying: %s\n", b, s);
                b = b.contains(s) ? b.replaceFirst(s, " ") : b;
                if (b.trim().equals("")) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
         */
        int answer = 0;

        for (String b : babbling) {
            b = b.replaceAll("ayaaya|yeye|woowoo|mama", " ");
            b = b.replaceAll("aya|ye|woo|ma", "");
            if (b.equals("")) answer++;
        }

        return answer;
    }

    public static void main (String[] args) {
        옹알이2 s = new 옹알이2();
        System.out.println(s.solution(new String[] {"aya", "yee", "u", "maa"}));
        System.out.println(s.solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }
}
