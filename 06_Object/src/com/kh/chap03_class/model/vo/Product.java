package com.kh.chap03_class.model.vo;

public class Product {
    // field
    private String pName; // 제품명
    private int price; // 가격
    private String brand; // 브랜드

    // constructor
    public Product() {}
    public Product(String pName, int price, String brand) {
        this.pName = pName;
        this.price = price;
        this.brand = brand;
    }

    // method
    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }


    public String information() {
        return "제품명 : " + pName +
                ", 가격 : " + price +
                ", 브랜드 : " + brand;
    }
}
