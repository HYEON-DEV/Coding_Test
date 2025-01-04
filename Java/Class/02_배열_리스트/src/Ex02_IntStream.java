import java.util.stream.IntStream;

public class Ex02_IntStream {
    public static void main(String[] args) {

        // IntStream 생성
        int[] numbers = {1,2,3,4,5};
        int sum = IntStream.of(numbers).sum();
        System.out.println(sum);


        // 1부터 10까지 숫자 스트림 생성
        IntStream.range(1,11).forEach(System.out::println);


        // 1부터 10까지 중 짝수의 제곱 계산
        IntStream.range(1,11)
                .filter(x -> x%2==0)
                .map(x -> x*x)
                .forEach(System.out::println);
    }
}
