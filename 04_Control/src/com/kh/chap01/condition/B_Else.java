package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
    public void method1() {
        Scanner scan = new Scanner(System.in);

        System.out.println("정수 입력 :");
        int n = scan.nextInt();
        scan.nextLine();

        if (n > 0) {
            System.out.println("양수");
            if (n % 2 == 0) {
                System.out.println("짝수");
            } else {
                System.out.println("홀수");
            }
        } else if (n < 0) {
            System.out.println("음수");
        } else {
            System.out.println("0");
        }
        
        scan.close();
    }
}
