package ru.khusyainov.p51;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ETest {
    @CsvSource({
            "3, 7, 1",
            "10, 10, 5",
            "1, 4, 7",
            "1, 5, 2",
            "1, 6, 0",
            "1, 7, 3",
            "1, 8, 4",
            "1, 50, 8",
            "1, 1048570, 3"
    })
    @ParameterizedTest
    @Timeout(1000)
    void theFibonacciPartialSumLastDigitTest(long start, long end, int output) {
        assertEquals(output, E.theFibonacciPartialSumLastDigit(start, end));
    }
}
