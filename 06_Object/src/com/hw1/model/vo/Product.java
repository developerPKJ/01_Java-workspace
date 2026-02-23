package com.hw1.model.vo;

public class Product {
    //field
    private String productId;
    private String productName;
    private String productArea;
    private int price;
    private double tax;

    //constructor
    public Product() {}

    public Product(String productId, String productName, String productArea, int price, double tax) {
        this.productId = productId;
        this.productName = productName;
        this.productArea = productArea;
        this.price = price;
        this.tax = tax;
    }

    // method
    public String information() {       //ssgnote9 갤럭시노트9 경기도 수원 960000 10.0
        return productId + " " + productName + " " + productArea + " " + price + " " + tax;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductArea() {
        return productArea;
    }

    public void setProductArea(String productArea) {
        this.productArea = productArea;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

}
