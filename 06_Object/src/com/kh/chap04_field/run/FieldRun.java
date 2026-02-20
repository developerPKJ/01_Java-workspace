package com.kh.chap04_field.run;

// import com.kh.chap04_field.model.vo.FieldTest1;
// import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {
    public static void main(String[] args) {
        
        /*
        FieldTest1 ft1 = new FieldTest1();
        ft1.test(10);

        // 전역 변수긴 하지만 private이라 접근 불가
        // System.out.println(ft1.global); // The field FieldTest1.global is not visible
        
        // 함수 내 지역변수라 소멸
        // System.out.println(ft1.local);  // local cannot be resolved or is not a field
        
        //매개변수(=지역변수)라 소멸
        // System.out.println(ft1.num);    // local cannot be resolved or is not a field

        System.out.println("===============================");

        FieldTest2 ft2 = new FieldTest2();
        System.out.println(ft2.pub);
        // public은 어디서든 접근 가능

        // System.out.println(ft2.pro);
        // The field FieldTest2.pro is not visible -> 패키지가 다르고 상속이 아님

        // System.out.println(ft2.def);
        // The field FieldTest2.def is not visible -> 패키지가 다름

        // System.out.println(ft2.pri);
        // The field FieldTest2.pri is not visible -> private은 해당 클래스에서만 접근 가능

        System.out.println("===============================");

        Test test = new Test();         // 같은 패키지 내에 존재하는 클래스이므로 import 없이 접근 가능
        System.out.println(test.pub);
        // public은 어디서든 접근 가능
        System.out.println(test.pro);
        // 같은 패키지라 접근 가능
        System.out.println(test.def);
        // 같은 패키지라 접근 가능
        // System.out.println(test.pri);
        // The field Test.pri is not visible -> private은 해당 클래스에서만 접근 가능

        System.out.println("===============================");
        */
        System.out.println(FieldTest3.staticField); // static 필드는 객체 생성 없이 클래스명으로 접근 가능
        FieldTest3.test();                          // static 메소드는 객체 생성 없이 클래스명으로 접근 가능

        FieldTest3 ft3 = new FieldTest3();
        System.out.println(ft3.FINAL_FIELD);        // final 필드는 객체 생성 후 참조변수로 접근 가능
        ft3.FINAL_METHOD();                         // final 메소드는 객체 생성 후 참조변수로 접근 가능

        // ft3.FINAL_FIELD = "값 변경";             // final 변수는 상수라 변경이 불가능
        // The final field FieldTest3.FINAL_FIELD cannot be assigned


        /*
        static이 많이 사용 되는 예시
        Math 클래스 : 수학 계산에 특화된 클래스
        - 프로그래밍 중 계산이 빈번하여 모두 static으로 선언되어 있음
        - static이기에 객체 생성 없이 클래스명으로 접근 가능
        */
        System.out.println(Math.PI); // Math 클래스의 static 필드인 PI에 접근
        System.out.println((int)(Math.random() * 10 + 1)); // Math 클래스의 static 메소드인 random()에 접근
        
        /*
        이런식으로 모든 필드, 메소드를 static으로 만들어
        객체 생성 구문 또한 막아둔 디자인 패턴을 싱글톤 패턴이라고 부름
        Math 클래스가 대표적이고, 주로 공통코드 작업 시 많이 쓰임
        */
    }
}
