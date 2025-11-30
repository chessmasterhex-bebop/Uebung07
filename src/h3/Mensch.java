package h3;

public class Mensch {

    // öffentliche, nicht statische Attribute
    public String name;
    public int gebJahr;
    public int alter;

    // ==============================
    // Setter
    // ==============================

    // setzt name
    public void setName(String name) {
        this.name = name;
    }

    // setzt gebJahr
    public void setGebJahr(int gebJahr) {
        this.gebJahr = gebJahr;
    }

    // berechnet alter aus dem Geburtsjahr (Jahr 2025)
    public void setAlter() {
        this.alter = 2025 - this.gebJahr;
    }

    // ==============================
    // Getter
    // ==============================

    public String getName() {
        return this.name;
    }

    public int getGebJahr() {
        return this.gebJahr;
    }

    public int getAlter() {
        return this.alter;
    }
}
