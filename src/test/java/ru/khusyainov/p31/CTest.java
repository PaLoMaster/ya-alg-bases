package ru.khusyainov.p31;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.Services;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CTest {
    @CsvSource({
            "1 1, 1",
            "4 3, 20",
            "2 2, 3",
            "7 5, 462"
    })
    @ParameterizedTest
    void combinationsTest(String input, int output) {
        Services.writeToInput(input);
        C.combinationsWithRepetitions();
        assertEquals(output, Services.getIntegerFromOutput());
    }
}
