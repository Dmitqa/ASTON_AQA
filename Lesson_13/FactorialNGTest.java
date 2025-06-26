import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialNGTest {

    @DataProvider(name = "first")
    public static Object[][] factNum() {
        return new Object[][]{{0, 1}, {1, 1}, {5, 120}, {-10, 3628800}, {20, 2432902008176640000L}};
    }

    @Test(dataProvider = "first", description = "Value validation and factorial calculate")
    public void calcFactorial(long key, long value) throws Exception {
        assertEquals(value, Factorial.calcFactorial(key));
    }
}