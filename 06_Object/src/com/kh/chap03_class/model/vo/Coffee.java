package com.kh.chap03_class.model.vo;

public class Coffee {
    // field
    private String cName;
    private int price;
    private char option;
    private char size;


    // constructor
    public Coffee() {}

    public Coffee(String cName, int price, char option, char size) {
        this.cName = cName;
        this.price = price;
        this.option = option;
        this.size = size;
    }


    // method
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public char getOption() {
        return option;
    }

    public void setOption(char option) {
        this.option = option;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }


    public String information() {       // 정보 출력 메소드
        return "커피명 : " + cName + ", 가격 : " + price + 
                ", 옵션 : " + option + ", 사이즈 : " + size;
    }
}
