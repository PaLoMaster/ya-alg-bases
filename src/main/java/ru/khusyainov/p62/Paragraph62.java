package ru.khusyainov.p62;

import static ru.khusyainov.utils.Services.integersToString;

/**
 * 6.2. Задача "Специи".
 */
public class Paragraph62 {
    public static void main(String[] args) {
        System.out.println("The \"Species\" task.\n");
        Integer[][] input = new Integer[][]{{3, 50}, {60, 20}, {100, 50}, {120, 30}};
        System.out.printf("\tFor input: %s%nMax price of stolen species should be %.4f: %.4f.%n%n",
                integersToString(input), 180f, A.species(input));
        input = new Integer[][]{{3, 50}, {20}, {50}, {30}};
        System.out.printf("\tFor input: %s%nMax count of purchased souvenirs should be %d: %d.%n%n",
                integersToString(input), 2, B.souvenirs(input));
    }
}
