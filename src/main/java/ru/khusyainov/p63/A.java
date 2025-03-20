package ru.khusyainov.p63;

import java.util.LinkedList;
import java.util.List;

/**
 * Рекламная кампания.
 * <p>
 * У вас есть популярная страница в интернете, на которой есть n рекламных мест. Вы хотите продать их рекламодателям.
 * Аналитики рассчитывают на clicks1, clicks2, …, clicksn кликов в день, соответственно. С вами связались
 * n рекламодателей, которые готовы заплатить price1, price2, …, pricen за клик. Как подобрать пары рекламных мест и
 * рекламодателей так, чтобы получить максимальную прибыль?
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>в первой строке приведено целое число n;</li>
 * <li>во второй — последовательность целых чисел price1, …, pricen;</li>
 * <li>в третьей — последовательность целых чисел clicks1, …, clicksn.</li>
 * Ограничения: 1 ≤ n ≤ 10^3, 0 ≤ pricei, clicksi ≤ 10^5 для всех 1 ≤ i ≤ n.</ul>
 * </li>
 * <li>стандартный вывод или output.txt: максимальное значение price1 * c1 + … + pricen * cn, где c1, …, cn — это
 * перестановка clicks1, …, clicksn, одно число.</li>
 * </ul>
 */
public class A {
    public static long advertisingCampaign(Integer[][] input) {
        List<Integer> prices = new LinkedList<>(List.of(input[1]));
        List<Integer> clicks = new LinkedList<>(List.of(input[2]));
        prices.sort((i1, i2) -> Integer.compare(i2, i1));
        clicks.sort((i1, i2) -> Integer.compare(i2, i1));
        return maximise(prices, clicks);
    }

    private static long maximise(List<Integer> prices, List<Integer> clicks) {
        if (prices.isEmpty()) {
            return 0;
        }
        return (long) prices.remove(0) * clicks.remove(0) + maximise(prices, clicks);
    }
}
