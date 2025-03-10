package ru.khusyainov.p35;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 3.5. Алгоритмы "Разделяй и властвуй".
 */
public class Paragraph35 {
    public static void main(String[] args) {
        sort(new A(), new Integer[][]{{7}, {13, 17, 37, 73, 31, 19, 23}}, "selection");
        sort(new C(), new Integer[][]{{7}, {13, 17, 37, 73, 31, 19, 23}}, "merge");
        Integer[][] arr = new Integer[][]{{3}, {3}, {1, 2, 3}, {2}, {1, 2}, {4}, {3, 5, 6, 7}};
        System.out.printf("\tFor input:%n%s%n\tJoined array is:%n%s",
                Arrays.stream(arr)
                        .map(a -> Arrays.stream(a).map(String::valueOf).collect(Collectors.joining(", ")))
                        .collect(Collectors.joining("\n")),
                Arrays.stream(new B().merge(arr)).map(String::valueOf).collect(Collectors.joining(", ")));
    }

    private static void sort(ArraysSort sort, Integer[][] input, String sortType) {
        System.out.printf("\tFor input:%n%s%n\tSorted with %s sort output array is:%n%s%n%n",
                Arrays.stream(input)
                        .map(a -> Arrays.stream(a).map(String::valueOf).collect(Collectors.joining(", ")))
                        .collect(Collectors.joining("\n")),
                sortType,
                Arrays.stream(sort.sort(input)).map(String::valueOf).collect(Collectors.joining(", ")));
    }
}
