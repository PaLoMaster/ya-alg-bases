package ru.khusyainov.p34;

/**
 * 3.4. Рекурсивные алгоритмы.
 */
public class Paragraph34 {
    public static void main(String[] args) {
        TowersOfHanoi towers = new A();
        towersOfHanoi(towers, 3, 3, "7");
        towersOfHanoi(towers, 5, 3, "31");
        towers = new B();
        towersOfHanoi(towers, 3, 4, "5");
        towersOfHanoi(towers, 5, 4, "13");
    }

    private static void towersOfHanoi(TowersOfHanoi towers, int disksCount, int pegsCount, String out) {
        System.out.println("Towers of Hanoi with " + disksCount + " disks and " + pegsCount +
                " pegs can be solved in " + out + " steps.");
        System.out.println("Steps count again" + (pegsCount == 3 ? ", and solution steps by rows (fromPeg toPeg)" : "") +
                ": " + towers.solve(disksCount));
    }
}
