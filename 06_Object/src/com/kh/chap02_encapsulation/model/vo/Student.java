package com.kh.chap02_encapsulation.model.vo;

public class Student {
    // 필드 : 클래스 영역에 바로 정의된 변수(메소드 밖) = 전역 변수
    // 접근 제한자(예약어) 꼭 붙여야 함
    private String name;
    private int age;
    private double height;


    // 생성자
    public Student() {}
    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    // 메소드(접근제한자 반환형 메소드명(매개변수)) - 아래는 getter/setter 메소드 표준 작성법
    // 지역 변수가 전역 변수보다 우선순위가 높기 때문에 this.필드명으로 구분해주어야 함
    // 해당 메소드 들은 당연히 public으로 작성해야 외부에서 접근 가능
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public void stdInfo() {
        System.out.printf("이름 : %s, 나이 : %d, 키 : %.1f\n", 
                            name, age, height);
    }
}
