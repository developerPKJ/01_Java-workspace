package com.kh.array;

import java.util.Scanner;

public class A_Array {

    public Scanner sc = new Scanner(System.in);
    
    public void method5() {
        int[] iArr = new int[5];

        for(int i = 0; i < iArr.length; i++) {
            iArr[i] = (int)(Math.random() * 50) + 51;
            System.out.println("iArr[" + i + "] : " + iArr[i]);
        }
    }

    /**
     * 3명의 사용자에게 키의 정보를 입력 받아 배열에 담아두고, 3명의 키 정보를 각각 출력
     * 또한 3명의 키의 총합, 평균 출력
     */
    public void method6() {
        double[] height = new double[3];
        double sum = 0;

        for (int i = 0; i < height.length; i++) {
            System.out.print((i + 1) + "번째 키 입력 : ");
            height[i] = ((int)(sc.nextDouble() * 10)) / 10.0; // 소수점 첫째자리까지 반올림
            sc.nextLine(); // 버퍼 비우기

            sum += height[i];
        }

        for (int i = 0; i < height.length; i++) {
            System.out.printf("%d번째 키 : %.1fcm\n", i+1, height[i]);
        }

        System.out.println("총합 : " + sum + "cm");
        System.out.printf("평균 : %.1fcm\n", sum / height.length);
    }

    /**
     * 사용자에게 문자열을 한개 입력받은 후
     * 그 문자열의 각각의 문자들을 char 배열에 옮겨 담고
     * char 배열에 문자들이 잘 옮겨 담아졌는지 출력
     */
    public void method7() {
        System.out.println("문자열을 입력하세요 : ");
        String str = sc.nextLine();
        char[] strChar = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            strChar[i] = str.charAt(i);
            System.out.println(strChar[i]);
        }
        System.out.println("char 배열 크기 : " + strChar.length);
    }

    /**
     * 사용자로부터 좋아하는 과일 갯수 입력받
     * 그 갯수만큼 과일명을 입력받아서 String 배열에 대입, 출력
     */
    public void method8() {
        System.out.println("과일 이름 : ");
        String fruitName = sc.nextLine();

        System.out.println("과일 갯수");
        int fruitNum = sc.nextInt();
        sc.nextLine();

        String str = "";

        for (int i = 0; i < fruitNum; i++) {
            str += fruitName;
        }
        System.out.println(str);
        System.out.println();
    }

    /**
     * 사용자로 부터 정수 10개를 입력 받은 후 배열에 담고
     * 그 10개의 정수 중 짝수의 갯수, 홀수의 갯수를 세서 출력
     */
    public void method9() {
        int[] iArr = new int[10];
        int num = 0;

        for (int i = 0; i < iArr.length; i++) {
            System.out.println("정수 입력 : ");
            iArr[i] = sc.nextInt();
            sc.nextLine();

            if (iArr[i] % 2 == 0) {
                num++;
            }
        }
        System.out.println("짝수 개수 : " + num);
        System.out.println("홀수 개수 ; " + (iArr.length - num));
        System.out.println();
    }

    /**
     * 5명의 학생의 점수를 입력받은 후 배열에 담고
     * 60점 이상이면 합격, 미만이면 불합격 출력
     */
    public void method10() {
        int[] score = new int[5];

        for (int i = 0; i < score.length; i++) {
            System.out.println("학생 점수 입력 : ");
            score[i] = sc.nextInt();
            sc.nextLine();
        }

        for (int i = 0; i < score.length; i++) {
            if (score[i] >= 60) {
                System.out.println("합격");
            }else {
                System.out.println("불합격");
            }
        }
        System.out.println();
    }

}
