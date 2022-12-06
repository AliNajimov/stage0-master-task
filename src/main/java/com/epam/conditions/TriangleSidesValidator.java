package com.epam.conditions;

public class TriangleSidesValidator {

    public void validate(double firstSide, double secondSide, double thirdSide) {
        boolean a = firstSide + secondSide > thirdSide;
        boolean b = firstSide + thirdSide > secondSide;
        boolean c = secondSide + thirdSide > firstSide;
        if (a && b && c) {
            System.out.println("this is a valid triangle");
        } else {
            System.out.println("it's not a triangle");
        }
    }

}
