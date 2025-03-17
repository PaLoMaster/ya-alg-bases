package ru.khusyainov.p52;

/**
 * Наибольшее число шагов алгоритма Евклида.
 * <p>
 * Алгоритм Евклида можно записать в рекурсивной форме (в псевдокоде):
 * <pre>
 * {@code
 * GCD(a, b):
 *     if a = 0 or b = 0:
 *         return max(a, b)
 *     return GCD(b, a mod b)
 * }
 * </pre>
 * Вызов функции GCD(5, 0) не порождает дополнительных рекурсивных вызовов. А вызов GCD(5, 2) -
 * порождает вызовы GCD(2,1) и GCD(1,0). Количество шагов алгоритма Евклида будет равняться
 * количеству вызовов функции GCD для заданных значений a и b. Дано число n, найдите значения
 * a и b (0 ≤ a, b ≤ n), для которых количество вызовов функции GCD будет наибольшим.
 * <ul>
 * <li>стандартный ввод или input.txt: целое число n. Ограничения: 1 ≤ n ≤ 10^9;</li>
 * <li>стандартный вывод или output.txt: Значения a и b, разделённые пробелом. Если существует несколько пар
 * значений a и b, для которых количество вызовов функции GCD наибольшее, то выведите любую из таких пар.</li>
 * </ul>
 */
public class C {
    public static Integer[] maxStepsOfEuclidAlgorithm(int limit) {
        int previous = 0, current = 1, i;
        while (current + previous <= limit) {
            i = previous;
            previous = current;
            current = i + current;
        }
        return new Integer[]{previous, current};
    }
}
