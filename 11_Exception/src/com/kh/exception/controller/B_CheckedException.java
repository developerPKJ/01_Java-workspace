package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
    /*
     * Checked Exception
     * - 예외 처리 구문을 반드시 작성해야 하는 경우(예측 불가능함)
     * - 컴파일 시점에서 예외 처리 구문이 작성되어 있는지 검사하는 예외
     * - 예외 처리 구문이 작성되어 있지 않으면 컴파일 에러 발생
     * - 주로 외부 매체와의 입출력 과정에서 발생하는 예외
     *   (ex. 파일 입출력, 네트워크 입출력 등)
     */
    

    // 2. throws 키워드 이용
		/*
		 * * throws 키워드
		 * > 지금 여기서 당장 예외를 처리하지 않고 (예외 처리 구문을 쓰지 않고)
		 *   다른곳에서 대신 예외처리를 하도록 "떠넘기겠다" 라는 뜻 (위임하겠다)
		 * 
		 * > method2 에서 try ~ catch문을 이용해서 예외처리를 하지 않겠다.
		 * 	 나를 호출했던 곳에서 try ~ catch문을 이용해서 예외처리를 하도록 떠넘기겠다.
		 * > 떠넘긴 곳에서도 예외처리를 하지 않으면 마찬가지로 빨간 밑줄이 뜨면서 예외처리를 꼭 하고 넘어가도록 유도!!
		 * 
		 * * 예외 처리 시 왠만해서는 해당 구문에서 곧바로 try ~ catch문을 이용해서
		 *   그 자리에서 예외처리를 하고 넘어가자!! (권장사항) - 어느 부분이 문제인지 한눈에 파악이 되므로
		 * 
		 * * Unchecked 계열에서도 throws 사용 가능!!
		 * 
		 * * Checked 계열은 메소드 정의부에 throws 로 이미 떠넘기고 있다!!
		 * > 그래서 컴파일 에러로 계속 예외 처리를 하고 넘어가라고 유도했던 것!!
	*/
    public void method1() throws IOException {
        // method2에서 발생할 수 있는 예외를 method1에서 처리하지 않고, method1을 호출한 곳에서 처리하도록 떠넘김!!
        method2();
    }

    // try-catch문 이용
    // Checked Exception이 발생할 가능성이 있는 메소드
    public void method2() {
        // Scanner와 마찬가지로 키보드 입력(문자열만 가능) 받는 클래스
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("아무 문장 입력 : ");
            String str = br.readLine();     // Unhandled exception type IOException
            // try-catch 혹은 throws 사용하지 않으면 경고(컴파일 불가)
            System.out.println(str);
        } catch (IOException e) {
            System.out.println("IO error");
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Runtime error");
            e.printStackTrace();
        }
        System.out.println("exit");
    }
}
