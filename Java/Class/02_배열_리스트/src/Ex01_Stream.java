import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ex01_Stream {
    public static void main(String[] args) {

        // 여러 값을 스트림으로 변환
        Stream<Integer> stream = Stream.of(1,2,3,4,5);        
        // stream.forEach(System.out::println);

        //  배열을 스트림으로 변환
        Integer[] array = {1,2,3,4,5};
        Stream<Integer> stream2 = Arrays.stream(array);
        // stream2.forEach(System.out::println);

        // List, Set 등의 컬렉션에서 스트림 생성
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream3 = list.stream();

        /** filter */
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // 5보다 큰 숫자만 필터링
        numbers.stream()
                .filter(x -> x>5)
                .forEach(System.out::println);


        /** map  |  sorted */
        List<Integer> numbers2 = Arrays.asList(10,5,8,1,3);
        // 2배로 변환 후 정렬
        numbers2.stream()
                .map(x -> x*2)
                .sorted()
                .forEach(System.out::println);


        /** 리스트 수집 */
        List<Integer> numbers3 = Arrays.asList(1,2,3,4,5);
        // 짝수만 리스트로 수집
        List<Integer> evenNumbers = numbers3.stream()
                                            .filter(x -> x%2==0)
                                            .collect(Collectors.toList());
        System.out.println(evenNumbers);
        
    }
}
