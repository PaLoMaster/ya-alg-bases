package ru.khusyainov.p43;

/**
 * Максимальное произведение — контрпример.
 * <p>
 * Рассмотрим псевдокод поиска двух максимальных элементов массива:
 * <pre>
 * {@code
 * MaxPairwiseProduct(A[1..n]):
 *     m1 = A[1]
 *     m2 = A[2]
 *     if m2 > m1:
 *         swap(m1, m2)
 *     for i from 3 to n:
 *         if A[i] > m1:
 *             m2 = m1
 *             m1 = A[i]
 *         else:
 *             if A[i] > m2:
 *                 m2 = A[i]
 *     return m1 * m2
 * }
 * </pre>
 * Определите, можно ли построить такой пример входных данных, чтобы количество сравнений в алгоритме
 * MaxPairwiseProduct было больше 1.5n.
 * <ul>
 * <li>стандартный ввод или input.txt: целое число n. Ограничения: 2 ≤ n ≤ 2 * 10^5;</li>
 * <li>стандартный вывод или output.txt:
 * <ul>
 * <li>в единственной строке выведите No, если подходящих входных данных не существует;</li>
 * <li>Иначе в первой строке выведите Yes, а во второй строке n чисел a1, a2, …, an (0 ≤ n ≤ 2 * 10^5) —
 * найденный контрпример. Если походящих последовательностей несколько, выведите любую из них.</li>
 * </ul></li>
 */
public class B {
    public static String[] maxProductComparisonCount(Integer input) {
        if (1 + (input - 2) * 2 <= 1.5 * input) {
            return new String[]{"No"};
        }
        StringBuilder result = new StringBuilder(input * 3).append(input);
        for (int i = 1; i < input; i++) {
            result.append(" ").append(i);
        }
        return new String[]{"Yes", result.toString()};
    }
}
