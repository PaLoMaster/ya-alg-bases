package ru.khusyainov.p35;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ATest {
    private static Stream<Arguments> dataForTest() {
        List<Arguments> args = new ArrayList<>();
        args.add(Arguments.arguments(new Integer[][]{{7}, {13, 17, 37, 73, 31, 19, 23}},
                new Integer[]{13, 17, 19, 23, 31, 37, 73}));
        args.add(Arguments.arguments(new Integer[][]{{6}, {12, 18, 7, 11, 5, 17}},
                new Integer[]{5, 7, 11, 12, 17, 18}));
        args.add(Arguments.arguments(new Integer[][]{{3}, {1, 2, 3}}, new Integer[]{1, 2, 3}));
        return args.stream();
    }

    @MethodSource("dataForTest")
    @ParameterizedTest
    void selectionSortTest(Integer[][] input, Integer[] output) {
        assertArrayEquals(output, new A().sort(input));
    }
}
