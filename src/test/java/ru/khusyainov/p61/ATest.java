package ru.khusyainov.p61;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ATest {
    @CsvSource({
            "10, '4\n1 10\n2 5 5\n6 1 1 1 1 1 5\n10 1 1 1 1 1 1 1 1 1 1'",
            "1, '1\n1 1'",
            "5, '2\n1 5\n5 1 1 1 1 1'"
    })
    @ParameterizedTest
    @Timeout(1000)
    void changeTest(int input, @ConvertWith(IntArrayConverter.class) Integer[][] output) {
        assertArrayEquals(output, A.change(input));
    }
}
