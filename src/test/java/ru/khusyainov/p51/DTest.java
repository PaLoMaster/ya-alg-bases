package ru.khusyainov.p51;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DTest {
    @CsvSource({
            "3, 4",
            "100, 5",
            "4, 7",
            "5, 2",
            "6, 0",
            "7, 3",
            "8, 4",
            "50, 8",
            "1048570, 3"
    })
    @ParameterizedTest
    @Timeout(1000)
    void theFibonacciSumLastDigitTest(long input, int output) {
        assertEquals(output, D.theFibonacciSumLastDigit(input));
    }
}
