package ru.khusyainov.p52;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 5.2. Вычисление НОК и НОД.
 */
public class Paragraph52 {
    private static final String GCD = "Greatest common divisor of %d and %d must be %d: %d%n%n";
    private static final String LCM = "Least common multiple of %d and %d must be %d: %d%n%n";
    private static final String MAX_STEPS_EUCLID = "For the %d, the maximum steps of Euclid algorithm will be " +
            "when passing the two previous Fibonacci numbers, which should be %s: %s%n%n";

    public static void main(String[] args) {
        System.out.println("Calculating of least common multiple and greatest common divisor.\n");
        GCD(5, 1, 1);
        LCM(5, 1, 5);
        maxStepsEuclid(5, "3 and 5");
        GCD(6666, 444, 6);
        LCM(6666, 444, 493284);
        maxStepsEuclid(444, "233 and 377");
        maxStepsEuclid(6666, "2584 and 4181");
    }

    private static void GCD(int a, int b, int out) {
        System.out.printf(GCD, a, b, out, A.greatestCommonDivisor(a, b));
    }

    private static void LCM(int a, int b, int out) {
        System.out.printf(LCM, a, b, out, B.leastCommonMultiple(a, b));
    }

    private static void maxStepsEuclid(int a, String out) {
        System.out.printf(MAX_STEPS_EUCLID, a, out, Arrays.stream(C.maxStepsOfEuclidAlgorithm(a))
                .map(String::valueOf).collect(Collectors.joining(" and ")));
    }
}
