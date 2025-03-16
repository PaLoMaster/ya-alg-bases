package ru.khusyainov.p51;

/**
 * Числа Фибоначчи.
 * <p>
 * Дано целое число n, необходимо вычислить n-е число Фибоначчи.
 * Напомним, что F0 = 0, F1 = 1 и Fn = F{n-1} + F{n-2} при n ≥ 2.
 * <ul>
 * <li>стандартный ввод или input.txt: целое число n. Ограничения: 0 ≤ n ≤ 45;</li>
 * <li>стандартный вывод или output.txt: Fn, одно число.</li>
 * </ul>
 */
public class A {
    public static int theFibonacci(Integer n) {
        if (n <= 1) {
            return n;
        }
        int previous = 0, current = 1;
        for (int i = 2, j; i <= n; i++) {
            j = previous;
            previous = current;
            current = j + previous;
        }
        return current;
    }
}
