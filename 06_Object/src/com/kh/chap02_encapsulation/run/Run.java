package com.kh.chap02_encapsulation.run;

import java.util.Scanner;

// import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {
    /*
    캡슐화 : 클래스의 필드(변수)를 외부에서 직접 접근하지 못하도록 하고,
           메소드를 통해서만 접근 가능하도록 하는 것
    - 필드 : private
    - 메소드 : public
    - 생성자 : public

    캡슐화를 하지 않으면 외부로부터 직접 접근이 가능하기 때문에 함부로
    값이 변질되거나 조회가 가능해지게 됨
    --> 접근 제한자를 private로 설정하기(필드값)

    getter/setter 메소드
    - getter : 필드값을 조회할 때 사용하는 메소드
    - setter : 필드값을 수정할 때 사용하는 메소드
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        Student std = new Student();
        System.out.println("이름 : ");
        std.setName(sc.nextLine());
        System.out.println("나이 : ");
        std.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("키 : ");
        std.setHeight(sc.nextDouble());
        sc.nextLine();

        System.out.printf("이름 : %s, 나이 : %d, 키 : %.1f\n", 
                        std.getName(), std.getAge(), std.getHeight());
        std.stdInfo();
        */

        /*/
        Student std2 = new Student();
        std2.setName("고길동");
        std2.setAge(24);
        std2.setHeight(180.3);
        std2.stdInfo();
        */

        // Student std3 = new Student("둘리", 100, 150.5);
        // std3.stdInfo();

        /*
        앞으로 vo만들때
        1. 필드 만들기
        2. 생성자 만들기
        3. getter/setter 만들기
        4. information 메소드 만들기
        */

        sc.close();
    }

}
