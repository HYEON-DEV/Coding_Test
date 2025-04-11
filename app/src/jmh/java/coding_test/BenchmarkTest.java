package coding_test;

import org.openjdk.jmh.annotations.*;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
@Warmup(iterations = 3)             // 워밍업 1회만
@Measurement(iterations = 5)        // 측정 3회만
@Fork(1)                            // JVM 실행 한 번만
@State(Scope.Thread)
public class BenchmarkTest {

    FuncDevelopment s1;
    FuncDevelopment_2 s2;

    int[] progresses;
    int[] speeds;

    @Setup(Level.Invocation)
    public void setup() {
        s1 = new FuncDevelopment();
        s2 = new FuncDevelopment_2();
        progresses = new int[]{20, 99, 93, 30, 55, 10, 90, 99, 100, 80, 70};
        speeds = new int[]{5, 10, 1, 1, 30, 5, 1, 1, 1, 1, 1};
    }

    @Benchmark
    public int[] solution1() {
        return s1.solution(progresses, speeds);
    }

    @Benchmark
    public int[] solution2() {
        return s2.solution(progresses, speeds);
    }
}
