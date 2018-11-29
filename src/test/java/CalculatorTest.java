import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    void justAnExample() {
       assertEquals(calc.add(5,5),10);
    }
}

