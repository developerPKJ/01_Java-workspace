package com.kh.chap02_abstractANDinterface.part02_family.model.vo;

public class Baby extends Person {
    // field

    // constructor
    public Baby() {}

    public Baby(String name, int health, double weight) {
        super(name, health, weight);
    }

    // method
    @Override
    public void eat() {
        super.setWeight(getWeight() + 3);
        super.setHealth(getHealth() + 1);
    }

    @Override
    public void sleep() {
        super.setHealth(getHealth() + 3);
    }
}
