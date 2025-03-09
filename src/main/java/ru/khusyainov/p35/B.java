package ru.khusyainov.p35;

/**
 * Слияние сортированных последовательностей.
 * <p>
 * Задано n отсортированных по неубыванию последовательностей.
 * <p>
 * Требуется найти отсортированную по неубыванию конкатенацию этих последовательностей.
 * <ul>
 * <li>стандартный ввод или input.txt:
 * <ul>
 * <li>в первой строке задано число n (1 ≤ n ≤ 20) — количество отсортированных последовательностей;</li>
 * <li>каждая из следующих последовательностей задана в формате:
 * <ul>
 * <li>в первой строке mi (1 ≤ mi ≤ 10^5) — количество элементов последовательности,
 * при этом гарантируется, что (∑i=1)^n mi ≤ 10^5;</li>
 * <li>во второй сами элементы ai (1 ≤ ai ≤ 10^9).</li>
 * </ul></li>
 * </ul></li>
 * <li>стандартный вывод или output.txt: отсортированный массив чисел в одну строку.</li>
 * </ul>
 */
public class B {
    public Integer[] merge(Integer[][] input) {
        int arraysCount = input[0][0];
        if (arraysCount == 1) {
            return input[2];
        }
        arraysCount--;
        Integer[] result = input[2];
        for (int i = 0, j = 3; i < arraysCount; i++) {
            result = getSortedArray(result.length, result, input[j++][0], input[j++]);
        }
        return result;
    }

    private Integer[] getSortedArray(int arr1Count, Integer[] arr1, int arr2Count, Integer[] arr2) {
        int count = arr1Count + arr2Count;
        Integer[] result = new Integer[count];
        for (int i = 0, i1 = 0, i2 = 0; i < count; i++) {
            if (i1 < arr1Count && i2 == arr2Count) {
                result[i] = arr1[i1++];
            } else if (i1 == arr1Count && i2 < arr2Count) {
                result[i] = arr2[i2++];
            } else if (arr1[i1] <= arr2[i2]) {
                result[i] = arr1[i1++];
            } else {
                result[i] = arr2[i2++];
            }
        }
        return result;
    }
}
