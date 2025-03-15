package ru.khusyainov.p43;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BTest {
    @CsvSource({
            "2, No",
            "10, Yes",
            "6, No",
            "7, Yes",
            "12, Yes"
    })
    @ParameterizedTest
    void maxProductComparisonCountTest(Integer input, String output) {
        assertEquals(output, new B().maxProductComparisonCount(input)[0]);
    }
}
