package ru.khusyainov.p52;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BTest {
    @CsvSource({
            "6, 8, 24",
            "761457, 614573, 467970912861"
    })
    @ParameterizedTest
    @Timeout(1000)
    void leastCommonMultipleTest(int a, int b, long output) {
        assertEquals(output, B.leastCommonMultiple(a, b));
    }
}
