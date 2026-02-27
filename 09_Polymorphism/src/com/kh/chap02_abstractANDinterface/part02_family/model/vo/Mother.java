package com.kh.chap02_abstractANDinterface.part02_family.model.vo;

public class Mother extends Person implements Basic {
    // fieldq
    private String babyBirth;

    // constructor
    public Mother() {
    }

    public Mother(String name, int height, double weight, String babyBirth) {
        super(name, height, weight);
        this.babyBirth = babyBirth;
    }

    // method
    public String getBabyBirth() {
        return babyBirth;
    }

    public void setBabyBirth(String babyBirth) {
        this.babyBirth = babyBirth;
    }

    @Override
    public String toString() {
        return super.toString() + ", babyBirth='" + babyBirth + "'";
    }

    @Override
    public void eat() {
        super.setWeight(getWeight() + 10);
        super.setHealth(getHealth() - 10);
    }

    @Override
    public void sleep() {
        super.setHealth(getHealth() + 5);
    }
}
