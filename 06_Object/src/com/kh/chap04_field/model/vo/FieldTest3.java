package com.kh.chap04_field.model.vo;

public class FieldTest3 {

    // 예약어

    // static
    public static String staticField = "static 필드입니다.";
    // static 예약어가 붙는 순간 클래스 변수로 취급
    // 생성시점 : 프로그램 실행과 동시에 메모리의 static 영역에 할당
    // 소멸시점 : 프로그램이 종료될 때 소멸

    // final
    public final String FINAL_FIELD = "final 필드입니다.";
    // final 예약어가 붙는 순간 상수로 취급
    // 생성시점 : 객체 생성 시 메모리에 할당
    // 소멸시점 : 객체가 소멸될 때 소멸
    // 상수이기에 setter 메소드가 필요없음
    // final 필드는 보통 public이기에 getter도 필요 없음

    public static void test() {
        System.out.println("static 메소드입니다.");
    }

    public final void FINAL_METHOD() {
        System.out.println("final 메소드입니다.");
    }
}
