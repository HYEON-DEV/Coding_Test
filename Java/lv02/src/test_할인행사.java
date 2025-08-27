import Java.helpers.BenchmarkHelper;

public class test_할인행사 {
    
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        할인행사 s1 = new 할인행사();
        할인행사_2 s2 = new 할인행사_2();
        할인행사_3 s3 = new 할인행사_3();
        할인행사_4 s4 = new 할인행사_4();

        // 람다 표현식을 사용하여 BenchmarkTask 인터페이스의 run 메서드를 구현 
        BenchmarkHelper.runBenchmark("Solution 1", 30, ()->s1.solution(want,number,discount));        
        BenchmarkHelper.runBenchmark("Solution 2", 30, ()->s2.solution(want,number,discount));
        BenchmarkHelper.runBenchmark("Solution 3", 30, ()->s3.solution(want, number, discount));
        BenchmarkHelper.runBenchmark("Solution 4", 30, ()->s4.solution(want, number, discount));
    }
}
