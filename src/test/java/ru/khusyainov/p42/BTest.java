package ru.khusyainov.p42;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BTest {
    @CsvSource({
            "'3\n1 2 3 4\n2\n1 0 0', '3\n1 3 3 4'",
            "'0\n1\n9\n1 2 3 4 5 6 7 8 9 0', '9\n1 2 3 4 5 6 7 8 9 1'",
            "'1\n1 1\n1\n1 1', '1\n2 2'"
    })
    @ParameterizedTest
    @Timeout(1000)
    void sumPolynomialTest(@ConvertWith(IntArrayConverter.class) Integer[][] input,
                           @ConvertWith(IntArrayConverter.class) Integer[][] output) {
        assertArrayEquals(output, B.sumPolynomials(input));
    }
}
