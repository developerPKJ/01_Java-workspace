package com.kh.chap02_abstractANDinterface.part01_basic.model.vo;

public class Football extends Sports {
    // field
    private String name;    // 축구 경기 이름

    // constructor
    public Football() {}

    // method
    @Override
    public void rule() {
        System.out.println("발로 공을 차 골대에 넣는 경기입니다.");
    }

    @Override
    public String toString() {
        return "name : " + name + ", people : " + getPeople();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
