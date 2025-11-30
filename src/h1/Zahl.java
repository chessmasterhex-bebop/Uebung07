package h1;

public class Zahl {

    // öffentliche, nicht-statische Attribute
    public boolean even;
    public boolean small;
    public boolean positive;
    public int num;

    // setzt even genau dann auf true, wenn num gerade ist
    public void setEven() {
        if (num % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
    }

    // setzt positive genau dann auf true, wenn num > 0 ist
    public void setPositive() {
        if (num > 0) {
            positive = true;
        } else {
            positive = false;
        }
    }

    // setzt small genau dann auf true, wenn num < 100 ist
    public void setSmall() {
        if (num < 100) {
            small = true;
        } else {
            small = false;
        }
    }
}
