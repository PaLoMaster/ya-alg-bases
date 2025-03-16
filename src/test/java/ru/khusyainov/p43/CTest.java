package ru.khusyainov.p43;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CTest {
    @CsvSource({
            "'3\n1 2 3', 6",
            "'3\n-1 -2 -2', -4",
            "'4\n-1 -3 -2 -4', -6",
            "'5\n-1 0 -3 -2 0', 0",
            "'5\n2 9 3 1 9', 243",
            "'3\n200000 200000 200000', 8000000000000000",
            "'5\n200000 -200000 -200000 200000 199999', 8000000000000000",
            "'5\n200000 200000 200000 200000 199999', 8000000000000000"
    })
    @ParameterizedTest
    @Timeout(1000)
    void maxThreeProductTest(@ConvertWith(IntArrayConverter.class) Integer[][] input, Long output) {
        assertEquals(output, C.maxThreeProduct(input));
    }
}
