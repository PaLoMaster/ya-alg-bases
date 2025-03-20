package ru.khusyainov.p63;

import static ru.khusyainov.utils.Services.integersToString;

/**
 * Задача "Рекламная кампания".
 */
public class Paragraph63 {
    private static final String BILLBOARD_ADVERTISING = "\tFor input: %s%nMax profit should be %d: %d.%n";
    private static final String BILLBOARD_ADVERTISING_MY = "With my variant  -   %d: %d.%n%s%n%n";

    public static void main(String[] args) {
        System.out.println("The \"Advertising campaign\" task.\n");
        Integer[][] input = new Integer[][]{{3}, {2, 3, 9}, {7, 4, 2}};
        System.out.printf("\tFor input: %s%nMax profit should be %d: %d.%n%n",
                integersToString(input), 79, A.advertisingCampaign(input));
        billboardAdvertising(new Integer[][]{{2, 4, 3}, {5, 1}, {2, 2}, {4, 3}, {1, 3}}, 21, 21);
        billboardAdvertising(new Integer[][]{{3, 6, 3}, {6, 1}, {5, 1}, {4, 1}, {3, 3}, {2, 2}, {1, 1}},
                29, 26, """
                        Explanation of difference - by weeks...
                        \tYandex: 29 = {6, 5, 4}, {3, 3, 3}, {2, 2, 1},
                        \t\tMy: 26 = {6, 5, 4}, {3, 2, 1}, {3, 2}""");
    }

    private static void billboardAdvertising(Integer[][] input, int output, int my, String... explanation) {
        System.out.printf(BILLBOARD_ADVERTISING, integersToString(input), output, B.billboardAdvertising(input));
        System.out.printf(BILLBOARD_ADVERTISING_MY, my, B.billboardAdvertisingMy(input),
                String.join(", ", explanation));
    }
}
