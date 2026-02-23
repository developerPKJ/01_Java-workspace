package com.hw1.run;

import com.hw1.model.controller.NonStaticSample;
import com.hw1.model.controller.StaticSample;
import com.hw1.model.vo.Book;
import com.hw1.model.vo.Circle;
import com.hw1.model.vo.Product;

public class Run {
    public static void main(String[] args) {
        
        Circle hw = new Circle();
        System.out.println("원의 둘레 : ");
        hw.getSizeOfCircle();
        System.out.println("원의 넓이 : ");
        hw.getAreaOfCircle();
        System.out.println("===반지름 1증가===");
        hw.incrementRadius();
        System.out.println("원의 둘레 : ");
        hw.getSizeOfCircle();
        System.out.println("원의 넓이 : ");
        hw.getAreaOfCircle();

        System.out.println();
        System.out.println("=================");
        System.out.println();
        
        System.out.println("b1");
        Book b1 = new Book("자바의 정석", "도우출판", "남궁성", 30000, 0.2);
        System.out.println(b1.information());
        System.out.println("b2");
        Book b2 = new Book("자바의 정석", "도우출판", "남궁성");
        System.out.println(b2.information());

        System.out.println();
        System.out.println("==================");
        System.out.println();

        Product p1 = new Product("ssgnote9", "갤럭시노트9", 
                                "경기도 수원", 960000, 10);
        System.out.println(p1.information());
        Product p2 = new Product("lgxnote5", "LG스마트폰5", 
                                "경기도 평택", 780000, 0.7);
        System.out.println(p2.information());
        Product p3 = new Product("ktsnote3", "KT스마트폰3", 
                                "서울시 강남", 250000, 0.3);
        System.out.println(p3.information());
        System.out.println("===가격 변경===");
        p1.setPrice(1200000);
        System.out.println(p1.information());
        p2.setPrice(1200000);
        System.out.println(p2.information());
        p3.setPrice(1200000);
        System.out.println(p3.information());
        System.out.println("===부가세 포함 가격출력===");
        System.out.println("상품명 : " + p1.getProductName() + "\n부가세 포함 가격 : " 
                            + (int)(p1.getPrice() * (1 + p1.getTax() / 100)));
        System.out.println("상품명 : " + p2.getProductName() + "\n부가세 포함 가격 : " 
                            + (int)(p2.getPrice() * (1 + p2.getTax() / 100)));
        System.out.println("상품명 : " + p3.getProductName() + "\n부가세 포함 가격 : " 
                            + (int)(p3.getPrice() * (1 + p3.getTax() / 100)));

        System.out.println();
        System.out.println("==================");
        System.out.println();

        NonStaticSample nss = new NonStaticSample();
        nss.printLottoNumbers();
        nss.outputChar(5, 'A');
        System.out.println("랜덤 알파벳 : " + nss.alphabette());
        System.out.println("apple의 2번 4번 인덱스 사이의 값 출력 : " + 
                            nss.mySubstring("apple", 2, 4));
    
        System.out.println();
        System.out.println("==================");
        System.out.println();

        // StaticSample 클래스 변수인 value를 “Java”로 초기화 후 출력
        // toUpper 메소드 실행을 통해 대문자로 변경 후 출력
        // valueLength 메소드 실행을 통해 길이 출력
        // valueConcat 메소드 실행을 통해 “PROGRAMMING” 문자열 합친 후 출력
        // setChar 메소드 실행을 통해 “J”를 “C”로 변경 후 출력
        StaticSample ss = new StaticSample();
        ss.setValue("Java");
        System.out.println("value : " + ss.getValue());
        StaticSample.toUpper();
        System.out.println("대문자로 : " + ss.getValue());
        System.out.println("길이 : " + StaticSample.valueLength());
        System.out.println("PROGRAMMING 붙여서 " + StaticSample.valueConcat("PROGRAMMING"));
        StaticSample.setChar(0, 'C');
        System.out.println("J => C : " + ss.getValue());
    }
}
