package com.kh.chap01.loop;

import java.util.Scanner;

public class Homework2 {

    Scanner sc = new Scanner(System.in);

    /**
     * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요
     * 단 입력한 수는 1보다 크거나 같아야 합니다.
     * for문 이용
     */
    public void practice3() {
        System.out.println("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();
        sc.nextLine();

        if (num < 1) {
            System.out.println("1보다 큰 수를 입력해주세요.");
        } else {
            for (int i = num; i >= 1; i--) {
                System.out.print(i + " ");
            }
        }
    }

    /**
     * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
     * 만일 1 미만의 숫자가 입력됐다면 “1이상의 숫자만을 입력해주세요“를 출력하세요.
     * for문 이용
     */
    public void practice6() {
        System.out.println("첫 번째 숫자 : ");
        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.println("두 번째 숫자 : ");
        int num2 = sc.nextInt();
        sc.nextLine();

        if (num1 < 1 || num2 < 1) {
            System.out.println("1 이상의 숫자만을 입력해주세요.");
            return;
        }

        if(num1 < num2) {
            for (int i = num1; i <= num2; i++) {
                System.out.print(i + " ");
            }
        } else if (num1 > num2) {
            for (int i = num2; i <= num1; i++) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println(num1);
        }
    }

}
