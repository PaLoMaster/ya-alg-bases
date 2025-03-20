package ru.khusyainov.p62;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BTest {
    @CsvSource({
            "'3 50\n20\n50\n30', 2",
            "'10 1\n0\n1\n0\n1\n0\n1\n0\n1\n0\n1', 6",
            "'1 10\n500', 0"
    })
    @ParameterizedTest
    @Timeout(1000)
    void souvenirsTest(@ConvertWith(IntArrayConverter.class) Integer[][] input, int output) {
        assertEquals(output, B.souvenirs(input));
    }
}
