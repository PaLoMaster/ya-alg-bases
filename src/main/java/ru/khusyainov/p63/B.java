package ru.khusyainov.p63;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Реклама на билбордах.
 * <p>
 * Рассмотрим задачу менеджера рекламного агентства. Есть n билбордов, на которых можно размещать рекламные объявления.
 * Планирование размещения проводится на w недель вперед. Модель размещения рекламы разрешает сохранить одно и то же
 * объявление несколько недель на одном билборде, перенести объявление на следующей неделе на другой билборд.
 * Размещать одно объявление на разных, необязательно последовательных, неделях будущего периода. Однако на одной
 * неделе не может быть рекламных объявлений от одного рекламодателя на разных билбордах. k рекламодателей хотят
 * разместить рекламу. Заявки подают рекламодатели в формате аукциона, но не знают заявок конкурентов. Известно, что
 * i-й рекламодатель подал заявку на размещение своей рекламы максимум на wi недель с оплатой ci за каждую неделю
 * размещения, т.е. рекламное объявление i-го рекламодателя может быть размещено от 0 до wi в течение периода (при
 * размещении рекламы в течение m недель оплата за нее составит m⋅ci). Менеджеру нужно выбрать, в какие недели и на
 * каких билбордах разместить рекламу рекламодателей. Требуется максимизировать прибыль от размещения рекламы.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>первая строка содержит три разделённых пробелами числа: n билбордов, k рекламодателей и планирование размещения
 * на w недель (1 ≤ n ≤ 10^3, 1 ≤ k ≤ 10^5, 1 ≤ w ≤ 10^2);</li>
 * <li>далее каждая из k строк содержит по два разделённых пробелом числа — оплата рекламодателем ci за каждую неделю
 * и заявляемый им срок размещения wi (1 ≤ ci ≤ 10^2, 1 ≤ wi ≤ w).</li></ul>
 * </li>
 * <li>стандартный вывод или output.txt: максимальная прибыль max_profit, одно число.</li>
 * </ul>
 */
public class B {
    public static int billboardAdvertising(Integer[][] input) {
        List<Integer[]> advertisers = new LinkedList<>(List.of(input));
        advertisers.remove(0);
        advertisers.sort((i1, i2) -> Integer.compare(i2[0], i1[0]));
        int profit = 0, places = input[0][0] * input[0][2];
        do {
            int place = Math.min(advertisers.get(0)[1], places);
            profit += place * advertisers.get(0)[0];
            advertisers.remove(0);
            places -= place;
        } while (places > 0 && !advertisers.isEmpty());
        return profit;
    }

    /**
     * В этом методе реализовано соблюдение условия из "Однако...", но он не проходит 5ый тест yandex с заключением
     * "Неправильный алгоритм (WA). Без строки, помеченной в коде ниже комментарием, этот метод проходит все тесты.
     * Метод {@link #billboardAdvertising(Integer[][])}, нарушающий это условие, также проходит все тесты.
     */
    static int billboardAdvertisingMy(Integer[][] input) {
        List<Integer[]> advertisers = new ArrayList<>(List.of(input));
        advertisers.remove(0);
        advertisers.sort((i1, i2) -> Integer.compare(i2[0], i1[0]));
        int profit = 0, week = 0, weeks = input[0][2], billboards = input[0][0];
        do {
            int board = 0;
            for (int i = 0; i < advertisers.size() && board < billboards; i++, board++) {
                advertisers.get(i)[1]--; // Условие "Однако..." не проходит 9ый тест yandex...
                profit += advertisers.get(i)[0];
                if (advertisers.get(i)[1] == 0) {
                    advertisers.remove(i--);
                }
            }
        } while (++week < weeks && !advertisers.isEmpty());
        return profit;
    }
}
