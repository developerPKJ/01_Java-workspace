package com.kh.chap06_method.controller;

public class OverloadingTest {
    /*
    오버로딩(Overloading)
    - 한 클래스 내에 같은 이름의 메소드를 여러 개 정의할 수 있는 기술
    - 매개변수의 자료형, 개수, 순서가 달라야 함

    - 배개변수명, 접근제한자 종류, 반환형은 오버로딩에 영향을 미치지 않음

    - 생성자 여러개 만드는 것이 오버로딩의 대표적인 예시
    - 출력문도 마찬가지
    */
    public void test() {
        // 메소드 이름은 모두 동일하지만 매개변수 자료형이 전부 다름
        System.out.println("매개변수 없는 test 메소드입니다.");     //string
        System.out.println(10);                                 //int
        System.out.println(5.5);                                //double
        System.out.println(true);                               //boolean
        System.out.println('c');                                //char

        //매개변수 자료형, 개수가 다름
        int a = 10;
        System.out.printf("%d\n", a);                       //int
        System.out.printf("%s\n", "문자열");        //string
        System.out.printf("%s, %d\n", "문자열", a); //string, int
    }

    // public void test() {}                // Duplicate method test() in type OverloadingTest

    public void test(int num) {             // 위의 test와 매개변수가 유무가 다른 오버로딩 예시
        System.out.println("매개변수 int num이 있는 test 메소드입니다.");
    }

    public void test(int a, String str) {   // 위의 test와 매개변수 개수가 다른 오버로딩 예시
        System.out.println("매개변수 int a, String str이 있는 test 메소드입니다.");
    }

    public void test(String str, int a) {   // 위의 test와 매개변수 순서가 다른 오버로딩 예시
        System.out.println("매개변수 String str, int a이 있는 test 메소드입니다.");
    }
    
}
