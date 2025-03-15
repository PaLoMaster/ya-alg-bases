package ru.khusyainov.p31;

import ru.khusyainov.utils.Services;

/**
 * 3.1. Полный перебор и оптимизация перебора.
 */
public class Paragraph31 {
    public static void main(String[] args) {
        System.out.println("Complete enumeration and enumeration optimization.\n");
        String in = "5";
        Services.writeToInput(in);
        A.permutations();
        System.out.println("Permutations count for " + in + " should be 120: " + Services.getIntegerFromOutput());
        in = "7 5";
        Services.writeToInput(in);
        B.combinations();
        System.out.println("Combinations count for " + in + " should be 21: " + Services.getIntegerFromOutput());
        combinationsWithRepetitions(in, 462);
        combinationsWithRepetitions("4 3", 20);
    }

    private static void combinationsWithRepetitions(String in, int out) {
        Services.writeToInput(in);
        C.combinationsWithRepetitions();
        System.out.println("Combinations with repetitions for " + in + " should be " + out + ": " +
                Services.getIntegerFromOutput());
    }
}
