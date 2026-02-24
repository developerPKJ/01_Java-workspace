package com.kh.chap01_beforeVSafter.before.model.vo;

public class Desktop {
    // field
    private String brand;       // 브랜드명
    private String pCode;       // 상품코드
    private String pName;       // 상품명
    private int price;          // 가격
    private boolean allInOne;   // 일체형 여부


    // constructor
    public Desktop() {}

    public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
        this.brand = brand;
        this.pCode = pCode;
        this.pName = pName;
        this.price = price;
        this.allInOne = allInOne;
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

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }

    public String information() {
        return "Desktop [brand=" + brand + ", pCode=" + pCode + 
                ", pName=" + pName + ", price=" + price
                + ", allInOne=" + allInOne + "]";
    }
}
