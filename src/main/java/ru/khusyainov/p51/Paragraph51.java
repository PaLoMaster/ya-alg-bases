package ru.khusyainov.p51;

/**
 * 5.1. Задачи о числах Фибоначчи.
 */
public class Paragraph51 {
    private static final String BIG_FIBONACCI_TEXT =
            "Fibonacci number for %d is to big, but it's last digit must be %d: %d%n%n";
    private static final String BIG_FIBONACCI_MOD_TEXT = "(Fibonacci number for %d) mod %d must be %d: %d%n%n";
    private static final String FIBONACCI_SUM_TEXT =
            "Fibonacci numbers sum to %d is big, but it's last digit must be %d: %d%n%n";
    private static final String FIBONACCI_PARTIAL_SUM_TEXT =
            "Fibonacci numbers partial sum from %d to %d is big, but it's last digit must be %d: %d%n%n";

    public static void main(String[] args) {
        System.out.println("Fibonacci numbers.");
        int n = 10, out = 55;
        System.out.printf("Fibonacci number for %d must be %d: %d%n%n", n, out, A.theFibonacci(n));
        bigFibonacciLastDigitText(91239, 6);
        bigFibonacciLastDigitText(100, 5);
        bigFibonacciMod(n, 100, out);
        bigFibonacciMod(2816213588L, 239, 151);
        theFibonacciSumLastDigit(100,5);
        theFibonacciSumLastDigit(2816213588L, 4);
        theFibonacciPartialSumLastDigit(1, 100,5);
        theFibonacciPartialSumLastDigit(101, 2816213588L, 9);
    }

    private static void bigFibonacciLastDigitText(int n, int out) {
        System.out.printf(BIG_FIBONACCI_TEXT, n, out, B.theFibonacciLastDigit(n));
    }

    private static void bigFibonacciMod(long n, int m, int out) {
        System.out.printf(BIG_FIBONACCI_MOD_TEXT, n, m, out, C.bigFibonacciMod(n, m));
    }

    private static void theFibonacciSumLastDigit(long n, int out) {
        System.out.printf(FIBONACCI_SUM_TEXT, n, out, D.theFibonacciSumLastDigit(n));
    }

    private static void theFibonacciPartialSumLastDigit(long start, long end, int out) {
        System.out.printf(FIBONACCI_PARTIAL_SUM_TEXT, start, end, out,
                E.theFibonacciPartialSumLastDigit(start, end));
    }
}
