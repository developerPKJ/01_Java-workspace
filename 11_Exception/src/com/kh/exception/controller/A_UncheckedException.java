package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
    /*
    Unchecked Exception 종류들
    - ArrayIndexOutOfBoundsException : 배열의 범위를 벗어난 인덱스로 접근할 때 발생하는 예외
    - NullPointerException : null인 참조 변수를 사용하려고 할 때 발생하는 예외
    - ClassCastException : 객체를 잘못된 타입으로 형변환하려고 할 때 발생하는 예외
    - ArithmeticException : 산술 연산이 잘못되었을 때 발생하는 예외(예: 0으로 나누기)
    - NegativeArraySizeException : 음수 크기의 배열을 생성하려고 할 때 발생하는 예외
    - InputMismatchException : Scanner로 입력받은 값이 예상한 타입(자료형)과 다를 때 발생하는 예외
    - NumberFormatException : 문자열을 숫자로 변환하려고 할 때, 문자열이 숫자로 변환할 수 없는 경우 발생하는 예외
    - ...
    */

    // ArithmeticException 예외 발생
    public void method1() {
        // 0으로 나누기 예외 발생 가능
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int num1 = sc.nextInt();
        sc.nextLine();

        System.out.println("정수 입력 : ");
        int num2 = sc.nextInt();
        sc.nextLine();

        System.out.println("나눗셈 결과 : " + (num1 / num2));
        System.out.println("종료");     // 프로그램 정상 종료 확인용
       

        // try-catcgh문으로 예외 처리
        try (sc) {
            System.out.print("정수 입력 : ");
            int num3 = sc.nextInt();
            sc.nextLine();

            System.out.println("정수 입력 : ");
            int num4 = sc.nextInt();
            sc.nextLine();

            System.out.println("나눗셈 결과 : " + (num3 / num4));
        } catch (ArithmeticException e) {   // 예외 발생 시 실행할 코드(예외 흐름)
            // System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace();            // 예외 발생 시 예외의 종류와 발생 위치를 콘솔에 출력해주는 메소드
        }
        System.out.println("종료");     // 프로그램 정상 종료 확인용
       

        // if-esle문으로 예외 처리
        System.out.println("정수 입력 : ");
        int num5 = sc.nextInt();
        sc.nextLine();

        System.out.println("정수 입력 : ");
        int num6 = sc.nextInt();
        sc.nextLine();

        if (num6 != 0) {
            System.out.println("나눗셈 결과 : " + (num5 / num6));
            System.out.println("종료");     // 프로그램 정상 종료 확인용
        } else {
            System.out.println("0으로 나눌 수 없습니다.");
        }
    }

    // InputMismatchException 예외 발생
    public void method2(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 입력 : ");
        int num1 = sc.nextInt();   // InputMismatchException 예외 발생 가능
        sc.nextLine();

        System.out.println("정수 입력 : ");
        int num2 = sc.nextInt();   // InputMismatchException 예외 발생 가능
        sc.nextLine();

        System.out.println("나눗셈 결과 : " + (num1 / num2));
        System.out.println("종료");     // 프로그램 정상 종료 확인용


        // try-catch문으로 예외 처리
        try (sc) {
            System.out.print("정수 입력 : ");
            int num3 = sc.nextInt();
            sc.nextLine();

            System.out.println("정수 입력 : ");
            int num4 = sc.nextInt();
            sc.nextLine();

            System.out.println("나눗셈 결과 : " + (num3 / num4));
        } catch (ArithmeticException e) {       // 0으로 나누기 예외 발생 시 실행할 코드(예외 흐름)
            System.out.println("0으로 나눌 수 없습니다.");
            e.printStackTrace();                
        } catch (InputMismatchException e) {    // 입력이 정수가 아닌 경우 발생하는 예외
            System.out.println("잘못된 입력입니다. 정수를 입력해주세요.");
        }
        System.out.println("종료");     // 프로그램 정상 종료 확인용
    }

    // NegativeArraySizeException 예외 발생 + ArrayIndexOutOfBoundsException 예외 발생
    public void method3(){
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 크기 입력 : ");
        int size = sc.nextInt();
        sc.nextLine();

        int[] arr = new int[size];

        System.out.println(arr[100]);
        System.out.println("종료");     // 프로그램 정상 종료 확인용


        // try-catch문으로 예외 처리
        try (sc) {
            System.out.println("배열 크기 입력 : ");
            int size2 = sc.nextInt();
            sc.nextLine();

            int[] arr2 = new int[size2];

            System.out.println(arr2[100]);
        } catch (NegativeArraySizeException e) {   // 음수 크기의 배열 생성 시 발생하는 예외
            System.out.println("음수 크기의 배열을 생성할 수 없습니다.");
        } catch (ArrayIndexOutOfBoundsException e) {   // 배열의 범위를 벗어난 인덱스로 접근 시 발생하는 예외
            System.out.println("배열의 범위를 벗어난 인덱스에 접근할 수 없습니다.");
        }
        System.out.println("종료");     // 프로그램 정상 종료 확인용


        // if-esle문으로 예외 처리
        System.out.println("배열 크기 입력 : ");
        int size3 = sc.nextInt();
        sc.nextLine();

        if (size3 > 0) {
            int[] arr3 = new int[size3];

            if (arr3.length > 100) {
                System.out.println(arr3[100]);
                System.out.println("종료");     // 프로그램 정상 종료 확인용
            } else {
                System.out.println("배열의 범위를 벗어난 인덱스에 접근할 수 없습니다.");
            }
        } else {
            System.out.println("음수 크기의 배열을 생성할 수 없습니다.");
        }


        // 위와 같은 try-catch문은 조건별로 구분해 효과적인 예외 처리가 가능하지만,
        // 코드가 길어지고 중복되는 부분이 많아지며 개발자가 실수할 가능성이 높아지는 단점이 있음
        try (sc) {
            System.out.println("배열 크기 입력 : ");
            int size4 = sc.nextInt();
            sc.nextLine();

            int[] arr4 = new int[size4];

            System.out.println(arr4[100]);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        // 부모 타입인 RuntimeException으로 예외 처리해(다형성), 다양한 자식 타입의 예외를 처리가능
        // 대신 정확한 원인은 Log를 통해 확인해야 하는 단점이 있음
        // 기본적으론 조건문으로 해결하고, try-catch문은 예외가 발생할 가능성이 높은 부분에 작성하는 것이 좋음
        /* 
        꼭 파악이 필요한 세부적인 예외는 개별적으로 먼저 catch문을 작성하고 최종적으로
        부모 타입인 RuntimeException으로 예외를 처리하는 것이 좋음
        */
    }
    
    // 정리
    // RuntimeException 예외는 충분히 조건으로 해결가능(InputMismatchException 제외)
    // 조건으로 해결이 어렵거나, 예외가 발생할 가능성이 높거나, 비정상 종료를 방지하기 위한 대비/수습 목적
    // > 이런 Unchecked Exception은 조건문 권장
    // > Checked Exception은 try-catch문 권장(예측이 불가능하기에 조건문을 작성하기 어려움)


    // 연습문제
    public void method4() {
        Scanner sc = new Scanner(System.in);

        try (sc) {
            System.out.println("숫자로 변환할 문자열 정수 입력 : ");
            int num = Integer.parseInt(sc.nextLine());  // NumberFormatException 예외 발생 가능
            sc.nextLine();

            System.out.println("변환할 수 있습니다.");
            System.out.println("결과 : " + num);
        } catch (NumberFormatException e) {
            System.out.println("변환할 수 없습니다.");
        }
        System.out.println("종료");     // 프로그램 정상 종료 확인용
    }
}
