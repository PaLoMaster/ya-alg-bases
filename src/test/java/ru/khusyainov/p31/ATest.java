package ru.khusyainov.p31;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.Services;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, 6",
            "4, 24",
            "5, 120",
            "6, 720",
            "7, 5040"
    })
    @ParameterizedTest
    @Timeout(1000)
    void permutationsTest(int input, int output) {
        Services.writeToInput(input);
        A.permutations();
        assertEquals(output, Services.getIntegerFromOutput());
    }
}
