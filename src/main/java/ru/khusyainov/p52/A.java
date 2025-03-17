package ru.khusyainov.p52;

/**
 * Наибольший общий делитель.
 * <p>
 * Для двух чисел a и b найдите их наибольший общий делитель.
 * <ul>
 * <li>стандартный ввод или input.txt: целые числа a и b. Ограничения: 1 ≤ a, b ≤ 2 * 10^9;</li>
 * <li>стандартный вывод или output.txt: наибольший общий делитель чисел a и b, одно число.</li>
 * </ul>
 */
public class A {
    public static int greatestCommonDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }
        return greatestCommonDivisor(b, a % b);
    }
}
