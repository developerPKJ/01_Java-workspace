package com.kh.chap01_abstraction.model.vo;

// 기존 메소드가 들어가는 컨트롤러 클래스
// 데이터가 들어가는 VO 클래스

/*
자바 클래스의 구조
public class 클래스명 {
    필드부

    생성자부

    메소드부
}
*/

public class Student {
    String name;
    int age;
    double height;
    public int weight;

    /*
    메소드 밖에 있는 변수(필드)는 전역변수라고도 부름
    접근 제한자 : public > (default) > protected > private
    */
    public Student(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void inputName(String name) {
        this.name = name;
    }
    
    public void inputAge(int age) {
        this.age = age;
    }

    public void inputHeight(double height) {
        this.height = height;
    }

    public void outputInfo() {
        System.out.print("이름 : " + name);
        System.out.print("\t나이 : " + age);
        System.out.print("\t키 : " + height);
        System.out.println("\t몸무게 : " + weight);
    }

}
