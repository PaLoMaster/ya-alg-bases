package ru.khusyainov.p42;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    @CsvSource({
            "9 7, 16",
            "0 1, 1",
            "4 7, 11",
            "0 9, 9"
    })
    @ParameterizedTest
    void sumNumbersTest(@ConvertWith(IntArrayConverter.class) Integer[] input, Integer output) {
        assertEquals(output, new A().sumNumbers(input[0], input[1]));
    }
}
