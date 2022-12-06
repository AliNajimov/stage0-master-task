package com.epam.OOP;

public class Dog extends Animal {
    public Dog(String color, int numberOfPaws, boolean hasFun) {
        super(color, numberOfPaws, hasFun);
    }

    public Dog() {
        super("brown", 4, true);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }
}
