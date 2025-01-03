import java.util.stream.IntStream;

public class Ex01_IntStream {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = IntStream.of(numbers).sum();
        System.out.println("Sum: " + sum);
    }
}
