package ru.khusyainov.p31;

import ru.khusyainov.utils.Services;

/**
 * Сочетания.
 * <p>
 * Выведите число сочетаний C(n,k).
 * <ul>
 * <li>стандартный ввод или input.txt: в первой строке находится два числа n (1 ≤ n ≤ 7), k (1 ≤ k ≤ 7);</li>
 * <li>стандартный вывод или output.txt: одно число.</li>
 * </ul>
 */
public class B {
    public static void combinations() {
        Integer[] input = Services.getIntegersFromInput().get(0);
        Services.writeToOutput(combinationsCount(input[0], input[1]));
    }

    private static int combinationsCount(int elementsCount, int combinationElementsCount) {
        return Services.factorial(elementsCount)
                / (Services.factorial(combinationElementsCount)
                * Services.factorial(elementsCount - combinationElementsCount));
    }
}
