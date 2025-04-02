import Java.helpers.BenchmarkHelper;

public class test_n2배열자르기 {
    
    public static void main(String[] args) {
        
        n2배열자르기 s = new n2배열자르기();

        BenchmarkHelper.runBenchmark("Solution 1", 10, ()->s.solution(10000,1234567,12345678));        
        BenchmarkHelper.runBenchmark("Solution 2", 10, ()->s.solution2(10000,1234567,12345678));        
    }
}
