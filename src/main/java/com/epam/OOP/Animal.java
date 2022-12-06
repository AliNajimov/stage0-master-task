package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
        getDescription();
    }
//test
    public Animal() {

    }

    public String getDescription() {
        String paw = "paw";
        String fur = "no";
        if (numberOfPaws > 1) {
            paw += "s";
        }
        if (hasFur) {
            fur = "a";
        }
        String res = String.format("This animal is mostly %s. It has %d %s and %s fur.", color, numberOfPaws, paw, fur);
        return res;
    }
}
