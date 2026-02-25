package com.kh.chap01_beforeVSafter.after.model.vo;

public class Tv extends Product {
    // field
    private int inch;           // 인치

    // constructor
    public Tv() {}

    public Tv(String brand, String pCode, String pName, int price, int inch) {
        super(brand, pCode, pName, price);
        this.inch = inch;
    }

    // method
    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public String information() {
        return super.information() + " / " + inch + "인치";
    }
}
