package com.kh.chap01_oneVSmany.model.vo;

public class Book {
    // field
    private String title;       // 도서명
    private String author;      // 저자
    private int price;          // 가격
    private String publisher;   // 출판사

    
    // constructor
    public Book() {}

    public Book(String title, String author, 
                int price, String publisher) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.publisher = publisher;
    }

    
    // method
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String information() {
        return "도서명: " + title + ", 저자: " + author + 
                ", 가격: " + price + "원, 출판사: " + publisher;
    }

}
