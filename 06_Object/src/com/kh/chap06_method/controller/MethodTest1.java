package com.kh.chap06_method.controller;

public class MethodTest1 {
    /*
    메소드를 정의만 하고 안에 코드가 실행되진 않음, 실행 시 호출 필요
    method 위주의 클래스를 Controller 클래스라고 부름

    1. 메인 메소드 - JVM에 의해 호출(static이라 가능)
    2. 일반 메소드

    [표현법]
    접근제한자 반환형 메소드명(매개변수) {
        // 실행할 코드
        return 반환값; // 반환형이 void인 경우 생략 가능
    }
     */
    public void method1() {
        System.out.println("메소드1이 호출되었습니다.");
    }

    public String method2() {
        return "메소드2 결과";
    }

    public void method3(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public int method4(int num1, int num2) {
        return num1 + num2;
    }
}
