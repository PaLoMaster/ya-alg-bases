package ru.khusyainov.p51;

/**
 * Последняя цифра числа Фибоначчи.
 * <p>
 * Дано число n, необходимо найти последнюю цифру n-го числа Фибоначчи.
 * Числа Фибоначчи растут очень быстро, поэтому при их вычислении нужно быть аккуратным с переполнением.
 * В данной задаче, впрочем, этой проблемы можно избежать, поскольку нас интересует только последняя цифра
 * числа Фибоначчи: если 0 ≤ a, b ≤ 9 - последние цифры чисел Fi и F{i+1} соответственно, то (a+b) mod 10 -
 * последняя цифра числа F{i+2}.
 * <ul>
 * <li>стандартный ввод или input.txt: целое число n. Ограничения: 0 ≤ n ≤ 10^6;</li>
 * <li>стандартный вывод или output.txt: последняя цифра из Fn, одно число.</li>
 * </ul>
 */
public class B {
    public static int theFibonacciLastDigit(Integer n) {
        if (n <= 1) {
            return n;
        }
        int[] fn = new int[n + 1];
        fn[0] = 0;
        fn[1] = 1;
        for (int i = 2; i <= n; i++) {
            fn[i] = (fn[i - 1] + fn[i - 2]) % 10;
        }
        return fn[n];
    }
}
