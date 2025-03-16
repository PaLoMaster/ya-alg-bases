package ru.khusyainov.p36;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BTest {
    @CsvSource({
            "'7\n13 17 37 73 31 19 23', 13 17 19 23 31 37 73 ",
            "'4\n18 20 3 17', 3 17 18 20",
            "'3\n1 11 1', 1 1 11 "
    })
    @ParameterizedTest
    @Timeout(1000)
    void quickSortTest(@ConvertWith(IntArrayConverter.class) Integer[][] input,
                       @ConvertWith(IntArrayConverter.class) Integer[] output) {
        assertArrayEquals(output, new B().sort(input));
    }
}
