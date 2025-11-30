package p1;

public class Bruch {

    // (b) öffentliche Attribute
    public int z;
    public int n;

    // Konstruktor
    public Bruch(int zaehler, int nenner) {
        this.z = zaehler;
        this.n = nenner;
    }

    // (d) toString-Methode
    @Override
    public String toString() {
        return z + ":" + n;
    }
}
