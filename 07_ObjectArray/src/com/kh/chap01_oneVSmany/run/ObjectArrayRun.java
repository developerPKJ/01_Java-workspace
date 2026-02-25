package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectArrayRun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Book[] bookArr = null;
        /*
        for (int i = 0; i < bookArr.length; i++) {
            System.out.println("도서명: ");
            String title = sc.nextLine();
            System.out.println("저자: ");
            String author = sc.nextLine();
            System.out.println("가격: ");
            int price = sc.nextInt();
            sc.nextLine(); // 버퍼 비우기
            System.out.println("출판사: ");
            String publisher = sc.nextLine();
            bookArr[i] = new Book(title, author, price, publisher);
        }
        

        for (int i = 0; i < bookArr.length; i++) {
            System.out.println(bookArr[i].getPrice());
        }   
        */

        bookArr = new Book[] {
            new Book("자바의 정석", "남궁성", 30000, "도우출판"),
            new Book("열혈강의 자바", "구정은", 25000, "프리렉"),
            new Book("자바의 신", "김영한", 35000, "에이콘출판"),
            new Book("자바의 신", "김영한", 35000, "에이콘출판"),
            new Book("자바의 신", "김영한", 35000, "에이콘출판")
        };

        System.out.println("찾는 책의 제목을 입력하세요: ");
        String searchTitle = sc.nextLine();
        int count = 0;
        for (int i = 0; i < bookArr.length; i++) {
            if (bookArr[i].getTitle().equals(searchTitle)) {
                count++;
            }
        }
        System.out.println("찾는 책의 제목이 " + count + "권 있습니다.");

        sc.close();
    }
}
