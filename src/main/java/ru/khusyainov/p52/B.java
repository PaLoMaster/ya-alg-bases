package ru.khusyainov.p52;

/**
 * Наименьшее общее кратное.
 * <p>
 * Для двух чисел a и b найдите их наименьшее общее кратное.
 * <ul>
 * <li>стандартный ввод или input.txt: целые числа a и b. Ограничения: 1 ≤ a, b ≤ 2 * 10^9;</li>
 * <li>стандартный вывод или output.txt: наименьшее общее кратное чисел a и b, одно число.</li>
 * </ul>
 */
public class B {
    public static long leastCommonMultiple(int a, int b) {
        return (a * (long) b) / A.greatestCommonDivisor(a, b);
    }
}
