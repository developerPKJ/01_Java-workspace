package com.kh.exception.run;

import java.io.IOException;

// import com.kh.exception.controller.A_UncheckedException;
import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {
    public static void main(String[] args) {
        /*
        에러의 종류
        - 시스템 에러 : 컴퓨터의 오작동으로 발생하는 에러
            > 소스코드로 해결 불가
            > 개발자 선에서 해결 불가 --> 심각한 에러
        - 컴파일 에러 : 소스코드 상의 문법적 문제로 발생하는 에러
            > IDE에서 표시해줌
            > 소스코드로 해결 가능
        - 런타임 에러 : 소스코드 상의 논리적 문제로 발생하는 에러
            > 실행 시점에서 발생하는 에러
            > 사용자의 잘못일 수도 있고, 개발자의 잘못일 수도 있음
            > 소스코드로 해결 가능
        - 논리 에러 : 프로그램 의도 상 반대로 작동하는 것(오작동)

        > 시스템 에러를 제외한 3가지 에러와 같은 비교적 가벼운 에러들을 예외(Exception)라고 부름
        > 이런 예외를 대비해 처리 방법을 소스코드상 정의해 두는 것을 예외 처리(Exception Handling)라고 함

        예외 처리 방법
        - try-catch문
        - throws 키워드

        예외의 종류
        - Unchecked Exception : 예외 처리 구문을 굳이 작성할 필요가 없는 경우(예측 가능함)
        - Checked Exception : 예외 처리 구문을 반드시 작성해야 하는 경우(예측 불가능함)
        */
        // A_UncheckedException a = new A_UncheckedException();
        // a.method1();    
        // a.method2();       
        // a.method3();     
        // a.method4();   
             
        B_CheckedException b = new B_CheckedException();
        try {
            b.method1();
        } catch (IOException e) {
            e.printStackTrace();
        }
        b.method2();
    }
}
