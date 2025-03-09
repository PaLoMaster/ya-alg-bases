package ru.khusyainov.p35;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CTest {
    private static Stream<Arguments> dataForTest() {
        List<Arguments> args = new ArrayList<>();
        args.add(Arguments.arguments(new Integer[][]{{7}, {13, 17, 37, 73, 31, 19, 23}},
                new Integer[]{13, 17, 19, 23, 31, 37, 73}));
        args.add(Arguments.arguments(new Integer[][]{{4}, {18, 20, 3, 17}},
                new Integer[]{3, 17, 18, 20}));
        args.add(Arguments.arguments(new Integer[][]{{3}, {0, 11, 0}},
                new Integer[]{0, 0, 11}));
        return args.stream();
    }

    @MethodSource("dataForTest")
    @ParameterizedTest
    void mergeSortTest(Integer[][] input, Integer[] output) {
        assertArrayEquals(output, new C().sort(input));
    }
}
