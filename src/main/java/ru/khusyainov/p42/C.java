package ru.khusyainov.p42;

/**
 * A + B строки.
 * <p>
 * Необходимо вычислить "кривую" сумму двух строк A и B одинаковой длины.
 * "Кривой" суммой двух строк называется операция следующего вида:
 * C = A + B = A1B1A2B2…An-1Bn-1AnBn. Где n - длина строк A и B.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>в первой строке записано целое число n (1 ≤ n ≤ 10);</li>
 * <li>вторая строка содержит строку A (Ai ∈ {a, b, …, z});</li>
 * <li>третья строка содержит строку B (Bi ∈ {a, b, …, z}).</li>
 * </ul></li>
 * <li>стандартный вывод или output.txt: строка C = A + B в одну строку.</li>
 * </ul>
 */
public class C {
    public String sumRows(String[] set) {
        int count = Integer.parseInt(set[0]);
        String row1 = set[1], row2 = set[2];
        StringBuilder resultRow = new StringBuilder(count * 2);
        for (int i = 0; i < count; i++) {
            resultRow.append(row1.charAt(i)).append(row2.charAt(i));
        }
        return resultRow.toString();
    }
}
