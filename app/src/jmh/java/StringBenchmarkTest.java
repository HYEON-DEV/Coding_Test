import java.util.concurrent.TimeUnit;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.Warmup;
import org.springframework.util.AlternativeJdkIdGenerator;
import org.springframework.util.IdGenerator;
import org.springframework.util.JdkIdGenerator;

@Measurement(iterations = 5, time = 1000, timeUnit = TimeUnit.MILLISECONDS)
@Warmup(iterations = 5, time = 500, timeUnit = TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class StringBenchmarkTest {

    private static final IdGenerator ID_GENERATOR = new AlternativeJdkIdGenerator();

    private static final IdGenerator ID_GENERATOR2 = new JdkIdGenerator();
    
    @Benchmark
    public void uuidGenerateTest() {
        String uuid = ID_GENERATOR.generateId().toString();
    }

    @Benchmark
    public void uuidGenerateTest2() {
        String uuid = ID_GENERATOR2.generateId().toString();
    }

    public static void main(String[] args) {

    }

}