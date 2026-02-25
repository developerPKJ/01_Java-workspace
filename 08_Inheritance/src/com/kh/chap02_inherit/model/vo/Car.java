package com.kh.chap02_inherit.model.vo;

public class Car extends Vehicle{
    // field
    private int tire;

    // constructor
    public Car() {}

    public Car(String name, double mileage, String kind, int tire){
        super(name, mileage, kind);
        this.tire = tire;
    }

    // method
    public int getTire() {
        return tire;
    }

    public void setTire(int tire) {
        this.tire = tire;
    }

    @Override
    public String information() {
        return super.information() + ", 타이어 수 : " + tire;
    }

    @Override
    public void move() {
        System.out.println("자동차가 달린다.");
    }
}
