package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {
    public static void main(String[] args) {
        // 기본 생성자
        User user1 = new User();
        System.out.println(user1.information());

        System.out.println("===============================");

        // 매개변수 생성자
        User user2 = new User("user01", "pass01", 
                            "홍길동", 20, 'M');
        System.out.println(user2.information());

        System.out.println("===============================");

        user2.setUserName("윤봉길");
        System.out.println(user2.information());
    }
}
