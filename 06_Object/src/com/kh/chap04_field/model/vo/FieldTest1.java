package com.kh.chap04_field.model.vo;

public class FieldTest1 {
    private int global = 1;


    public void test(int num) {
        int local = 0;

        System.out.println(global);
        System.out.println(local);
        System.out.println(num);
    }
}
