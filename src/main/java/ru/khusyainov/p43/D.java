package ru.khusyainov.p43;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * Максимальное произведение четырёх чисел.
 * <p>
 * Дана последовательность неотрицательных целых чисел a1, …, an. Вычислите max(ai * aj * ak * al), 1 ≤ i ≠ j
 * ≠ k ≠ l ≤ n. Обратите внимание, что i, j, k и l должны быть разными, хотя в каких-то случаях значения
 * элементов могут совпадать, то есть, например, ai = aj.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>первая строка содержит целое число n;</li>
 * <li>следующая строка содержит n целых чисел a1, …, an (разделены пробелами).</li>
 * </ul>
 * Ограничения: 4 ≤ n ≤ 2 * 10^5, -2 * 10^4 ≤ a1, …, an ≤ 2 * 10^4;</li>
 * <li>стандартный вывод или output.txt: максимальное произведение четырёх элементов, одно число.</li>
 * </ul>
 */
public class D {
    public static BigInteger maxFourProduct(Integer[][] input) {
        Integer[] sorted = input[1];
        Arrays.sort(sorted);
        int i = sorted.length - 1;
        BigInteger multiply = multiply(sorted[i], sorted[i - 1], sorted[i - 2], sorted[i - 3]);
        multiply = multiply.max(multiply(sorted[0], sorted[1], sorted[2], sorted[3]));
        multiply = multiply.max(multiply(sorted[0], sorted[1], sorted[i], sorted[i - 1]));
        return multiply;
    }

    private static BigInteger multiply(int i, int j, int k, int l) {
        return BigInteger.valueOf(Math.multiplyFull(i, j)).multiply(BigInteger.valueOf(Math.multiplyFull(k, l)));
    }
}
