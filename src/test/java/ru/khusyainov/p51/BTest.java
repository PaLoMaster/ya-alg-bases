package ru.khusyainov.p51;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BTest {
    @CsvSource({
            "3, 2",
            "139, 1",
            "91239, 6",
            "6, 8",
            "7, 3",
            "8, 1"
    })
    @ParameterizedTest
    @Timeout(1000)
    void theFibonacciLastDigitTest(int input, int output) {
        assertEquals(output, B.theFibonacciLastDigit(input));
    }
}
