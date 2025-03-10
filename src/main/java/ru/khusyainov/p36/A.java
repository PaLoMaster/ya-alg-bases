package ru.khusyainov.p36;

import ru.khusyainov.p35.ArraysSort;

/**
 * Разбиение Ломуто.
 * <p>
 * Постройте разбиение Ломуто относительно первого числа.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>в первой строке задано число n (1 ≤ n ≤ 100000);</li>
 * <li>во второй строке задано n чисел ai (1 ≤ ai ≤ 10^9).</li>
 * </ul></li>
 * <li>стандартный вывод или output.txt: разбиение Ломуто в одну строку.</li>
 * </ul>
 */
public class A extends ArraysSort {
    public Integer[] sort(Integer[][] input) {
        return solution(input[0][0], input[1]);
    }

    private Integer[] solution(Integer elementsCount, Integer[] elements) {
        int smallerCount = 1;
        for (int i = 1; i < elementsCount; i++) {
            if (elements[i] <= elements[0]) {
                swap(elements, i, smallerCount++);
            }
        }
        if (smallerCount > 0) {
            swap(elements, 0, --smallerCount);
        }
        return elements;
    }

    private void swap(Integer[] elements, int index1, int index2) {
        Integer temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }
}
