package ru.khusyainov.p35;

import java.util.Arrays;

/**
 * Сортировка слиянием.
 * <p>
 * Реализуйте сортировку слиянием.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>в первой строке задано число n (1 ≤ n ≤ 100000);</li>
 * <li>во второй строке задано n чисел ai (0 ≤ ai ≤ 10^9).</li>
 * </ul></li>
 * <li>стандартный вывод или output.txt: отсортированный массив чисел в одну строку.</li>
 * </ul>
 */
public class C extends ArraysSort {
    public Integer[] sort(Integer[][] input) {
        return solution(input[0][0], input[1]);
    }

    private Integer[] solution(Integer elementsCount, Integer[] elements) {
        if (elementsCount == 1) {
            return elements;
        } else if (elementsCount == 2) {
            if (elements[0] < elements[1]) {
                return elements;
            }
            Integer temp = elements[1];
            elements[1] = elements[0];
            elements[0] = temp;
            return elements;
        }
        int part1Count = elementsCount / 2, part2Count = elementsCount - part1Count;
        Integer[] part1 = Arrays.copyOf(elements, part1Count);
        Integer[] part2 = Arrays.copyOfRange(elements, part1Count, elementsCount);
        return new B().merge(new Integer[][]{
                {2},
                {part1Count}, solution(part1Count, part1),
                {part2Count}, solution(part2Count, part2)});
    }
}
