package ru.khusyainov.p36;

import ru.khusyainov.p35.ArraysSort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Быстрая сортировка.
 * <p>
 * Реализуйте QuickSort.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>в первой строке задано число n (1 ≤ n ≤ 100000);</li>
 * <li>во второй строке задано n чисел ai (1 ≤ ai ≤ 10^9).</li>
 * </ul></li>
 * <li>стандартный вывод или output.txt: отсортированный массив чисел в одну строку.</li>
 * </ul>
 */
public class B extends ArraysSort {
    Random random = new Random();

    public Integer[] sort(Integer[][] input) {
        return solution(input[0][0], Arrays.stream(input[1]).collect(Collectors.toList())).toArray(Integer[]::new);
    }

    private List<Integer> solution(Integer elementsCount, List<Integer> elements) {
        if (elementsCount <= 1) {
            return elements;
        }
        List<Integer> smaller = new LinkedList<>(), bigger = new LinkedList<>();
        boolean middleNotSkiped = true;
        Integer middle = elements.get(random.nextInt(elementsCount)); // https://t.me/handbook_algorithms/6/2650
        for (Integer element : elements) {
            if (element < middle) {
                smaller.add(element);
            } else if (element > middle) {
                bigger.add(element);
            } else {
                if (middleNotSkiped) {
                    middleNotSkiped = false;
                } else {
                    smaller.add(element);
                }
            }
        }
        smaller = solution(smaller.size(), smaller);
        bigger = solution(bigger.size(), bigger);
        smaller.add(middle);
        smaller.addAll(bigger);
        return smaller;
    }
}
