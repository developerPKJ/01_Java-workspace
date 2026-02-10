package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
    public Scanner scan = new Scanner(System.in);

    public void method1() {
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

    /**
     * 점수를 입력 받으면 점수와 등급을 출력하는 메서드
     */
    public void method3() {
        /*
        사용자에게 점수를 입력 받은 후
        90점 이상 : A
        80점 이상 : B
        70점 이상 : C
        70점 미만 : D
        >> 당신의 점수는 xx점이고, 등급은 x등급입니다. - 출력
        단 점수는 음수가 될 수 없고, 만점은 100점임
        */   
        System.out.println("점수 입력 :");
        int score = scan.nextInt(); 
        scan.nextLine();

        if (score < 0 || score > 100) {
            System.out.println("점수를 잘못 입력하였습니다");
        } else if (score >= 90) {
            System.out.printf("당신의 점수는 %d점이고, 등급은 A등급입니다.", score);
        } else if (score >= 80) {
            System.out.printf("당신의 점수는 %d점이고, 등급은 B등급입니다.", score);
        } else if (score >= 70) {
            System.out.printf("당신의 점수는 %d점이고, 등급은 C등급입니다.", score);
        } else {
            System.out.printf("당신의 점수는 %d점이고, 등급은 D등급입니다.", score);
        }
    }
    /*
    char는 String과 다르게 빈 문자열이라는 개념이 존재하지 않음
    따라서 char 자료형을 초기화 할 때는 반드시 하나 이상의 문자를 입력해야 함 : 보통 ' ' 이렇게 공백을 둠
    String은 "" 이렇게 아무것도 없는 상태로 초기화
    정수나 실수는 0 or 0.0으로 초기화
    boolean은 false로 초기화
    */
   
}
