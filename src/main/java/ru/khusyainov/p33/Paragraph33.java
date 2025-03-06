package ru.khusyainov.p33;

/**
 * 3.3. Динамическое программирование.
 */
public class Paragraph33 {
    public static void main(String[] args) {
        roks(new A(), 10, 2, Roks.LOSE);
        roks(new A(), 4, 5, Roks.WIN);
        roks(new B(), 4, 4, Roks.LOSE);
        roks(new B(), 7, 5, Roks.WIN);
    }

    private static void roks(Roks roks, int myRoksCount, int hisRoksCount, String loseOrWin) {
        System.out.println("You are sure to \"" + loseOrWin + "\" in " + myRoksCount + " " + hisRoksCount + ": " +
                roks.solve(myRoksCount, hisRoksCount) + ".");
    }
}
