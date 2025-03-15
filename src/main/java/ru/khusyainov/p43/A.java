package ru.khusyainov.p43;

import java.util.Arrays;

/**
 * Максимальное произведение.
 * <p>
 * Дана последовательность неотрицательных целых чисел a1, …, an. Вычислите max ai * aj, 1 ≤ i ≠ j ≤ n.
 * Обратите внимание, что i и j должны быть разными, хотя в каких-то случаях можно наблюдать, что ai = aj.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>первая строка содержит целое число n;</li>
 * <li>следующая строка содержит n неотрицательных целых чисел a1, …, an (разделены пробелами).</li>
 * </ul>
 * Ограничения: 2 ≤ n ≤ 2 * 10^5, 0 ≤ a1, …, an ≤ 2 * 10^5;</li>
 * <li>стандартный вывод или output.txt: максимальное попарное произведение, одно число.</li>
 * </ul>
 */
public class A {
    public Long maxProduct(Integer[][] input) {
        Integer[] sorted = input[1];
        Arrays.sort(sorted);
        int i = sorted.length - 1;
        return Math.multiplyFull(sorted[i], sorted[--i]);
    }
}
