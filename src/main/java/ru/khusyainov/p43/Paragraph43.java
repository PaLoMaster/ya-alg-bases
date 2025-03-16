package ru.khusyainov.p43;

import static ru.khusyainov.utils.Services.integersToString;

/**
 * 4.2. Задача "Максимальное произведение".
 */
public class Paragraph43 {
    private static final String TEMPLATE = "\tFor input:%n%s%n\tMaximum product of %s numbers must be %s:%n%s%n%n";
    private static final String TEMPLATE_COUNTER =
            "\tFor input n: %s%nMaximum product of two numbers with 1.5n comparisons can%s%n%n";

    public static void main(String[] args) {
        System.out.println("Maximum product.\n");
        Integer[][] input = new Integer[][]{{7}, {13, 17, 37, 73, 31, 19, 23}};
        print(input, "two", 37 * 73, A.maxProduct(input));
        printCounter(input[0][0]);
        printCounter(6);
        printCounter(15);
        print(input, "three", 37 * 73 * 31, C.maxThreeProduct(input));
        print(input, "four", 37 * 73 * 31 * 23, D.maxFourProduct(input));
    }

    private static <T> void print(Integer[][] input, String productCount, int shouldBe, T value) {
        System.out.printf(TEMPLATE, integersToString(input), productCount, shouldBe, value);
    }

    private static void printCounter(Integer input) {
        String[] output = B.maxProductComparisonCount(input);
        System.out.printf(TEMPLATE_COUNTER, input,
                output[0].equals("Yes") ? " be like this:\n" + output[1] : "'t be reached.");
    }
}
