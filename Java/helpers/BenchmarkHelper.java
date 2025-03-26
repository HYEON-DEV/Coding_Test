package Java.helpers;

public class BenchmarkHelper {

    /**
     * 작업을 여러 번 실행하여 평균 실행 시간 측정하고 결과를 출력한다. 
     * @param name : 벤치마크 테스트 이름 
     * @param iteration : 작업 반복 횟수
     * @param task : 벤치마크 테스트에서 실행할 작업 
     */
    public static <T> void runBenchmark (String name, int iteration, BenchmarkTask<T> task) {
        long sum = 0;
        T result = null;

        for (int i=0; i<iteration; i++) {
            long start = System.nanoTime();
            result = task.run();
            long end = System.nanoTime();
            sum += end-start;
        }

        System.out.println(name + " 결과 : " + result);
        System.out.println(name + " 실행 시간 : " + (sum/iteration) + "ns");
        System.out.println("------------------------------------");
    }

    /**
     * 벤치마크 테스트에서 실행할 작업 정의 
     */
    public interface BenchmarkTask<T> {
        T run();        
    }
}
