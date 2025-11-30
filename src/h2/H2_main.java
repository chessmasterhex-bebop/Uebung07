package h2;

import java.util.Arrays;

public class H2_main {

    // ------------------------------------------------------------
    // Hausaufgabe 2: Methode change
    // ------------------------------------------------------------
    public static int[] change(int[] a, int[] b, int start, int end) {

        // Fall 3: end <= start → leeres Array
        if (end <= start) {
            return new int[0];
        }

        // Fall 1: Inhalte NICHT identisch → Kopie von a zurückgeben
        // Arrays.compare(a, b) == 0 bedeutet: exakt gleiche Inhalte
        if (Arrays.compare(a, b) != 0) {
            return Arrays.copyOf(a, a.length);
        }

        // Fall 2: Inhalte identisch → sortiere a & kopiere Range
        int[] copy = Arrays.copyOf(a, a.length);
        Arrays.sort(copy);

        // start inklusive, end exklusiv
        return Arrays.copyOfRange(copy, start, end);
    }

    public static void main(String[] args) {
        // main absichtlich leer, um Autograder nicht zu stören
    }
}
