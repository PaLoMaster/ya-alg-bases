package ru.khusyainov.p34;

import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ATest {
    @CsvSource({
            "3, '7\n1 3\n1 2\n3 2\n1 3\n2 1\n2 3\n1 3'",
            "5, '31\n1 3\n1 2\n3 2\n1 3\n2 1\n2 3\n1 3\n1 2\n3 2\n3 1\n2 1\n3 2\n1 3\n1 2\n3 2\n1 3\n2 1\n2 3\n1 3\n2 1\n3 2\n3 1\n2 1\n2 3\n1 3\n1 2\n3 2\n1 3\n2 1\n2 3\n1 3'",
            "4, '15\n1 2\n1 3\n2 3\n1 2\n3 1\n3 2\n1 2\n1 3\n2 3\n2 1\n3 1\n2 3\n1 2\n1 3\n2 3'"
    })
    @ParameterizedTest
    @Timeout(1000)
    void towersOfHanoiTest(int input, String output) {
        assertEquals(output.replace("\n", System.lineSeparator()), new A().solve(input));
    }
}
