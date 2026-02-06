package com.kh.variable.run;

//import com.kh.variable.A_Variable;
//import com.kh.variable.B_KeyboardInput;
import com.kh.variable.C_Cast;

public class Run {

	public static void main(String[] args) {
		/*
		A_Variable av = new A_Variable();
		av.printSquare();
		
		
		System.out.printf("%07.3f", 12.3405);		//a.bf 에서 b는 소수점 자리수, a는 '최소' 폭(개수)임, 0운 0채우기
		System.out.println();
		System.out.printf("%+7.3f", 12.3405);		//+는 부호표시, -는 왼쪽정렬로 변경
		
		System.out.println();
		av.declareVariable();
		
		System.out.println();
		av.constant();
		
		System.out.println();
		av.overflow();
		*/
		
		
		
		/*
		//객체 생성
		B_KeyboardInput bk = new B_KeyboardInput();
		
		//아무 문장 입력 후 출력
		System.out.println("아무 문장 입력:");
		bk.scaning();
		
		//문자열(이름) 입력 후 출력, 공백 있으면 삭제
		System.out.println("name :");
		bk.name();
		
		//정수 입력 후 출력
		System.out.println("age :");
		try {
			bk.age();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("정수 입력 필요");
			bk.clearBuffer();
		}
		
		//실수 입력 후 출력
		System.out.println("키 :");
		try {
			bk.height();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("실수 입력 필요");
			bk.clearBuffer();
		}
				
		
		//프로필 입력
		System.out.println("프로필 입력(이름, 나이, 주소, 키)");
		bk.profile();
		
		bk.type3();
		
		
		//사용자로부터 3 글자 이상의 문자열을 입력 받고, 글자 인덱스 0~2 글자를 뽑아 출력
		bk.indexTest();
		
		
		bk.close();
		// scanner의 경우 보통 위처럼 그냥 바로바로 출력하지 않고, profile처럼 변수에 저장해서 재활용하는 방식을 사용함
		*/
		
		
		C_Cast cc = new C_Cast();
		
//		cc.test();
//		cc.autoCasting();
		cc.forceCasting();
	}
}
