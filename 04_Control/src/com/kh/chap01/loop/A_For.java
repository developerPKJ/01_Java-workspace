package com.kh.chap01.loop;

import java.util.Scanner;

public class A_For {
    Scanner sc = new Scanner(System.in);

    public void method1() {
        System.out.println("method1() 호출됨");
        System.out.println("A_For의 method1() 호출됨");
        System.out.println("A_For의 method1() 호출됨");
        System.out.println("A_For의 method1() 호출됨");
        System.out.println("A_For의 method1() 호출됨");
        System.out.println("A_For의 method1() 호출됨");
    }

    public void method2() {
        System.out.println("method2() 호출됨");

        for(int i = 0; i < 5; i++) {
            System.out.println("A_For의 method2() 호출됨");
        }
    }

    public void method3() {
        for(int i = 11; i < 16; i++) {
            System.out.println("퇴근합시다");
            System.out.println(i);
        }
    }

}
