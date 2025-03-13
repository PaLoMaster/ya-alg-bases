package ru.khusyainov.p42;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class DTest {
    @CsvSource({
            "'2 3\n1 2 3\n4 5 6\n-1 -2 -3\n-4 -5 -6', '0 0 0\n0 0 0'",
            "'2 3\n1 2 3\n4 5 6\n1 2 3\n4 5 6', '2 4 6\n8 10 12'",
            "'10 3\n1 2 3\n4 5 6\n1 2 3\n4 5 6\n1 2 3\n4 5 6\n1 2 3\n4 5 6\n1 2 3\n4 5 6\n1 2 3\n4 5 6\n1 2 3\n4 5 6\n1 2 3\n4 5 6\n1 2 3\n4 5 6\n1 2 3\n4 5 6', '2 4 6\n8 10 12\n2 4 6\n8 10 12\n2 4 6\n8 10 12\n2 4 6\n8 10 12\n2 4 6\n8 10 12'"
    })
    @ParameterizedTest
    void sumManyRowsMatricesTest(@ConvertWith(IntArrayConverter.class) Integer[][] input,
                                 @ConvertWith(IntArrayConverter.class) Integer[][] output) {
        assertArrayEquals(output, new D().sumMatrices(input));
    }

    @CsvSource({
            "'1 10\n1 2 3 4 5 6 7 8 9 10\n-1 -2 -3 -4 -5 -6 -7 -8 -9 -10', '0 0 0 0 0 0 0 0 0 0'",
            "'1 3\n1 2 3\n4 5 6', '5 7 9'"
    })
    @ParameterizedTest
    void sumOneRowMatricesTest(@ConvertWith(IntArrayConverter.class) Integer[][] input,
                               @ConvertWith(IntArrayConverter.class) Integer[] output) {
        assertArrayEquals(output, new D().sumMatrices(input)[0]);
    }
}
