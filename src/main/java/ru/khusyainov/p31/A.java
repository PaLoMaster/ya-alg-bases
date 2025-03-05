package ru.khusyainov.p31;

import ru.khusyainov.utils.Services;

/**
 * Перестановки.
 * <p>
 * Выведите число перестановок P(n).
 * <ul>
 * <li>стандартный ввод или input.txt: одно число n (1 ≤ n ≤7);</li>
 * <li>стандартный вывод или output.txt: одно число.</li>
 * </ul>
 */
public class A {
    public static void permutations() {
        int input = Services.getIntegerFromInput();
        Services.writeToOutput(Services.factorial(input));
    }
}
