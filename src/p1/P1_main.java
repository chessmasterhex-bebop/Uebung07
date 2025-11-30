package p1;

public class P1_main {

    public static void main(String[] args) {
        // Beispieltests (frei anpassbar)
        multFrac(5, 2, 3, 4); // → 15:8

        Bruch a = new Bruch(5, 2);
        Bruch b = new Bruch(3, 4);
        multFrac(a, b); // → 15:8

        // Test der toString()-Methode
        System.out.println(new Bruch(7, 3)); // → 7:3
    }

    // ============================================================
    // (a) multFrac mit int-Parametern
    // ============================================================
    public static void multFrac(int z1, int n1, int z2, int n2) {
        int z = z1 * z2;
        int n = n1 * n2;
        System.out.println(z + ":" + n);
    }

    // ============================================================
    // (c) multFrac mit Bruch-Objekten
    // ============================================================
    public static void multFrac(Bruch a, Bruch b) {
        int z = a.z * b.z;
        int n = a.n * b.n;
        System.out.println(z + ":" + n);
    }
}
