package ru.khusyainov.p31;

import ru.khusyainov.utils.Services;

/**
 * Сочетания с повторением.
 * <p>
 * Выведите число сочетаний с повторением C(n,k).
 * <ul>
 * <li>стандартный ввод или input.txt: в первой строке находится два числа n (1 ≤ n ≤ 4), k (1 ≤ k ≤ 4);</li>
 * <li>стандартный вывод или output.txt: одно число.</li>
 * </ul>
 */
public class C {
    public static void combinationsWithRepetitions() {
        Integer[] input = Services.getIntegersFromInput().get(0);
        Services.writeToOutput(combinationsCount(input[0], input[1]));
    }

    private static int combinationsCount(int elementsCount, int combinationElementsCount) {
        return Services.factorial(elementsCount + combinationElementsCount - 1)
                / (Services.factorial(combinationElementsCount)
                * Services.factorial(elementsCount - 1));
    }
}
