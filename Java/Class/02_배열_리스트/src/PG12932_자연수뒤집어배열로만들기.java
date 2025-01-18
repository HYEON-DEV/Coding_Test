import java.util.Arrays;

public class PG12932_자연수뒤집어배열로만들기 {
    
    public int[] solution(long n) {

        char[] c = String.valueOf(n).toCharArray();      
        int size = c.length;

        for(int i=0; i<size/2; i++) {
            int end = size-i-1;

            char temp = c[i];
            c[i] = c[end];
            c[end] = temp;
        }

        int[] answer = new int[size];
        for (int i=0; i<size; i++) {
            answer[i] = c[i]-'0';
        }
        return answer;
    }

    public static void main(String[] args) {
        PG12932_자연수뒤집어배열로만들기 ex = new PG12932_자연수뒤집어배열로만들기();
        System.out.println(Arrays.toString(ex.solution(12345)));
        System.out.println(Arrays.toString(ex.solution(123456)));
    }
}
