import java.util.Arrays;

public class BJ1546_평균구하기 {
    
    public double solution(int[] numbers) {
        
        int max = Arrays.stream(numbers).max().getAsInt();

        int sum = Arrays.stream(numbers).sum();

        return (double)sum / max * 100 / numbers.length;
    }

    public static void main(String[] args) {
        BJ1546_평균구하기 ex = new BJ1546_평균구하기();
        System.out.println(ex.solution(new int[]{40,80,60}));
        System.out.println(ex.solution(new int[]{10,20,30}));
        System.out.println(ex.solution(new int[]{1,100,100,100}));
    }
}
