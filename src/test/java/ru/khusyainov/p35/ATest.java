package ru.khusyainov.p35;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ATest {
    @CsvSource({
            "'7\n13 17 37 73 31 19 23', 13 17 19 23 31 37 73",
            "'6\n12 18 7 11 5 17', 5 7 11 12 17 18",
            "'3\n1 2 3', 1 2 3"
    })
    @ParameterizedTest
    void selectionSortTest(@ConvertWith(IntArrayConverter.class) Integer[][] input,
                           @ConvertWith(IntArrayConverter.class) Integer[] output) {
        assertArrayEquals(output, new A().sort(input));
    }
}
