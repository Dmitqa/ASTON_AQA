import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FactorialJunitTest {

    @DisplayName("Value validation and factorial calculate")

    @ParameterizedTest
    @ValueSource(longs = {0, 1})
    void calcFactorial(long digit) throws Exception {
        assertEquals(1, Factorial.calcFactorial(digit));
    }

    @Test
    void calcFactorial() {
        assertAll(() -> assertEquals(120, Factorial.calcFactorial(-5)),
                () -> assertEquals(3628800, Factorial.calcFactorial(10)),
                () -> assertEquals(2432902008176640000L, Factorial.calcFactorial(20)));
    }
}
