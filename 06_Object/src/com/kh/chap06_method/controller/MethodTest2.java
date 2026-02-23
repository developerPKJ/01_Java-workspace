package com.kh.chap06_method.controller;

public class MethodTest2 {
    public static void method1() {
        System.out.println("MethodTest2의 method1입니다.");
    }

    public static int method2() {
        return 100;
    }

    public static void method3(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }

    public static int method4(int a, int b) {
        return a * b;
    }
}
