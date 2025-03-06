package ru.khusyainov.p33;

import java.util.Arrays;

/**
 * Камни 2.
 * <p>
 * Вы играете в игру "Камни": игру для двух игроков с двумя наборами камней по n и m штук.
 * С каждым ходом один игрок может забрать следующие комбинации камней:
 * <ul>
 * <li>Взять один камень из любого набора;</li>
 * <li>Взять два камня из какого-то одного набора;</li>
 * <li>Взять два камня из одного и один из другого.</li>
 * </ul>
 * Когда камень забрали, он выходит из игры. Побеждает игрок, который заберет последний камень. Первый ход за вами.
 * <p>
 * Вы и ваш оппонент играете оптимально.
 * </ul>
 * <li>стандартный ввод или input.txt: в первой строке содержится два числа n(1 ≤ n ≤ 1000), m (1 ≤ m ≤ 1000) —
 * количество ваших камней и количество камней у вашего оппонента;</li>
 * <li>стандартный вывод или output.txt: одна строка - Lose, если вы заведомо проиграете, и Win, иначе.</li>
 * </ul>
 */
public class B extends Roks {
    @Override
    public String solve(int myRoksCount, int hisRoksCount) {
        String[][] arr = new String[myRoksCount + 1][hisRoksCount + 1];
        arr[0][1] = arr[0][2] = arr[1][0] = arr[2][0] = WIN;
        Arrays.fill(arr[1], WIN);
        arr[1][1] = LOSE;
        for (int i = 2; i <= myRoksCount; i++) {
            Arrays.fill(arr[i], WIN);
            if (WIN.equals(arr[i - 1][0]) && WIN.equals(arr[i - 2][0])) {
                arr[i][0] = LOSE;
            }
        }
        for (int i = 2; i <= hisRoksCount; i++) {
            arr[0][i] = (WIN.equals(arr[0][i - 1]) && WIN.equals(arr[0][i - 2])) ? LOSE : WIN;
        }
        for (int i = 2; i <= myRoksCount; i++) {
            for (int j = 2; j <= hisRoksCount; j++) {
                if (WIN.equals(arr[i][j - 1]) && WIN.equals(arr[i - 1][j])
                        && WIN.equals(arr[i][j - 2]) && WIN.equals(arr[i - 2][j])
                        && WIN.equals(arr[i - 1][j - 2]) && WIN.equals(arr[i - 2][j - 1])) {
                    arr[i][j] = LOSE;
                }
            }
        }
        return arr[myRoksCount][hisRoksCount];
    }
}
