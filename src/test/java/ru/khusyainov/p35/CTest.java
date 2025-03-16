package ru.khusyainov.p35;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CTest {
    @CsvSource({
            "'7\n13 17 37 73 31 19 23', 13 17 19 23 31 37 73",
            "'4\n18 20 3 17', 3 17 18 20",
            "'3\n0 11 0', 0 0 11"
    })
    @ParameterizedTest
    @Timeout(1000)
    void mergeSortTest(@ConvertWith(IntArrayConverter.class) Integer[][] input,
                       @ConvertWith(IntArrayConverter.class) Integer[] output) {
        assertArrayEquals(output, new C().sort(input));
    }
}
