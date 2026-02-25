package com.kh.chap02_inherit.model.vo;

public class Ship extends Vehicle {
    // field
    private int propeller;

    // constructor
    public Ship() {}

    public Ship(String name, double mileage, String kind, int propeller) {
        super(name, mileage, kind);
        this.propeller = propeller;
    }

    // method
    public int getPropeller() {
        return propeller;
    }

    public void setPropeller(int propeller) {
        this.propeller = propeller;
    }

    @Override
    public String information() {
        return super.information() + ", 프로펠러 수 : " + propeller;
    }
}
