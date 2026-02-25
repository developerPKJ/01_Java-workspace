package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product {
    // field
    private String mobileAgency;    // 통신사

    // constructor
    public SmartPhone() {}

    public SmartPhone(String brand, String pCode, String pName, int price, String mobileAgency) {
        super(brand, pCode, pName, price);
        this.mobileAgency = mobileAgency;
    }

    // method
    public String getMobileAgency() {
        return mobileAgency;
    }

    public void setMobileAgency(String mobileAgency) {
        this.mobileAgency = mobileAgency;
    }

    /*
    부모 클래스로부터 물려받은 메소드의 내부코드만 재정의한 것
    */
    @Override
    public String information() {
        return super.information() + " / " + mobileAgency;
    }
}
