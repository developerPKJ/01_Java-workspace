package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
    // field
    private String brand;       // 브랜드명
    private String pCode;       // 상품코드
    private String pName;       // 상품명
    private int price;          // 가격

    // constructor
    public Product() {}

    public Product(String brand, String pCode, String pName, int price) {
        this.brand = brand;
        this.pCode = pCode;
        this.pName = pName;
        this.price = price;
    }

    // method
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getpCode() {
        return pCode;
    }

    public void setpCode(String pCode) {
        this.pCode = pCode;
    }

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
    
    public String information() {
        return brand + " / " + pCode + " / " + pName + " / " + price;
    }
}
