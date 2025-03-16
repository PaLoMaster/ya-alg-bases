package ru.khusyainov.p43;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    @CsvSource({
            "'3\n1 2 3', 6",
            "'5\n2 9 3 1 9', 81",
            "'2\n0 1', 0",
            "'2\n100000 100000', 10000000000",
            "'4\n100000 100000 100000 99999', 10000000000"
    })
    @ParameterizedTest
    @Timeout(1000)
    void maxProductTest(@ConvertWith(IntArrayConverter.class) Integer[][] input, Long output) {
        assertEquals(output, A.maxProduct(input));
    }
}
