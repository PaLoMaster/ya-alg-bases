package ru.khusyainov.p32;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.khusyainov.utils.Services;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    @CsvSource({
            "'3\n1 3\n2 3\n4 5', 2",
            "'5\n1 2\n2 3\n4 5\n4 5\n5 6', 2",
            "'2\n1 50\n49 50', 1",
            "'11\n0 16\n3 8\n0 4\n19 21\n3 5\n12 14\n8 12\n8 19\n2 9\n6 10\n15 18', 5"
    })
    @ParameterizedTest
    @Timeout(1000)
    void bookAMeetingRoomTest(String input, int output) {
        Services.writeToInput(input);
        A.bookAMeetingRoom();
        assertEquals(output, Services.getIntegerFromOutput());
    }
}
