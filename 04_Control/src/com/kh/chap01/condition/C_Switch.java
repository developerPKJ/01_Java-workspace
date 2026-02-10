package com.kh.chap01.condition;

import java.util.Scanner;
import java.io.PrintStream;

public class C_Switch {
    // switch문 - 조건식 기술 없이 변수-결과값에 따른 분기 처리
    // default문(else) 필수는 아님 + break문 필수 아님

    public Scanner sc = new Scanner(System.in, "UTF-8");

    /**
     * 1~3 사이의 정수값을 입력받아
     * 1인 경우 빨간불
     * 2인 경우 노란불
     * 3인 경우 초록불
     * 그 외의 숫자를 입력한 경우 "잘못 입력하셨습니다." 출력하는 메서드
     */
    public void method1() {
        System.out.print("1~3 사이의 정수값을 입력하세요 : ");
        int num = sc.nextInt();
        sc.nextLine(); // 입력 버퍼 개행문자 제거용

        switch(num) {
            case 1:
                System.out.println("빨간불");
                break;
            case 2:
                System.out.println("노란불");
                break;
            case 3:
                System.out.println("초록불");
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
        }
    }

    /**
     * method1()와 동일한 기능이지만 if문 방식을 사용한 메서드
     */
    public void method2() {
        System.out.print("1~3 사이의 정수값을 입력하세요 : ");
        int num = sc.nextInt();
        sc.nextLine(); // 입력 버퍼 개행문자 제거용

        if(num == 1) {
            System.out.println("빨간불");
        } else if(num == 2) {
            System.out.println("노란불");
        } else if(num == 3) {
            System.out.println("초록불");
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }
    }

    /**
     * 이번엔 method1()과 동일한데
     * 항상 sysout을 사용하지 않고 string 변수에 결과를 저장하고
     * 최종적으로 출력문 한번만 실행
     */
    public void method3() {
        System.out.print("1~3 사이의 정수값을 입력하세요 : ");
        int num = sc.nextInt();
        sc.nextLine(); // 입력 버퍼 개행문자 제거용

        String result = "";

        switch(num) {
            case 1:
                result = "빨간불";
                break;
            case 2:
                result = "노란불";
                break;
            case 3:
                result = "초록불";
                break;
            default:
                result = "잘못 입력하셨습니다.";
        }
        System.out.println(result);
    }

    /**
     * default에서 return문 적용 예시
     */
    public void method4() {
        System.out.print("1~3 사이의 정수값을 입력하세요 : ");
        int num = sc.nextInt();
        sc.nextLine(); // 입력 버퍼 개행문자 제거용

        String result = "";

        switch(num) {
            case 1:
                result = "빨간불";
                break;
            case 2:
                result = "노란불";
                break;
            case 3:
                result = "초록불";
                break;
            default:
                System.out.println("잘못 입력하셨습니다.");
                return; // default에서 return문을 사용하여 메서드 종료
        }
        System.out.println(result);
    }    
    
    /**
     * 사용자에게 구매할 과일명을 입력받아
     * 각 과일마다 가격을 출력
     * 사과 1000, 바나나 2000, 복숭아 5000
     */
    public void method5() {
        System.out.print("구매할 과일명을 입력하세요(사과/바나나/복숭아) : ");
        String fruit = sc.nextLine();

        int price = 0;

        switch(fruit) {
            case "사과":
                price = 1000;
                break;
            case "바나나":
                price = 2000;
                break;
            case "복숭아":
                price = 5000;
                break;
            default:
                System.out.println("해당 과일은 판매하지 않습니다.");
                return;
        }
        System.out.printf("%s의 가격은 %d원입니다.%n", fruit, price);
    }
    
}
