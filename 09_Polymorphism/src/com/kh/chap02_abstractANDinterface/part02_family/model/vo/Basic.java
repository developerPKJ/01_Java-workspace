package com.kh.chap02_abstractANDinterface.part02_family.model.vo;

public interface Basic {
    /*
    인터페이스 : 
    모든 필드가 상수, 모든 메서드가 추상 메서드인 일종의 추상 클래스
     - 상수 : public static final 생략 가능
     - 추상 메서드 : public abstract 생략 가능
     - 인터페이스는 객체 생성 불가, 구현한 자식 클래스를 통해서 객체 생성 가능
     - 인터페이스는 다중 상속이 가능하다.

     >  꼭 구현해야하는 추상 메소드 상속 용도, 다중 상속이 가능하기 때문에 인터페이스를 
        통해서 여러 기능을 구현할 수 있다.
     >  추상메소드와 다르게 더 강한 규칙성, 강제성을 띄고 있다.

     - extends vs implements
        >  extends : 클래스 간 상속 관계, 확장 / 단일 상속
        >  implements : 클래스 간 구현 관계, 구현 / 다중 구현(상속)
        >> implements 이름, 이름, 이름
    */

    // field - 모두 상수
    /* public static final */ int AGE = 0;
    int HEIGHT = 0;

    // constructor - 인터페이스는 객체 생성 불가, 생성자 정의 불필요

    // method - 모두 추상 메서드
    /* public abstract */ void eat();
    void sleep();

    // 확장성 면에서 이후 무조건 오버라이딩 해야하는 메소드들만 인터페이스에 몰아두면
    // 공통적으로 필요한 메소드, 필드만 정의하고, 무조건 오버라이딩 필요한 메소드는 인터페이스로 분리 가능
}
