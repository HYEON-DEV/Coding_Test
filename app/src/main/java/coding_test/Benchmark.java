import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
public class Benchmark {
    int[] progresses;
    int[] speeds;

    @Setup(Level.Invocation)
    public void setup() {
        progresses = new int[] {95, 90, 99, 99, 80, 99};
        speeds = new int[] {1, 1, 1, 1, 1, 1};
    }

    @Benchmark
    public int[] testSolution() {
        기능개발 s = new 기능개발();
        return s.solution(progresses,speeds);
    }
}
