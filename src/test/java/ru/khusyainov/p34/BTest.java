package ru.khusyainov.p34;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BTest {
    @CsvSource({
            "3, 5",
            "4, 9",
            "5, 13"
    })
    @ParameterizedTest
    void towersOfHanoiTest(int input, String output) {
        assertEquals(output, new B().solve(input));
    }
}
