package ru.khusyainov.p61;

import java.util.*;

/**
 * Размен: 1, 5, 10, 20, 50.
 * <p>
 * Предположим, что у кассира есть бесконечное количество монет номиналами 1, 5, 10, 20 и 50. Найдите набор монет
 * с суммарным номиналом money, в котором наименьшее количество монет. Требуется вывести номиналы монет в этом наборе.
 * <ul>
 * <li>стандартный ввод или input.txt: целое число money. Ограничения: 1 ≤ money ≤ 10^5;</li>
 * <li>стандартный вывод или output.txt:
 * <ul>
 * <li>в первой строке выведите количество монет в наборе m;</li>
 * <li>в следующей строке выведите выбранные монеты: номиналы монет. Монеты можете выводить в любом порядке.</li>
 * </ul></li>
 * </ul>
 */
public class B {
    private static final int[] COINS = new int[]{50, 20, 10, 5, 1};

    public static Integer[][] change(int money) {
        List<Integer> change = new LinkedList<>();
        for (int coin : COINS) {
            while (money - coin >= 0) {
                money -= coin;
                change.add(coin);
            }
        }
        return new Integer[][]{{change.size()}, change.toArray(Integer[]::new)};
    }
}
