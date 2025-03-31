import Java.helpers.BenchmarkHelper;

public class test_할인행사 {
    
    public static void main(String[] args) {
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        할인행사 s1 = new 할인행사();
        할인행사_2 s2 = new 할인행사_2();

        // 람다 표현식을 사용하여 BenchmarkTask 인터페이스의 run 메서드를 구현 
        BenchmarkHelper.runBenchmark("Solution 1", 10, ()->s1.solution(want,number,discount));        
        BenchmarkHelper.runBenchmark("Solution 2", 10, ()->s2.solution(want,number,discount));
    }
}
