package com.kh.chap01.loop;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class A_For {
    public Scanner sc = new Scanner(System.in);

    public void method1() {
        System.out.println("method1() 호출됨");
        System.out.println("A_For의 method1() 호출됨");
        System.out.println("A_For의 method1() 호출됨");
        System.out.println("A_For의 method1() 호출됨");
        System.out.println("A_For의 method1() 호출됨");
        System.out.println("A_For의 method1() 호출됨");
    }

    public void method2() {
        System.out.println("method2() 호출됨");

        for(int i = 0; i < 5; i++) {
            System.out.println("A_For의 method2() 호출됨");
        }
    }

    public void method3() {
        for(int i = 11; i < 16; i++) {
            System.out.println("퇴근합시다");
            System.out.println(i);
        }
    }

    public void method4() {
        for(int i = 1; i < 10; i+=2) {
            System.out.println("하이");
        }
    }

    /**
     * hello 5번 출력
     * i가 10에서 6보다 크거나 같을때까지 1씩 감소
     */
    public void method5() {
        for(int i = 10; i >= 6; i--) {  // 10 9 8 7 6 (5)
            System.out.println("hello");
        }
    }
    
    // 가장 표준?적인 for문
    // n번 반복 원할 때 --> i = 0 ; i < n ; i++
    public void method6() {
        for(int i = 0; i < 5; i++) {
            System.out.println("A_For의 method6() 호출됨");
        }
    }

    //조건식 실수
    public void method7() {
        for(int i = 1; i > 5; i++) {
            System.out.println("A_For의 method7() 호출됨");
        }
    }

    /**
     * 의도적인 무한루프
     * - 조건식 true
     * - 조건식 생략
     * - 항상 참이 되는 조건식(보통 이 방식은 쓸일이 없겠지만)
     * 어차피 무한루프는 while문이 정배
     */
    public void method8() {
        for(;;) {
            System.out.println("무한루프");
        }
    }

    // 출력 내용이 변하는 반복문
    public void method9() {
        for(int i = 1; i <= 11; i++) {
            System.out.println(i);
        }
        for(int i = 0; i < 11; i++) {
            System.out.println(i+1);
        }
    }

    public void method10() {
        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // 줄바꿈
    }

    public void method11() {
        int k = 0;
        for(int i = 0; i < 11; i++) {
            k += i;
        }
        System.out.println(k);
    }

    //random 클래스 활용
    public void method12() {
        Random rand = new Random();

        System.out.println(Math.random() * 10 + 1);; // 1~10 double value
        System.out.println(rand.nextInt(10) + 1); // 1~10 int value
        //java util의 random의 경우는 nextInt말고 다른 메소드 사용하면 다른 value가능
    }

    public void method13() {
        int row = 2;
        for(int col = 1; col <= 9; col++) {
            System.out.println(row + " * " + col + " = " + (row * col));
        }   
    }

    public void method14() {
        for(int row = 1; row <= 9; row++) {
            for(int col = 1; col <= 9; col++) {
                System.out.printf("%d * %d = %2d   ", row, col, (row * col));
            }
            System.out.println();
        }   
    }

    /**
     * 1***
     * *2**
     * **3*
     * ***4
     */
    public void method15() {
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                if (i == j) {
                    System.out.print(j+1);
                }else {
                    System.out.print('*');
                }
            }
            System.out.println();
        }
    }

    public void method16() {
        for (int i = 0; i < 5; i++){
            for (int k = 0; k <= i; k++){
                    System.out.print('*');
                }
                System.out.println();
        }
    }

    public void method17() {
        for (int i = 5; i > 0; i--){
            for (int k = 0; k < i; k++){
                    System.out.print('*');
                }
                System.out.println();
        }
    }

    public void method18() {
        method14();
    }

    public void method19() {
        System.out.print("영문 문자열 입력 : ");
        String inputText = sc.nextLine();

        System.out.println("-------------------------");

        for (int i = 0; i < inputText.length(); i++) {
            System.out.printf("%d번째 글자 : %c\n", i, inputText.charAt(i));
        }
    }

    /**
     * lotto 번호 생성기 v1.0
     * - 배열과 중첩 for문을 활용한 중복 제거
     */
    public void method20() {
        int lottoNumbers[] = new int[6];
        Random rand = new Random();

        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = rand.nextInt(45) + 1;
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    if (lottoNumbers[i] == lottoNumbers[j]) {
                        i--; // 다시 뽑기
                        break;
                    }
                }
            }
        }
        System.out.print("로또 번호 : " );
        for (int i = 0; i < lottoNumbers.length; i++) {
            System.out.print(lottoNumbers[i] + " ");
        }
    }

    /**
     * lotto 번호 생성기 v2.0
     * - Set 컬렉션을 활용한 중복 제거
     */
    public void method21() {
        Set<Integer> lottoSet = new HashSet<>();
        Random rand = new Random();
        while (lottoSet.size() < 6) {
            lottoSet.add(rand.nextInt(45) + 1);
        }
        System.out.println("로또 번호 : " + lottoSet);
    }

}
