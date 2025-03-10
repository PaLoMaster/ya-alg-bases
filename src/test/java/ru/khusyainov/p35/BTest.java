package ru.khusyainov.p35;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BTest {
    @CsvSource({
            "'3\n3\n1 2 3\n2\n1 2\n4\n3 5 6 7', 1 1 2 2 3 3 5 6 7",
            "'2\n2\n1 10\n3\n7 9 11', 1 7 9 10 11",
            "'1\n10\n1 2 3 4 5 6 7 8 9 10', 1 2 3 4 5 6 7 8 9 10"
    })
    @ParameterizedTest
    void arraysJoinTest(@ConvertWith(IntArrayConverter.class) Integer[][] input,
                        @ConvertWith(IntArrayConverter.class) Integer[] output) {
        assertArrayEquals(output, new B().merge(input));
    }
}
