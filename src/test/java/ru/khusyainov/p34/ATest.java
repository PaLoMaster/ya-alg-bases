package ru.khusyainov.p34;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    private static final String LS = System.lineSeparator();

    private static Stream<Arguments> dataForTest() {
        List<Arguments> args = new ArrayList<>();
        String moves = "1 3" + LS + "1 2" + LS + "3 2" + LS + "1 3" + LS + "2 1" + LS + "2 3" + LS + "1 3";
        args.add(Arguments.arguments(3, "7" + LS + moves));
        moves += LS + "1 2" + LS + "3 2" + LS + "3 1" + LS + "2 1" + LS + "3 2" + LS + moves
                + LS + "2 1" + LS + "3 2" + LS + "3 1" + LS + "2 1" + LS + "2 3" + LS + moves;
        args.add(Arguments.arguments(5, "31" + LS + moves));
        args.add(Arguments.arguments(4, "15" + LS + "1 2" + LS + "1 3" + LS + "2 3" + LS + "1 2" + LS + "3 1" + LS
                + "3 2" + LS + "1 2" + LS + "1 3" + LS + "2 3" + LS + "2 1" + LS + "3 1" + LS + "2 3" + LS +
                "1 2" + LS + "1 3" + LS + "2 3"));
        return args.stream();
    }

    @MethodSource("dataForTest")
    @ParameterizedTest
    void towersOfHanoiTest(int input, String output) {
        assertEquals(output, new A().solve(input));
    }
}
