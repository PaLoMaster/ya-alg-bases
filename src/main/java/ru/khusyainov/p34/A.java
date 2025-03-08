package ru.khusyainov.p34;

/**
 * Ханойские башни.
 * <p>
 * Головоломка "Ханойские башни" состоит из трёх стержней, пронумеруем их слева направо: 1, 2 и 3.
 * Также в головоломке используется стопка дисков с отверстием посередине. Радиус дисков уменьшается снизу вверх.
 * Изначально диски расположены на левом стержне (стержень 1), самый большой диск находится внизу.
 * Диски в игре перемещаются по одному со стержня на стержень. Диск можно надеть на стержень,
 * только если он пустой или верхний диск на нём большего размера, чем перемещаемый.
 * Цель головоломки — перенести все диски со стержня 1 на стержень 3.
 * <p>
 * Требуется найти последовательность ходов, которая решает головоломку "Ханойские башни".
 * <ul>
 * <li>стандартный ввод или input.txt: в первой строке задано одно число n (3 ≤ n ≤ 10) —
 * количество дисков на первой башне;</li>
 * <li>стандартный вывод или output.txt:
 * <ul>
 * <li>в первой строке выведите количество операций k;</li>
 * <li>в следующих k строках выведите по два числа в каждой xi, yi (1 ≤ xi, yi ≤ 3) —
 * переместить верхний диск со стержня xi на стержень yi.</li>
 * </ul></li>
 * </ul>
 */
public class A extends TowersOfHanoi {
    public String solve(int disksCount) {
        return solution(disksCount, 1, 3)
                .insert(0, String.format("%.0f%n", Math.pow(2, disksCount) - 1)).toString();
    }

    private StringBuilder solution(int disksCount, int fromPeg, int toPeg) {
        if (disksCount == 1) {
            return new StringBuilder().append(fromPeg).append(" ").append(toPeg);
        }
        int unusedPeg = 6 - fromPeg - toPeg;
        StringBuilder solution = solution(--disksCount, fromPeg, unusedPeg);
        solution.append(System.lineSeparator()).append(fromPeg).append(" ").append(toPeg);
        return solution.append(System.lineSeparator()).append(solution(disksCount, unusedPeg, toPeg));
    }
}
