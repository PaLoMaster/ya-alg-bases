package ru.khusyainov.p32;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import ru.khusyainov.utils.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    private static final String LS = System.lineSeparator();

    private static Stream<Arguments> dataForTest() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments("3" + LS + "1 3" + LS + "2 3" + LS + "4 5", 2));
        out.add(Arguments.arguments("5" + LS + "1 2" + LS + "2 3" + LS + "4 5" + LS + "4 5" + LS + "5 6", 2));
        out.add(Arguments.arguments("2" + LS + "1 50" + LS + "49 50", 1));
        out.add(Arguments.arguments("11" + LS + "0 16" + LS + "3 8" + LS + "0 4" + LS + "19 21" + LS + "3 5" + LS +
                "12 14" + LS + "8 12" + LS + "8 19" + LS + "2 9" + LS + "6 10" + LS + "15 18", 5));
        return out.stream();
    }

    @MethodSource("dataForTest")
    @ParameterizedTest
    void bookAMeetingRoomTest(String input, int output) {
        Services.writeToInput(input);
        A.bookAMeetingRoom();
        assertEquals(output, Services.getIntegerFromOutput());
    }
}
