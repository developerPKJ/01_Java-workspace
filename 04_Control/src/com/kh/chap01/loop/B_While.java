package com.kh.chap01.loop;

public class B_While {
    /*
     * while문
     * [표현법]
     * 
     * 초기식;
     * while(조건식) {
     *      반복적으로 실행할 코드;
     *      증감식;
     * }
     * 
     * - for문과 다르게 문법상 명시적인 초기식, 증감식이 존재하지 않음
     * - 반복적으로 실행할 코드 안에서 초기식, 증감식을 작성해야 함
     * - 조건식이 true일 경우 해당 코드를 반복적으로 실행함
     * - 조건식이 false일 경우 반복문을 빠져나감
     */

    public void method1() {
        // for (int i = 0; i < 5; i++)
        int i = 0;
        while(i < 5) {
            System.out.println("while문을 공부중입니다.");
            i++;
        }
    }

    public void method2() {
        // for (int i = 0; i < 10; i++)
        int i = 0;
        while(i < 10) {
            System.out.printf("i : %d\n", i+1);
            i++;
        }
    }

    public void method3() {
        // for (int i = 1; i <= 5; i++)
        int i = 1;
        while(i <= 5) {
            System.out.print(i + " ");
            i++;
        }
    }

    public void method4() {
        int i = 1;
        while(i<10) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void method5() {
        int sum = 0;
        int i = 1;

        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println("1부터 10까지의 합 : " + sum);
    }

    public void method6() {
        while (true) {
            System.out.println("무한루프");
        }
    }

    //continue문 : 반복문 안에서 continue문을 만나게 되면
    //              그 뒤에 어떤 코드가 있든지 상관없이
    //              반복문 처음 이동하여 다음 반복을 진행함
    //              근데 사실 있어도 그만 없어도 그만이긴 함
}
