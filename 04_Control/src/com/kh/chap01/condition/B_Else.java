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
    }

    public void method2() {
        Scanner scan = new Scanner(System.in);

        //나이 입력 받은 후 어린이,청소년,성인 판별 후 결과 출력
        //13이하, 19이하, 19 초과
        //판별 하되, 나이가 음수로 입력된 결우에는 "나이를 잘못 입력하였습니다" 출력

        System.out.println("나이 입력 :");
        int age = scan.nextInt();
        scan.nextLine();

        if (age < 0) {
            System.out.println("나이를 잘못 입력하였습니다");
        } else if (age <= 13) {
            System.out.println("어린이");
        } else if (age <= 19) {
            System.out.println("청소년");
        } else {
            System.out.println("성인");
        }
    }
}
