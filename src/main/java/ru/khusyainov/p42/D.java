package ru.khusyainov.p42;

/**
 * A + B матрицы.
 * <p>
 * Необходимо вычислить сумму двух матриц C = A + B.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>в первой строке записано записано два целых числа n и m (1 ≤ n, m ≤ 10);</li>
 * <li>далее идут n строк, каждая содержит по m чисел - описание элементов матрицы A (-100 ≤ Ai,j ≤ 100);</li>
 * <li>далее идут n строк, каждая содержит по m чисел - описание элементов матрицы B (-100 ≤ Bi,j ≤ 100).</li>
 * </ul></li>
 * <li>стандартный вывод или output.txt: n строк, каждая содержит по m чисел - описание элементов матрицы C.</li>
 * </ul>
 */
public class D {
    public static Integer[][] sumMatrices(Integer[][] set) {
        int rows = set[0][0], columns = set[0][1];
        Integer[][] result = new Integer[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = set[i + 1][j] + set[i + 1 + rows][j];
            }
        }
        return result;
    }
}
