package com.kh.operator;

public class C_Compound {
	//복합 대입 연산자 = 기존 값 + 새로운 값
	public void compound1() {
		int num1 = 100;
		int num2 = 100;
		int num3 = 100;
		int num4 = 100;
		int num5 = 100;
		String str = "abc";
		
		for (int i = 0; i < 3; i++) {
			num1 += 2;
			num2 -= 2;
			num3 *= 2;
			num4 /= 2;
			num5 %= 2;
			str += "abc";
		}
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(str);
	}
}
