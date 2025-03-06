package ru.khusyainov.p33;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    @CsvSource({
            "10, 2, Lose",
            "4, 5, Win",
            "6, 8, Lose"
    })
    @ParameterizedTest
    void roksTest(int myRoksCount, int hisRoksCount, String output) {
        assertEquals(output, new A().solve(myRoksCount, hisRoksCount));
    }
}
