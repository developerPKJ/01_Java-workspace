package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
    // switch문 - 조건식 기술 없이 변수-결과값에 따른 분기 처리
    // default문(else) 필수는 아님 + break문 필수 아님

    public Scanner sc = new Scanner(System.in);

    /**
     * 1~3 사이의 정수값을 입력받아
     * 1인 경우 빨간불
     * 2인 경우 노란불
     * 3인 경우 초록불
     * 그 외의 숫자를 입력한 경우 "잘못 입력하셨습니다." 출력하는 메서드
     */
    public void method1() {
        System.out.println("1~3 사이의 정수값을 입력하세요 : ");
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
        System.out.println("1~3 사이의 정수값을 입력하세요 : ");
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
        System.out.println("1~3 사이의 정수값을 입력하세요 : ");
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
        System.out.println("1~3 사이의 정수값을 입력하세요 : ");
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
        System.out.println("구매할 과일명을 입력하세요(사과/바나나/복숭아) : ");
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
    // eclipse에서는 정상적으로 작동하지만 vscode의 특성상 terminal이 eclipse와
    // 다르게 작동하여 method5() 실행 시 입력이 제대로 안되는 현상이 발생함.
    // eclipse의 경우 터미널이 jdk 자체가 관리하여 입/출력 인코딩을 조정하지만
    // vscode의 경우 vscode는 편집기의 기능만 하고 터미널은 공용터미널? 을 사용해서
    // 따로 인코딩을 IDE가 조정해주지 않아서 발생한 문제로 보임
    // --> 해결 방법 : .vscode/settings.json을 이용 기본 터미널을 파워쉘로 가정
    // 및 설정하여 파워쉘의 경우 입/출력 인코딩을 utf-8로 강제함, 추가로 jdk 또한
    // utf-8로 인코딩 설정 강제하여 해결(자세한건 settings.json 파일 참고)

    // 참고 기본 chcp 값 : 949(EUC-KR 확장형) --> 65001(utf-8)로 변경
    // 이 변경 만으로는 터미널의 입력 인코딩 타입만 설정했을 뿐 출력 자체의 인코딩 방식은
    // 변경되지 않아서 command를 통해서 출력의 인코딩 타입 강제함
    // (정확하게 명칭이 맞는지는 모르겠음) 암튼 파워쉘 터미널이 생기면 자동으로
    // chcp 65001과 (console)outputEncoding = [System.Text.Encoding]::UTF8 실행



    /**
     * 사용자로부터 키보드로 등급을 입력받아
     * 해당 등급 별로 권한 출력
     * 1등급 : 관리, 쓰기, 읽기
     * 2등급 : 쓰기, 읽기
     * 3등급 : 읽기
     */
    public void method6() {
        System.out.println("등급을 입력하세요(1~3) : ");
        int grade = sc.nextInt();
        sc.nextLine(); // 입력 버퍼 개행문자 제거용

        String authority = "";

        switch(grade) {
            case 1:
                authority = "관리, 쓰기, 읽기";
                break;
            case 2:
                authority = "쓰기, 읽기";
                break;
            case 3:
                authority = "읽기";
                break;
            default:
                System.out.println("잘못된 등급입니다.");
                return;
        }
        System.out.printf("%d등급의 권한은 %s입니다.%n", grade, authority);
    }

    /**
     * 스위치문 이용해서 사용자가 입력한 메뉴에 따라 결과물을 result(String)에 저장해 출력하는 메소드
     * 1. 입력
     * 2. 수정
     * 3. 조회
     * 4. 삭제
     * 9. 프로그램 종료 print문 출력
     * default. 잘못 입력한 경우 예외처리
     */
    public void method7() {
        System.out.println("메뉴를 선택하세요 : ");
        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("9. 프로그램 종료");
        System.out.print("메뉴 선택 >> ");
        int menu = sc.nextInt();
        sc.nextLine(); // 입력 버퍼 개행문자 제거용

        String result = "";

        switch(menu) {
            case 1:
                result = "입력 메뉴입니다.";
                break;
            case 2:
                result = "수정 메뉴입니다.";
                break;
            case 3:
                result = "조회 메뉴입니다.";
                break;
            case 4:
                result = "삭제 메뉴입니다.";
                break;
            case 9:
                result = "프로그램이 종료됩니다.";
                break;
            default:
                result = "잘못된 메뉴 선택입니다.";
        }
        System.out.println(result);
    }
    
}
