import com.bin.tdd.FiberCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FiberCalculatorTest {

    @Test
    public void should_return_1_when_index_1_or_2() {
        Assertions.assertEquals(1, FiberCalculator.calculate(1));
        Assertions.assertEquals(1, FiberCalculator.calculate(2));
    }

    @Test
    public void should_return_correct_number_when_index_between_3_or_50() {
        Assertions.assertEquals(2, FiberCalculator.calculate(3));
        Assertions.assertEquals(5, FiberCalculator.calculate(5));
        Assertions.assertEquals(55, FiberCalculator.calculate(10));
    }

    @Test
    public void should_throw_exception_when_index_below_1() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(0));
    }

    @Test
    public void should_throw_exception_when_index_above_50() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> FiberCalculator.calculate(51));
    }

    @Test
    public void should_return_correct_number_when_index_50() {
        Assertions.assertEquals(12586269025L,FiberCalculator.calculate(50));
    }

}
