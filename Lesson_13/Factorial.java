public class Factorial {

    static long calcFactorial(long a) throws Exception {
        if (a < 0) {
            throw new IllegalArgumentException("Value < 0");
        }

        long facto = 1;
        for (long i = 1; i <= a; i++) {
            facto *= i;
        }
        return facto;
    }
}
