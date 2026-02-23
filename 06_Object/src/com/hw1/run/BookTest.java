package com.hw1.run;

import com.hw1.model.vo.BookOld;

public class BookTest {
    public static void main(String[] args) {
        BookOld bk1 = new BookOld();
        BookOld bk2 = new BookOld("자바의 정석", 20000, 0.2, "윤상섭");
        System.out.println(bk1.information());

        bk1.setTitle("자바의 정석");
        bk1.setPrice(20000);
        bk1.setDiscountRate(0.2);
        bk1.setAuthor("윤상섭");
        System.out.println(bk1.information());

        bk2.setTitle("DoIt! 자바프로그래밍입문");
        bk2.setPrice(25000);
        bk2.setDiscountRate(0.1);
        bk2.setAuthor("박은종");

        System.out.println("============================");
        System.out.println("수정된 결과 확인");
        System.out.println(bk2.information());

        System.out.println("============================");
        System.out.println("도서명 = " + bk2.getTitle());
        System.out.println("할인된 가격 = " + (int)(bk2.getPrice() - 
                            (bk2.getPrice() * bk2.getDiscountRate())) + "원");
        
        System.out.println("도서명 = " + bk1.getTitle());
        System.out.println("할인된 가격 = " + (int)(bk1.getPrice() - 
                            (bk1.getPrice() * bk1.getDiscountRate())) + "원");
    }
}
