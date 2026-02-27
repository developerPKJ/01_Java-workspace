package com.kh.chap02_abstractANDinterface.part01_basic.model.vo;

public abstract class Sports {
    // field
    private int people;     // 경기 인원 수

    // constructor
    public Sports() {}

    public Sports(int people) {
        this.people = people;
    }

    // method
    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    @Override
    public String toString() {
        return "people : " + people;
    }

    public abstract void rule();
    /*
        * 1. rule() 메소드는 Sports 클래스를 상속받은 모든 자식 클래스에서
        *    반드시 오버라이딩을 통해 재정의 되어야 한다.
        *    
        * 2. Sports 클래스에서 rule() 메소드를 정의할 때
        *    추상메소드로 정의하자! (= 내부 코드를 작성해 둘 필요가 없다, 대신 ;붙이기)
        *   (추상메소드란? 메소드의 선언부만 작성되어 있고, 몸통 부분은 작성되지 않은 메소드)
        *   --> 호출, 실행 불가
        * 
        * 3. 추상메소드가 존재하는 클래스는 반드시 추상클래스로 정의해야 한다.
         *    (추상메소드가 존재하는 클래스는 일반 클래스가 될 수 없다.)
    */

}
