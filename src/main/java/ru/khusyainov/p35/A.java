package ru.khusyainov.p35;

/**
 * Сортировка выбором.
 * <p>
 * Реализуйте сортировку выбором.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>в первой строке задано число n (1 ≤ n ≤ 1000);</li>
 * <li>во второй строке задано n чисел ai (1 ≤ ai ≤ 10^9).</li>
 * </ul></li>
 * <li>стандартный вывод или output.txt: отсортированный массив чисел в одну строку.</li>
 * </ul>
 */
public class A extends ArraysSort {
    public Integer[] sort(Integer[][] input) {
        return solution(input[0][0], input[1]);
    }

    private Integer[] solution(Integer elementsCount, Integer[] elements) {
        for (int i = 0, minIndex; i < elementsCount - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < elementsCount; j++) {
                if (elements[j] < elements[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex > i) {
                Integer temp = elements[minIndex];
                elements[minIndex] = elements[i];
                elements[i] = temp;
            }
        }
        return elements;
    }
}
