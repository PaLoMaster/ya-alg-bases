package ru.khusyainov.p51;

/**
 * Последняя цифра частичной суммы чисел Фибоначчи.
 * <p>
 * Даны числа m и n, необходимо найти последнюю цифру Fm + Fm+1 + … + Fn.
 * <ul>
 * <li>стандартный ввод или input.txt: целые числа m и n. Ограничения: 0 ≤ m ≤ n ≤ 10^14;</li>
 * <li>стандартный вывод или output.txt: последняя цифра суммы Fm + Fm+1 + … + Fn, одно число.</li>
 * </ul>
 */
public class E {
    public static int theFibonacciPartialSumLastDigit(Long m, Long n) {
        if (m <= 1) {
            return D.theFibonacciSumLastDigit(n);
        }
        return (D.theFibonacciSumLastDigit(n) - D.theFibonacciSumLastDigit(--m) + 10) % 10;
    }
}
