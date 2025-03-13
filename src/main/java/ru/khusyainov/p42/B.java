package ru.khusyainov.p42;

import java.util.*;

/**
 * A(x) + B(x).
 * <p>
 * Решите немного более сложную задачу.
 * Необходимо вычислить сумму двух многочленов A(x) = an * x^n + … + a1 * x + a0 и B(x) = bn * x^n + … + b1 * x + b0.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>в первой строке записано одно число n (0 ≤ n ≤ 10);</li>
 * <li>во второй строке записаны числа an, an-1, …, a0 (-100 ≤ ai ≤ 100, an ≠ 0);</li>
 * <li>в третьей строке записано одно число m (0 ≤ n ≤ 10);</li>
 * <li>в четвёртой строке записаны числа bm, bm-1, …, b0 (-100 ≤ bi ≤ 100, bm ≠ 0).</li>
 * </ul>
 * Гарантируется, что an + bm ≠ 0;</li>
 * <li>стандартный вывод или output.txt:
 * <ul>
 * <li>в первой строке выведите число k — степень многочлена A(x) + B(x);</li>
 * <li>во второй строке выведите коэффициенты этого многочлена: ck, ck-1, …, c1, c0.</li>
 * </ul></li>
 * </ul>
 */
public class B {
    public Integer[][] sumPolynomials(Integer[][] set) {
        List<Integer> list1 = new ArrayList<>(Arrays.asList(set[1])),
                list2 = new ArrayList<>(Arrays.asList(set[3]));
        int count = Integer.max(list1.size(), list2.size());
        List<Integer> resultSum = new ArrayList<>(count);
        Collections.reverse(list1);
        Collections.reverse(list2);
        for (int i = 0; i < count; i++) {
            if (i < list1.size() && i < list2.size()) {
                resultSum.add(list1.get(i) + list2.get(i));
            } else if (i < list1.size()) {
                resultSum.add(list1.get(i));
            } else {
                resultSum.add(list2.get(i));
            }
        }
        Collections.reverse(resultSum);
        return new Integer[][]{{--count}, resultSum.toArray(Integer[]::new)};
    }
}
