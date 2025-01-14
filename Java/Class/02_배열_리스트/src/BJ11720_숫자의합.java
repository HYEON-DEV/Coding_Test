import java.util.stream.IntStream;

public class BJ11720_숫자의합 {
    
    public int solution(String numbers) {
        /* int answer = 0;

        for (int i=0; i<numbers.length(); i++) {
            answer += Character.getNumericValue(numbers.charAt(i));
        }

        return answer; */

        return IntStream.range(0,numbers.length())
                        .map(i -> Character.getNumericValue(numbers.charAt(i)))
                        .sum();
    }

    public static void main(String[] args) {
        BJ11720_숫자의합 ex = new BJ11720_숫자의합();
        System.out.println(ex.solution("1"));
        System.out.println(ex.solution("54321"));
        System.out.println(ex.solution("70000000000"));
        System.out.println(ex.solution("10987654321"));
    }
}
