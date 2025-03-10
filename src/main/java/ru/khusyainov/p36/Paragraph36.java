package ru.khusyainov.p36;

import ru.khusyainov.p35.ArraysSort;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 3.6. Рандомизированные алгоритмы.
 */
public class Paragraph36 {
    public static void main(String[] args) {
        Integer[][] arr = new Integer[][]{{7}, {13, 17, 37, 73, 31, 19, 23}};
        sort(new A(), arr, "A Lamuto");
        ArraysSort quickSort = new B();
        sort(quickSort, arr, "Quick");
    }

    private static void sort(ArraysSort sort, Integer[][] input, String sortType) {
        System.out.printf("\tFor input:%n%s%n\t%s sorted output array is:%n%s%n%n",
                Arrays.stream(input).map(a -> Arrays.stream(a).map(String::valueOf)
                                .collect(Collectors.joining(", ")))
                        .collect(Collectors.joining("\n")),
                sortType,
                Arrays.stream(sort.sort(input)).map(String::valueOf).collect(Collectors.joining(", ")));
    }
}
