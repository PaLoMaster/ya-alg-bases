package ru.khusyainov.p52;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class CTest {
    @CsvSource({
            "3, '2 3'",
            "10, '5 8'",
            "10000, '4181 6765'"
    })
    @ParameterizedTest
    @Timeout(1000)
    void maxStepsOfEuclidAlgorithmTest(int input, @ConvertWith(IntArrayConverter.class) Integer[] output) {
        assertArrayEquals(output, C.maxStepsOfEuclidAlgorithm(input));
    }
}
