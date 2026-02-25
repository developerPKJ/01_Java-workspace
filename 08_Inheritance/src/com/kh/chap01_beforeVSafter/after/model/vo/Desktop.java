package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product {
    // field
    private boolean allInOne;   // 일체형 여부

    // constructor
    public Desktop() {}

    public Desktop(String brand, String pCode, String pName, int price, boolean allInOne) {
        super(brand, pCode, pName, price);
        this.allInOne = allInOne;
        /*
        현재 Product 클래스에 있는 필드의 접근 제한자가 private이기 때문에 자식 클래스에서
        this. 이든 super. 이든 접근이 불가하다.
        -->
        1. 부모 클래스의 필드의 접근 제한자를 protected로 변경한다.
        2. 부모 클래스의 settter 메소드를 이용한다.
        3. 부모 클래스의 매개변수 생성자를 이용한다.

        주의 사항
        - 부모클래스의 생성자, 초기화 블록은 상속 안 됨 = this. 사용 불가, super. 사용
        - 호출 구문은 항상 첫 번째 줄에 작성
        - 가능하면, 명시적인 super. 구문으로 사용하는 것을 권장
        */
    }

    // method
    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }

    public String information() {
        return super.information() + " / " + allInOne;
    }
}
