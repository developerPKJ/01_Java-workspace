package com.kh.variable;

public class C_Cast {
	//형변환 type casting
	
	/*
	 * 값 처리 규칙
	 * 1. "=" 의 좌우는 서로 같은 자료형이여야함
	 * 2. 서로 같은 타입만 연산이 가능(서로 다르면 한쪽에 맞춰야함=형변환 필요)
	 * 
	 * 자동형변환 : 연산 중에 자동으로 진행(작은걸 크게)
	 * 강제형변환 : 자동형변환이 안되는 경우 수동으로(큰걸 작게)
	 */
	
	public void test() {
		int a = 1;
		double b = 2;
		
		a = (int)b;
		
		// 기본 자료형은 아래의 방법으로 진행 / 추가된 객체(String) 이런건 그냥 .getClass().getName()
		System.out.println("a type : "+((Object)a).getClass().getSimpleName());
		System.out.println("a : "+a);
		System.out.println();
	}
	
	// 자동 형변환 - 작은걸 크게
	public void autoCasting() {
		int intNum = 10;
		double doubleNum = intNum;	//double(8) > int(4)
		// => double doubleNum = (double)intNum 와 동일
		System.out.println("intNum : "+intNum);
		System.out.println("doubleNum : "+doubleNum);
		
		double doubleNum2 = 10;
		System.out.println("double 자료형과 int 자료형의 덧셈 시 출력 자료형 : "
						+((Object)(doubleNum2+intNum)).getClass().getSimpleName());
		System.out.println("double + int : "+(doubleNum2+intNum));
		
		//특이케이스 long -> float
		long longNum = 1000000;
		float floatNum = longNum;
		System.out.println("longNum : "+longNum);
		System.out.println("floatNum : "+floatNum);
		System.out.println("floatNum type : "+((Object)floatNum).getClass().getSimpleName());
		//이게 가능한 이유는 실수 자료형은 정수 자료형보다 더 작은 사이즈로 넓은 범위의 값을 표현 가능함 그래서 필요 없음
		
		
		//특이케이스2 char <-> int : 뭐 이건 프로그래밍 언어에서 글자는 유니코드로 인식하니까(그래서 음수는 안들어감)
		char ch1 = 'A';		//A=65, a=97
		int intNum2 = ch1;
		System.out.println(intNum2);
		char ch2 = 83;
		char ch3 = 79;
		System.out.printf("%c%c%c", ch2,ch3,ch2);
		
		//특이케이스3 byte, short의 연산 : 오버플로우 방지 목적으로 연산 결과는 무조건 int형으로 출력함
		byte b1 = 1;
		byte b2 = 10;
		//byte result = b1+b2;
		int result = b1+b2;
		
		short s1 = 10;
		short s2 = 100;
		//short result2 = s1+s2;
		int result2 = s1+s2;
		
		//굳이 출력을 byte나 short로 바꾸고자 한다면 괄호로 계산하고 나서 강제형변환을 붙여주면 됨
	}
	
	//강제 형변환 - 큰걸 작게
	public void forceCasting() {
		double d2 = 8.8;
//		float f2 = d2;
		float f2 = (float)d2;
		System.out.println(d2);
		System.out.println(f2);
		System.out.println();
		
//		int i3 = d2;
		int i3 = (int)d2;			//소수점은 내림 = 데이터 소실
		System.out.println(d2);
		System.out.println(i3);
		System.out.println();
		
		int i4 = 10;
		double d3 = 5.89;
		int sum1 = (int)(i4+d3);
		int sum2 = (int)(i4*d3);
		System.out.println(sum1);
		System.out.println(sum2);
		int sum3 = i4+(int)d3;
		int sum4 = i4*(int)d3;
		System.out.println(sum3);
		System.out.println(sum4);
		//애초에 값을 날리는 경우가 없긴함 -->
		double sum5 = i4+d3;
		double sum6 = i4*d3;
		System.out.println(sum5);
		System.out.println(sum6);
		
	}
}
