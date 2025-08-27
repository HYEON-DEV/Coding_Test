import java.util.Arrays;

public class 이진변환반복하기 {

    public static int[] solution(String s) {
        
        int[] answer = {0,0};

        while (!s.equals("1")) {
            int before = s.length();
            s = s.replaceAll("0", "");
            int after = s.length();

            answer[1] += before - after;    // 제거한 0의 개수

            s = Integer.toBinaryString(after);  // 이진변환

            answer[0]++;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution("110010101001")));
        System.out.println(Arrays.toString(solution("01110")));
        System.out.println(Arrays.toString(solution("1111111")));
    }
}