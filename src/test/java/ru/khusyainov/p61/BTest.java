package ru.khusyainov.p61;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BTest {
    @CsvSource({
            "7, '3\n5 1 1'",
            "10, '1\n10'",
            "1, '1\n1'"
    })
    @ParameterizedTest
    @Timeout(1000)
    void changeTest(int input, @ConvertWith(IntArrayConverter.class) Integer[][] output) {
        assertArrayEquals(output, B.change(input));
    }
}
