package ru.khusyainov.p31;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.Services;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BTest {
    @CsvSource({
            "3 2, 3",
            "7 5, 21",
            "1 1, 1"
    })
    @ParameterizedTest
    void permutationsTest(String input, int output) {
        Services.writeToInput(input);
        B.combinations();
        assertEquals(output, Services.getIntegerFromOutput());
    }
}
