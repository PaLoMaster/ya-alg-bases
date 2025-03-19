package ru.khusyainov.p61;

import java.util.*;

/**
 * Размен: все варианты.
 * <p>
 * Предположим, что у кассира есть бесконечное количество монет номиналами 1, 5, 10. Найдите все наборы монет,
 * которые в сумме дают money. Требуется вывести количество подходящих наборов монет и сами наборы.
 * Два набора считаются различными, если мультимножества монет не совпадают.
 * <ul>
 * <li>стандартный ввод или input.txt: целое число money. Ограничения: 1 ≤ money ≤ 10^3;</li>
 * <li>стандартный вывод или output.txt:
 * <ul>
 * <li>в первой строке выведите количество наборов m;</li>
 * <li>в следующих m строк выведите сами наборы: количество монет и номиналы монет.
 * Наборы монет можете выводить в любом порядке.</li>
 * </ul></li>
 * </ul>
 */
public class A {
    private static final int[] COINS = new int[]{10, 5, 1};

    public static Integer[][] change(int money) {
        List<Integer[]> coins = new LinkedList<>();
        for (int ten = 0; ten <= money / COINS[0]; ten++) {
            for (int five = 0, one, count; five <= money / COINS[1]; five++) {
                one = money - COINS[0] * ten - COINS[1] * five;
                count = one + five + ten;
                if (one >= 0 && count > 0) {
                    coins.add(0, new Integer[]{count, ten, five, one});
                }
            }
        }
        List<Integer[]> result = new LinkedList<>();
        result.add(new Integer[]{coins.size()});
        for (Integer[] coinsChange : coins) {
            int count = coinsChange[0];
            Integer[] change = new Integer[count + 1];
            change[0] = count;
            for (int i = COINS.length, j = 1; i > 0; i--) {
                while (coinsChange[i] - 1 >= 0) {
                    change[j++] = COINS[i - 1];
                    coinsChange[i]--;
                }
            }
            result.add(change);
        }
        return result.toArray(Integer[][]::new);
    }
}
