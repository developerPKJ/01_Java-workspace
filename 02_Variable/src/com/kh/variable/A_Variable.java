package com.kh.variable;

public class A_Variable {
	
	public void printSquare() {
		int row = 6;
		int col = 7;
		
		System.out.println("넓이 :"+ row*col);
		System.out.println("둘레 :"+ (row+col)*2);
	}
	
	public void declareVariable() {
		// 변수 선언 : 변수를 메모리 공간에 할당
		// 정수형은 int, 실수형은 double을 사용하셈(특별히 조건이 있는게 아니라면)
		
		boolean isTure = false;
		
		byte bNum = 1;
		short sNum = 2;
		int iNum = 3;
		long lNum = 4L;		// long 타입을 알려주기 위해 l혹은 L을 붙여줌
							// 최적화 과정에서 L을 표기해주면 불필요한 동작을 줄여줌(안에 숫자가 int로 표현될 정도로 작으면 괜히 늘림
		float fNum = 5.0f;
		double dNum = 6.0;
		
		char ch = 'A';
		String st = "abc";	// String의 경우 st자체의 크기는 4바이트에 불과, st안에는 abc가 아닌 abc가 저장된 주소가 있음
		
		System.out.println(isTure);
		System.out.println(bNum);
		System.out.println(sNum);
		System.out.println(iNum);
		System.out.println(lNum);
		System.out.println(fNum);
		System.out.println(dNum);
		System.out.println(ch);
		System.out.println(st);
	}

	//상수(고정된 값)
	public void constant() {
		final int num = 1;
		//num = 2;					//final로 선언해서 수정 시도 시 빨간 줄 그어짐
		System.out.println(num);
	}
	
	public void overflow() {
		byte num = 127;
		System.out.println(++num);	//overflow 발생
		num += 128;
		System.out.println(num);
	}
	
	/*
	 * 변수명 규칙
	 * - 예약어 들은 변수명으로 쓸 수 없음
	 * - 메소드, 클래스, 패키지 명도 사용 할 수 없음
	 */
}
