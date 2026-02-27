package com.kh.chap02_abstractANDinterface.part01_basic.model.vo;

public class Basketball extends Sports {
    // field

    // constructor
    public Basketball() {}

    // method
    @Override
    public void rule() {
        System.out.println("손으로 공을 던져 링에 넣는 경기입니다.");
    }
    // 원래 rule() 메소드는 Sports 클래스에서 추상메소드로 정의되어 있기 때문에
    // Basketball 클래스에서 반드시 오버라이딩을 통해 재정의 되어야 한다.(아니면 추상클래스로 봄)
    // 아니면 호출이 불가
}
