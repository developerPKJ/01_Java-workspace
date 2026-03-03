package com.kh.chap01_math.run;

/*
API (Application Programming Interface)
> 개발에 자주 사용되는 클래스 및 인터페이스 묶음의 사용법을 나타냄

라이브러리
> 자주 사용되는 기능들을 모아놓은 클래스들의 집합

--> 정확히는 라이브러리의 사용법을 나타낸게 API, 서로 혼용해서 사용하기도 함


자바 기본 API
> 자바 언어에서 제공되는 유용한 코드들에 대한 사용법
https://docs.oracle.com/en/java/javase/21/docs/api/index.html
*/

public class MathRun {
    public static void main(String[] args) {
        /* Math 클래스
        - 수학과 관련된 다양한 기능을 제공하는 클래스
        - 모든 메서드가 static으로 선언되어 있어 객체 생성 없이 사용 가능(싱글톤)
        - java.lang 패키지에 정의
        */

        // field
        // PIE
        System.out.println("PI : " + Math.PI);
        
        // method
        // Math m = new Math(); // 객체 생성 불가 --> private 생성자이기 때문
        // 모든 필드와 메소드가 static이기 때문에 굳이 객체 생성할 필요가 없음
        
        // Math.ceil(double) : double
        double num1 = 3.14;
        System.out.println("올림 : " + Math.ceil(num1)); // 올림
        
        // Math.round(double) : long
        System.out.println("반올림 : " + Math.round(num1)); // 반올림

        // Math.floor(double) : double
        System.out.println("내림 : " + Math.floor(num1)); // 내림
        System.out.println("내림 : " + (int)num1); // 내림 (형변환)

        // Math.abs(double/float/int/long) : 절댓값
        int num2 = -10;
        System.out.println("절댓값 : " + Math.abs(num2)); // 절댓값

        //Math.min(double/float/int/long, double/float/int/long) : 둘 중 작은 값
        int num3 = 20;
        System.out.println("둘 중 작은 값 : " + Math.min(num2, num3)); // 둘 중 작은 값

        // Math.max(double/float/int/long, double/float/int/long) : 둘 중 큰 값
        System.out.println("둘 중 큰 값 : " + Math.max(num2, num3)); // 둘 중 큰 값
        
        // Math.sqrt(double) : 제곱근
        int num4 = 5;
        System.out.println("제곱근 : " + Math.sqrt(num4)); // 제곱근
        
        // Math.pow(double, double) : 제곱
        System.out.println("제곱 : " + Math.pow(num4, 2));

        // Math.random() : 0.0 이상 1.0 미만의 난수(double) 발생
        System.out.println("난수 : " + Math.random());
    }
}
