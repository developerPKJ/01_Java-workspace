package com.kh.chap03_override.model.vo;

public class Book {
    // field
    private String title;
    private String author;
    private int price;


    // constructor
    public Book() {}

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
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

    public String information() {
        return "title : " + title + ", author : " + author + ", price : " + price;
    }

    // 앞으로 information() 메소드 대신 toString() 메소드를 재정의하여 사용할 예정
    @Override
    public String toString() {
        return "title : " + title + ", author : " + author + ", price : " + price;
    }
}
