package com.kh.chap02_abstractANDinterface.part02_family.run;

import com.kh.chap02_abstractANDinterface.part02_family.model.vo.Baby;
import com.kh.chap02_abstractANDinterface.part02_family.model.vo.Mother;
import com.kh.chap02_abstractANDinterface.part02_family.model.vo.Person;

public class FamilyRun {
    public static void main(String[] args) {
        // Person p = new Person(); // 추상 클래스는 객체 생성 불가

        Person p1 = new Mother("김엄마", 50, 70, "출산");
        Person p2 = new Baby("김아기", 20, 10); 
        
        System.out.println(p1);
        System.out.println(p2);

        p1.eat();
        p2.eat();
        p1.sleep();
        p2.sleep();

        System.out.println("==============================");
        System.out.println(p1);
        System.out.println(p2);

        /*
        공통점
        - 객체 생성은 안되나, 참조 변수로써 사용 가능(다형성 적용 가능)
        - 상속받는 클래스에 추상 메소드를 오버라이딩 하도록 강제 가능
        
        차이점
        - 추상 클래스는 클래스 내에 인스턴스 변수, 일반 메소드 작성 가능
        - 인터페이스는 상수, 추상 메소드만 작성 가능
        */
    }
}
