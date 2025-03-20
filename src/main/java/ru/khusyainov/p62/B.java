package ru.khusyainov.p62;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

/**
 * Сувениры.
 * <p>
 * Турист зашел в сувенирную лавку и нашел там много привлекательных вариантов подарков друзьям и родным.
 * Всего в лавке n сувениров, стоимость i-го сувенира ci рублей. Определите, какое наибольшее количество
 * сувениров сможет купить турист, если он может потратить не более S рублей.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>первая строка ввода содержит количество сувениров n специй и бюджет на сувениры S;</li>
 * <li>следующие n строк указывают цену цену очередного сувенира: i-я строка включает в себя цену ci.</li>
 * </ul>
 * Ограничения: 1 ≤ n ≤ 10^3, 0 ≤ S ≤ 2 * 10^6, 0 ≤ ci ≤ 2 * 10^6 для всех 1 ≤ i ≤ n. Все числа — целые.</li>
 * <li>стандартный вывод или output.txt: максимальное количество сувениров, которые может купить турист, одно число.</li>
 * </ul>
 */
public class B {
    public static int souvenirs(Integer[][] input) {
        List<Integer[]> prices = new LinkedList<>(List.of(input));
        prices.remove(0);
        prices.sort(Comparator.comparingInt(a -> a[0]));
        return maximumBuy(input[0][1], prices);
    }

    private static int maximumBuy(int budget, List<Integer[]> prices) {
        if (budget == 0 || prices.isEmpty()) {
            return 0;
        }
        int price = prices.remove(0)[0];
        if (price > budget) {
            return maximumBuy(budget, prices);
        }
        return 1 + maximumBuy(budget - price, prices);
    }
}
