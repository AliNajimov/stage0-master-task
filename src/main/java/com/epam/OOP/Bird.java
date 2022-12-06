package com.epam.OOP;

public class Bird extends Animal {
    public Bird(String color, int numberOfPaws, boolean hasFun) {
        super(color, numberOfPaws, hasFun);
    }

    public Bird() {
        super("blue", 2, false);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Moreover, it has 2 wings and can fly.";
    }
}
