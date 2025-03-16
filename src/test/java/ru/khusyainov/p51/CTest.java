package ru.khusyainov.p51;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CTest {
    @CsvSource({
            "1, 239, 1",
            "115, 1000, 885",
            "2816213588, 239, 151",
            "3, 10, 2",
            "139, 10, 1",
            "91239, 10, 6",
            "6, 10, 8",
            "7, 10, 3",
            "8, 10, 1"
    })
    @ParameterizedTest
    @Timeout(1000)
    void bigFibonacciModTest(long n, int m, int output) {
        assertEquals(output, C.bigFibonacciMod(n, m));
    }
}
