package ru.khusyainov.p36;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ATest {
    @CsvSource({
            "'9\n4 7 2 5 3 1 8 9 6', 1 2 3 4 7 5 8 9 6",
            "'9\n2 1 3 4 7 5 8 9 6', 1 2 3 4 7 5 8 9 6",
            "'4\n3 4 7 17', 3 4 7 17",
            "'5\n1 3 2 9 10', 1 3 2 9 10"
    })
    @ParameterizedTest
    @Timeout(1000)
    void aLomutoPartitioningTest(@ConvertWith(IntArrayConverter.class) Integer[][] input,
                                 @ConvertWith(IntArrayConverter.class) Integer[] output) {
        assertArrayEquals(output, new A().sort(input));
    }
}
