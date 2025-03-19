package ru.khusyainov.p61;

import ru.khusyainov.utils.Services;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * 6.1. Задача "Размен".
 */
public class Paragraph61 {
    public static void main(String[] args) {
        System.out.println("""
                The "Exchange" task.
                Series of combinations starts with number of coins, then the denominations of the coins.
                """);
        Random random = new Random();
        for (int i = 0, j; i < 5; i++) {
            j = random.nextInt(100);
            System.out.printf("\tAll possible combinations of change %d in coins 1, 5 and 10: %s%n" +
                    "\tMinimum combination of change %1$d in coins 1, 5, 10, 20 and 50:%n%s%n%n",
                    j, Services.integersToString(A.change(j)),
                    Arrays.stream(B.change(j)).map(a -> Arrays.stream(a)
                            .map(String::valueOf).collect(Collectors.joining(" ")))
                            .collect(Collectors.joining(" ")));
        }
    }
}
