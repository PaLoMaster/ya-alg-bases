package ru.khusyainov.p51;

/**
 * Последняя цифра суммы чисел Фибоначчи.
 * <p>
 * Дано число n, необходимо найти последнюю цифру F0 + F1 + F2 + … + Fn.
 * <ul>
 * <li>стандартный ввод или input.txt: целое число n. Ограничения: 0 ≤ n ≤ 10^14;</li>
 * <li>стандартный вывод или output.txt: последняя цифра суммы F0 + F1 + F2 + … + Fn, одно число.</li>
 * </ul>
 */
public class D {
    public static int theFibonacciSumLastDigit(Long n) {
        return (B.theFibonacciLastDigit((int) (n % 60) + 2) + 9) % 10;
    }
}
