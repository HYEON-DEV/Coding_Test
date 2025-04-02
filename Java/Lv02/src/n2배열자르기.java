import java.util.Arrays;
import java.util.stream.LongStream;

public class n2배열자르기 {

    public int[] solution(int n, long left, long right) {

        int size = (int)(right-left+1);
        int[] result = new int[size];

        for (int i=0; i<size; i++) {
            long idx = left+i;
            int row = (int)(idx/n); 
            int col = (int)(idx%n); 
            result[i] = Math.max(row, col)+1;
        }

        return result;
    }

    public int[] solution2 (int n, long left, long right) {
        return LongStream.rangeClosed(left, right).mapToInt(value -> (int) (Math.max(value / n, value % n) + 1)).toArray();
    }

    public static void main(String[] args) {
        n2배열자르기 s = new n2배열자르기();
        System.out.println(Arrays.toString(s.solution(3, 2, 5)));
        System.out.println(Arrays.toString(s.solution2(3, 2, 5)));
    }
}
