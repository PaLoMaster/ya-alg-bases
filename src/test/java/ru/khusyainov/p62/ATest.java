package ru.khusyainov.p62;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    @CsvSource({
            "'3 50\n60 20\n100 50\n120 30', 180.0000",
            "'1 10\n500 30', 166.6667",
            "'1 1000\n500 30', 500.0000"
    })
    @ParameterizedTest
    @Timeout(1000)
    void speciesTest(@ConvertWith(IntArrayConverter.class) Integer[][] input, float output) {
        float precision = 10000f;
        assertEquals(output, Math.round(A.species(input) * precision) / precision);
    }
}
