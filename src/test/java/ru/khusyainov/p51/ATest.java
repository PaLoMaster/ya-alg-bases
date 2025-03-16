package ru.khusyainov.p51;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    @CsvSource({
            "3, 2",
            "10, 55",
            "6, 8",
            "7, 13",
            "0, 0",
            "1, 1",
            "8, 21"
    })
    @ParameterizedTest
    @Timeout(1000)
    void theFibonacciTest(int input, int output) {
        assertEquals(output, A.theFibonacci(input));
    }
}
