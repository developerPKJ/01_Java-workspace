package com.hw1.model.vo;

public class Circle {
    // field
    public final double PI = 3.14;
    private int radius = 1;

    // constructor
    public Circle() {}

    // method
    public void incrementRadius() {
        radius++;
    }

    public void getAreaOfCircle() {
        System.out.println(PI * radius * radius);
    }

    public void getSizeOfCircle() {
        System.out.println(2 * PI * radius);
    }

}
