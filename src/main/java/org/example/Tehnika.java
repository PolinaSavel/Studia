package org.example;

public class Tehnika {
    private String naimenovanie;
    private int stoimost;

    public Tehnika(String naimenovanie, int stoimost) {
        this.naimenovanie = naimenovanie;
        this.stoimost = stoimost;
    }

    public double getStoimost() {
        return stoimost;
    }

    public String getNaimenovanie() {
        return naimenovanie;
    }
}
