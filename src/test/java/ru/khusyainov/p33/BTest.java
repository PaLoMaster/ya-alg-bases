package ru.khusyainov.p33;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BTest {
    @CsvSource({
            "4, 4, Lose",
            "17, 72, Win",
            "7, 5, Win"
    })
    @ParameterizedTest
    @Timeout(1000)
    void roksTest(int myRoksCount, int hisRoksCount, String output) {
        assertEquals(output, new B().solve(myRoksCount, hisRoksCount));
    }
}
