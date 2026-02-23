package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.MethodTest1;
import com.kh.chap06_method.controller.MethodTest2;
import com.kh.chap06_method.controller.OverloadingTest;

public class MethodRun {

    public static void main(String[] args) {
        // 매개변수 O, X / 반환값 O, X

        // 일반 메소드 호출
        MethodTest1 mt1 = new MethodTest1();
        mt1.method1();
        System.out.println(mt1.method2());
        mt1.method3(10, 20);
        System.out.println(mt1.method4(10, 20));

        System.out.println("==============================");

        // static 메소드 호출
        MethodTest2.method1();
        System.out.println(MethodTest2.method2());
        MethodTest2.method3(10, 20);
        System.out.println(MethodTest2.method4(10, 20));

        System.out.println("==============================");

        OverloadingTest ot = new OverloadingTest();
        ot.test();
    }
}
