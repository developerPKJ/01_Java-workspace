package com.kh.chap04_field.model.vo;

public class FieldTest2 {

    // (+) public : 어디서든 접근 가능
    // (#) protected : 같은 패키지 + 자식 클래스에서 접근 가능
    // (~) default : 같은 패키지에서만 접근 가능
    // (-) private : 해당 클래스에서만 접근 가능

    public String pub = "public"; // 어디서든 접근 가능
    protected String pro = "protected"; // 같은 패키지 + 자식 클래스에서 접근 가능
    /* default */String def = "default"; // 같은 패키지에서만 접근 가능
    @SuppressWarnings("unused")
    private String pri = "private"; // 해당 클래스에서만 접근 가능
}
