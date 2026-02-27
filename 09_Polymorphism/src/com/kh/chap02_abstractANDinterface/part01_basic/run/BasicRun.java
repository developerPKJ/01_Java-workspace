package com.kh.chap02_abstractANDinterface.part01_basic.run;

import com.kh.chap02_abstractANDinterface.part01_basic.model.vo.Basketball;
import com.kh.chap02_abstractANDinterface.part01_basic.model.vo.Football;
import com.kh.chap02_abstractANDinterface.part01_basic.model.vo.Sports;

public class BasicRun {
    public static void main(String[] args) {
        /*
            * 4. 추상클래스는 객체 생성이 불가능하다.
            *    (Sports s = new Sports(); X)
            * 
            * 5. 객체 생성은 안되지만 참조변수로는 사용 가능하다.
            *    (Sports s; O)
            *    (Sports s = new Football(); O)
        */
        Sports s;
        s = /* (Sports) */new Football();
        ((Football)s).setName("축구");
        s.setPeople(11);
        System.out.println(s);
        s.rule();

        System.out.println("===============================");

        Sports[] arr = new Sports[2];
        arr[0] = new Football();
        arr[1] = new Basketball();

        arr[0].setPeople(11);
        arr[1].setPeople(5);

        for(Sports sp : arr) {
            System.out.println(sp);
            sp.rule();
        }

        // 메소드 사용의 통일성을 확보하기 위해 추상 메소드를 사용함
        // 추상 메소드가 없더라도 abstract 예약어로 추상 클래스로 만들 수 있으며,
        // --?   클래스 구현이 미완성일 때, 객체 생성을 막고 싶을 때 적용 가능
    }
}
