package com.kh.chap01_oneVSmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVSmany.model.vo.Book;

public class ObjectRun {
    public static void main(String[] args) {
        // 기본 생성자 + setter 메소드 이용
        Book bk1 = new Book();
        bk1.setTitle("자바의 정석");
        bk1.setAuthor("박은종");
        bk1.setPrice(25000);
        bk1.setPublisher("이지스 퍼블리싱");
        System.out.println(bk1.information());

        // 매개변수 생성자 이용
        Book bk2 = null;
        bk2 = new Book("개발자를 위한 쉬운 도커", "황현우", 
                        28000, "위키북스");
        System.out.println(bk2.information());

        // Book(입력 값들)
        Scanner sc = new Scanner(System.in);

        System.out.print("도서명: ");
        String title = sc.nextLine();
        System.out.print("저자: ");
        String author = sc.nextLine();
        System.out.print("가격: ");
        int price = sc.nextInt();
        sc.nextLine(); // 버퍼에 남아있는 개행문자 제거
        System.out.print("출판사: ");
        String publisher = sc.nextLine();

        Book bk3 = new Book(title, author, price, publisher);
        System.out.println(bk3.information());

        // 객체 배열
        Book[] bookArr = new Book[3];
        bookArr[0] = bk1;
        bookArr[1] = bk2;
        bookArr[2] = bk3;

        System.out.println();
        System.out.println("=== 도서 목록 ===");
        for (int i = 0; i < bookArr.length; i++) {
            System.out.println(bookArr[i].information());
        }
        /*
        for (Book book : bookArr) {
            System.out.println(book.information());
        }
        */

        // search
        System.out.print("검색할 도서명: ");
        String searchTitle = sc.nextLine();

        for (int i = 0; i < bookArr.length; i++) {
            if (bookArr[i].getTitle().equals(searchTitle)) {
                System.out.println("검색 결과: " + bookArr[i].information());
                break;
            }
        }

        


        sc.close();
    }
}
