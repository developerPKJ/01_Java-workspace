package com.kh.chap02_inherit.model.vo;

public class Vehicle {
    // field
    private String name;
    private double mileage;
    private String kind;

    // constructor
    public Vehicle() {}

    public Vehicle(String name, double mileage, String kind) {
        this.name = name;
        this.mileage = mileage;
        this.kind = kind;
    }

    // method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String information() {
        return "이름 : " + name + ", 주행거리 : " + mileage + ", 종류 : " + kind;
    }

    public void move() {
        System.out.println("움직인다.");
    }
}
