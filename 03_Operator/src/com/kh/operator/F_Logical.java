package com.kh.operator;

public class F_Logical {
	
	public void logicalFunction() {
		//and & or 연산자
		//=&& & ||
		int a = 1, b = 4;
		
		if (a%2==0 && b%2==0) {
			System.out.println("둘다 짝");
		}else if (a%2==0 || b%2==0) {
			if (a%2==0) {
				System.out.println("a만 짝");
			}else {
				System.out.println("b만 짝");
			}
		}else {
			System.out.println("둘다 홀");
		}
	}
	
	public boolean logicalFunction2(int num) {
		boolean result = (num > 0) && (num % 2 == 0);	//괄호 없어도 되지만 가독성 위해서 추가
		return result;
	}
	
	public void logicalFunction3(char ch) {
		boolean c = (ch == 'y' || ch == 'Y');
		System.out.println(c);
	}
	
}
