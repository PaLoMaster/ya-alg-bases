package ru.khusyainov.p43;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DTest {
    @CsvSource({
            "'4\n1 2 3 4', 24",
            "'4\n-1 -2 3 4', 24",
            "'5\n-1 -3 -2 -4 -5', 120",
            "'6\n0 -1 0 -3 -2 100', 0",
            "'5\n2 9 3 1 9', 486",
            "'4\n200000 200000 200000 200000', 1600000000000000000000",
            "'6\n200000 -200000 -200000 200000 200000 199999', 1600000000000000000000",
            "'6\n-200000 -200000 -200000 -200000 200000 199999', 1600000000000000000000",
            "'6\n200000 200000 200000 200000 200000 199999', 1600000000000000000000"
    })
    @ParameterizedTest
    @Timeout(1000)
    void maxFourProductTest(@ConvertWith(IntArrayConverter.class) Integer[][] input, BigInteger output) {
        assertEquals(0, output.compareTo(D.maxFourProduct(input)));
    }
}
