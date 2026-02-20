package com.kh.chap03_class.model.vo;

public class Product {
    // field
    private String pName; // 제품명
    private int price; // 가격
    private String brand; // 브랜드
    private static int warrantyPeriod = 24; // 보증기간


    // constructor
    public Product() {}

    public Product(String pName, int price, String brand) {
        this.pName = pName;
        this.price = price;
        this.brand = brand;
    }

    public Product(String pName, int price, String brand, int warrantyPeriod) {
        this.pName = pName;
        this.price = price;
        this.brand = brand;
        Product.warrantyPeriod = warrantyPeriod;
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

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        Product.warrantyPeriod = warrantyPeriod;
    }

    
    public String information() {           //제품 정보 출력 메소드
        return "제품명:" + pName +
                ", 가격:" + price +
                ", 브랜드:" + brand +
                ", 보증기간:" + warrantyPeriod + "개월";
    }
}
