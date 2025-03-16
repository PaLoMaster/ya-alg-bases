package ru.khusyainov.p42;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.StringArrayConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CTest {
    @CsvSource({
            "'3\nabc\ndef', adbecf",
            "'5\nabaca\nbdaef', abbdaaceaf",
            "'10\nabacaabaca\nbdaefbdaef', abbdaaceafabbdaaceaf",
            "'1\ny\nz', yz"
    })
    @ParameterizedTest
    @Timeout(1000)
    void sumRowsTest(@ConvertWith(StringArrayConverter.class) String[] input, String output) {
        assertEquals(output, C.sumRows(input));
    }
}
