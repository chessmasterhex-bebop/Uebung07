package p2;

public class LetterGame {

    // ----------------------------------------------------------
    // Öffentliche Attribute
    // ----------------------------------------------------------
    public String keyString = "FRANZ JAGT IM KOMPLETT VERWAHRLOSTEN TAXI QUER DURCH BAYERN!";
    public String word = "";
    public int[] a;   // *-Aufgabe (optional)

    // ----------------------------------------------------------
    // setWord: baut ein Wort aus den Indices im Array a
    // ----------------------------------------------------------
    public void setWord(int[] a) {

        // Wort zunächst leeren
        this.word = "";

        // Für jeden Index: Zeichen aus keyString anhängen
        for (int index : a) {
            char c = keyString.charAt(index);
            this.word = this.word + c;      // String + char → wieder String
        }
    }

    // ----------------------------------------------------------
    // *-Aufgabe: findet den Code (Indices) zu einem Wort s
    // ----------------------------------------------------------
    public void findCode(String s) {

        // Array a muss genau so groß werden wie der String s
        this.a = new int[s.length()];

        // Für jedes Zeichen in s → passenden Index in keyString finden
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = keyString.indexOf(c);   // Liefert den Index des Zeichens
            this.a[i] = index;
        }
    }
}
