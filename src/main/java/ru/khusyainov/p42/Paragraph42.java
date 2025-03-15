package ru.khusyainov.p42;

import static ru.khusyainov.utils.Services.integersToString;

/**
 * 4.2. Задача "Сумма двух чисел".
 */
public class Paragraph42 {
    private static final String TEMPLATE = "\tFor input:%n%s%n\tSum of %s is:%n%s%n%n";

    public static void main(String[] args) {
        System.out.println("Sum of two numbers.\n");
        Integer[][] input = new Integer[][]{{2}, {7, 37, 73}, {6}, {13, 17, 37, 73, 31, 19, 23}};
        print(input[1][0] + ", " + input[1][1], "numbers",
                String.valueOf(new A().sumNumbers(input[1][0], input[1][1])));

        print(input, "polynomials", new B().sumPolynomials(input));

        String[] input2 = new String[]{"5", "abcde", "fedcb"};
        print(String.join("\n", input2), "rows", new C().sumRows(input2));

        input = new Integer[][]{{2, 3}, {7, 37, 73}, {13, 17, 37}, {73, 31, 19}, {23, 2, 3}};
        print(input, "matrices", new D().sumMatrices(input));
    }

    private static void print(String input, String sumType, String output) {
        System.out.printf(TEMPLATE, input, sumType, output);
    }

    private static void print(Integer[][] input, String sumType, Integer[][] output) {
        print(integersToString(input), sumType, integersToString(output));
    }
}
