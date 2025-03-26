import Java.helpers.BenchmarkHelper;

public class 괄호회전하기_test {
    
    public static void main(String[] args) {
        String s = "[](){}[](){}[](){}[](){}[](){}[](){}[](){}[](){}[](){}[](){}";

        괄호회전하기 s1 = new 괄호회전하기();
        괄호회전하기_2 s2 = new 괄호회전하기_2();

        // 람다 표현식을 사용하여 BenchmarkTask 인터페이스의 run 메서드를 구현 
        BenchmarkHelper.runBenchmark("Solution 1", 10, ()->s1.solution(s));        
        BenchmarkHelper.runBenchmark("Solution 2", 10, ()->s2.solution(s));
    }
}
