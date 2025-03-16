package ru.khusyainov.p43;

import java.util.Arrays;

/**
 * Максимальное произведение трех чисел.
 * <p>
 * Дана последовательность неотрицательных целых чисел a1, …, an. Вычислите max(ai * aj * ak), 1 ≤ i ≠ j ≠ k ≤ n.
 * Обратите внимание, что i, j и k должны быть разными, хотя в каких-то случаях значения элементов могут совпадать,
 * то есть, например, ai = aj.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>первая строка содержит целое число n;</li>
 * <li>следующая строка содержит n целых чисел a1, …, an (разделены пробелами).</li>
 * </ul>
 * Ограничения: 3 ≤ n ≤ 2 * 10^5, -2 * 10^5 ≤ a1, …, an ≤ 2 * 10^5;</li>
 * <li>стандартный вывод или output.txt: максимальное произведение трех элементов, одно число.</li>
 * </ul>
 */
public class C {
    public static Long maxThreeProduct(Integer[][] input) {
        Integer[] sorted = input[1];
        Arrays.sort(sorted);
        int i = sorted.length - 1;
        long multiply1 = multiply(sorted[i], sorted[i - 1], sorted[i - 2]),
                multiply2 = multiply(sorted[0], sorted[1], sorted[i]);
        return Math.max(multiply1, multiply2);
    }

    private static Long multiply(int i, int j, int k) {
        return Math.multiplyExact(Math.multiplyFull(i, j), k);
    }
}
