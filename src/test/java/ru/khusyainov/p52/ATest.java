package ru.khusyainov.p52;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    @CsvSource({
            "18, 35, 1",
            "28851538, 1183019, 17657"
    })
    @ParameterizedTest
    @Timeout(1000)
    void greatestCommonDivisorTest(int a, int b, long output) {
        assertEquals(output, A.greatestCommonDivisor(a, b));
    }
}
