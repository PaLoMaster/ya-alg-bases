package ru.khusyainov.p51;

/**
 * Огромное число Фибоначчи.
 * <p>
 * Даны целые числа n и m, необходимо найти остаток от деления n-го числа Фибоначчи на m.
 * <ul>
 * <li>стандартный ввод или input.txt: целые числа n и m. Ограничения: 1 ≤ n ≤ 10^14, 2 ≤ m ≤ 10^3;</li>
 * <li>стандартный вывод или output.txt: Fn mod m - остаток от деления Fn на m, одно число.</li>
 * </ul>
 */
public class C {
    public static int bigFibonacciMod(Long n, Integer m) {
        int[][] mt = new int[][]{{0, 1}, {1, 1}},
                p = fastMatrixExponentiation(mt, n, m);
        return p[0][1];
    }

    private static int[][] fastMatrixExponentiation(int[][] d, long n, int m) {
        if (n == 0) {
            return new int[][]{{1, 0}, {0, 1}};
        }
        if (n % 2 == 0) {
            int[][] y = fastMatrixExponentiation(d, n / 2, m);
            return multiply2x2Matrices(y, y, m);
        } else {
            int[][] y = fastMatrixExponentiation(d, (n - 1) / 2, m);
            int[][] y2 = multiply2x2Matrices(y, y, m);
            return multiply2x2Matrices(y2, d, m);
        }
    }

    private static int[][] multiply2x2Matrices(int[][] a, int[][] b, int m) {
        int[][] c = new int[2][2];
        c[0][0] = (a[0][0] * b[0][0] + a[0][1] * b[1][0]) % m;
        c[0][1] = (a[0][0] * b[0][1] + a[0][1] * b[1][1]) % m;
        c[1][0] = (a[1][0] * b[0][0] + a[1][1] * b[1][0]) % m;
        c[1][1] = (a[1][0] * b[0][1] + a[1][1] * b[1][1]) % m;
        return c;
    }
}
