package ru.khusyainov.p35;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BTest {
    private static Stream<Arguments> dataForTest() {
        List<Arguments> args = new ArrayList<>();
        args.add(Arguments.arguments(new Integer[][]{{3}, {3}, {1, 2, 3}, {2}, {1, 2}, {4}, {3, 5, 6, 7}},
                new Integer[]{1, 1, 2, 2, 3, 3, 5, 6, 7}));
        args.add(Arguments.arguments(new Integer[][]{{2}, {2}, {1, 10}, {3}, {7, 9, 11}},
                new Integer[]{1, 7, 9, 10, 11}));
        args.add(Arguments.arguments(new Integer[][]{{1}, {10}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}},
                new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        return args.stream();
    }

    @MethodSource("dataForTest")
    @ParameterizedTest
    void arraysJoinTest(Integer[][] input, Integer[] output) {
        assertArrayEquals(output, new B().merge(input));
    }
}
