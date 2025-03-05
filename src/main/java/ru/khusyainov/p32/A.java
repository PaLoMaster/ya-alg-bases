package ru.khusyainov.p32;

import ru.khusyainov.utils.Services;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Бронирование переговорки.
 * <p>
 * Задано n интервалов. Требуется найти максимальное количество взаимно непересекающихся интервалов.
 * Два интервала пересекаются, если они имеют хотя бы одну общую точку.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>в первой строке задано одно число n (1 ≤ n ≤100) — количество интервалов;</li>
 * <li>в следующих n строках заданы интервалы li, ri (1 ≤ li ≤ ri ≤ 50).</li>
 * </ul></li>
 * <li>стандартный вывод или output.txt: одно число.</li>
 * </ul>
 */
public class A {
    public static void bookAMeetingRoom() {
        Queue<Integer[]> input = new LinkedList<>(Services.getIntegersFromInput());
        input.poll();
        Services.writeToOutput(countChampions(input));
    }

    private static int countChampions(Queue<Integer[]> filtered) {
        if (filtered.size() == 0) {
            return 0;
        }
        return 1 + countChampions(excludeIntersections(filtered, getChampion(filtered)));
    }

    private static Queue<Integer[]> excludeIntersections(Queue<Integer[]> from, Integer[] champion) {
        return from.stream().filter(next -> next[1] < champion[0] || next[0] > champion[1])
                .collect(Collectors.toCollection(LinkedList::new));
    }

    private static Integer[] getChampion(Queue<Integer[]> from) {
        return from.stream().reduce((a, b) -> a[1] < b[1] ? a : b).orElse(from.peek());
    }
}
