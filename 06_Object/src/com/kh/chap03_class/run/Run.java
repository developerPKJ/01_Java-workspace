package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Coffee;
// import com.kh.chap03_class.model.vo.Person;
// import com.kh.chap03_class.model.vo.Product;

public class Run {
    public static void main(String[] args) {
        /*
        Person p1 = new Person("user01", 
                                "pass01", 
                                "김가현", 
                                20, 
                                'F', 
                                "010-1111-2222", 
                                "gahyun@kh.com");
        System.out.println(p1.information());

        System.out.println("===============================");

        Product pr1 = new Product("갤럭시 z플립4", 
                                    1350000, 
                                    "삼성");
        System.out.println(pr1.information());

        System.out.println("===============================");

        Product pr2 = new Product();
        pr2.setpName("아이폰 14");
        pr2.setPrice(1500000);
        pr2.setBrand("애플");
        System.out.println(pr2.information());
        
        // getter와 setter는 반드시 만들어야함(정보은닉(캡슐화) 원칙 준수)
        // (setter의 경우 필드 변수가 final이 아닌이상)
        */

        Coffee c1 = new Coffee("아메리카노", 4000, 'O', 'M');
        System.out.println("c1:"+c1.information());

        Coffee c2 = c1;              // c1이 참조하는 주소값을 c2도 참조하게 됨(얕은 복사)
        System.out.println("c2:" + c2.information());

        System.out.println("===============================");

        c2.setPrice(5000);    // 값을 변경 시 같은 주소 값을 참조하기에 둘다 변함
        System.out.println("c1:"+c1.information());
        System.out.println("c2:"+c2.information());

        System.out.println("===============================");

        Coffee c3 = new Coffee();   // c1과 c3가 서로 다른 주소 참조(깊은 복사)
        c3.setcName(c1.getcName());
        c3.setPrice(c1.getPrice());
        c3.setOption(c1.getOption());
        c3.setSize(c1.getSize());
        System.out.println("c3:"+c3.information());

        System.out.println("===============================");

        c3.setPrice(6000);  // 값을 변경 시 다른 주소 값을 참조하기에 c1은 변하지 않음
        System.out.println("c1:"+c1.information());
        System.out.println("c3:"+c3.information());
    }
}
