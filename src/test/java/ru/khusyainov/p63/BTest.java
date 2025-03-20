package ru.khusyainov.p63;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BTest {
    @CsvSource({
            "'2 4 3\n5 1\n2 2\n4 3\n1 3', 21",
            "'1 1 1\n1 1', 1",
            "'2 4 100\n5 1\n2 2\n4 3\n1 3', 24"
    })
    @ParameterizedTest
    @Timeout(1000)
    void billboardAdvertisingTest(@ConvertWith(IntArrayConverter.class) Integer[][] input, long output) {
        assertEquals(output, B.billboardAdvertising(input));
        assertEquals(output, B.billboardAdvertisingMy(input));
    }
}
