package p2;

public class P2_main {

    public static void main(String[] args) {

        LetterGame game = new LetterGame();

        // Test aus dem Aufgabenblatt: FRAU
        int[] a1 = {0, 1, 2, 43};
        game.setWord(a1);
        System.out.println(game.word);  // → FRAU

        // Weitere Testvorschläge
        int[] a2 = {6, 7, 23, 7};
        game.setWord(a2);
        System.out.println(game.word);

        int[] a3 = {14, 2, 0, 0, 19, 19};
        game.setWord(a3);
        System.out.println(game.word);

        // Zusätzlicher Test für die *-Aufgabe (findCode)
        game.findCode("UNI");
        // game.a wird nun korrekt belegt (z.B. {43, 3, 11})
        for (int x : game.a) System.out.print(x + " ");
    }
}
