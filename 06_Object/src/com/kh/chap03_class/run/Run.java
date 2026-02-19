package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run {
    public static void main(String[] args) {
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
    }
}
