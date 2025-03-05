package ru.khusyainov.p32;

import ru.khusyainov.utils.Services;

import java.util.List;

/**
 * 3.2. Жадные алгоритмы.
 */
public class Paragraph32 {
    public static void main(String[] args) {
        final String LS = System.lineSeparator();
        final String count = "11";
        final String time = "0 16" + LS + "3 8" + LS + "0 4" + LS + "19 21" + LS + "3 5" + LS +
                "12 14" + LS + "8 12" + LS + "8 19" + LS + "2 9" + LS + "6 10" + LS + "15 18";
        Services.writeToInput(count + LS + time);
        A.bookAMeetingRoom();
        System.out.println("\tFor " + count + " time intervals:" + LS + time + LS +
                "\tMaximum not intersected intervals should be 5: " + Services.getIntegerFromOutput() + LS +
                "Intervals visualization:");
        List<Integer[]> in = Services.getIntegersFromInput();
        in.remove(0);
        in.forEach(i -> System.out.printf("%s%s%s (%2d, %2d)%n", ".".repeat(i[0]), "*".repeat(i[1] - i[0] + 1)
                    , ".".repeat(21 - i[1]), i[0], i[1]));
    }
}
