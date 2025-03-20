package ru.khusyainov.p63;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.IntArrayConverter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    @CsvSource({
            "'1\n23\n39', 897",
            "'3\n2 3 9\n7 4 2', 79",
            "'1\n100000\n100000', 10000000000",
            "'3\n0 3 9\n7 4 2', 75"
    })
    @ParameterizedTest
    @Timeout(1000)
    void advertisingCampaignTest(@ConvertWith(IntArrayConverter.class) Integer[][] input, long output) {
        assertEquals(output, A.advertisingCampaign(input));
    }
}
