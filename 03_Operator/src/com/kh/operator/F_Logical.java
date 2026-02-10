package com.kh.operator;

public class F_Logical {
	
	public void logicalFunction() {
		//and & or
		//=&& & ||
		int a = 1, b = 4;
		
		if (a%2==0 && b%2==0) {
			System.out.println("두 수 모두 짝수");
		}else if (a%2==0 || b%2==0) {
			if (a%2==0) {
				System.out.println("a는 짝수");
			}else {
				System.out.println("b는 짝수");
			}
		}else {
			System.out.println("두 수 모두 홀수");
		}
	}
	
	public boolean logicalFunction2(int num) {
		boolean result = (num > 0) && (num % 2 == 0);	//num이 양수이면서 짝수인지
		return result;
	}
	
	public void logicalFunction3(char ch) {
		boolean c = (ch == 'y' || ch == 'Y');
		System.out.println(c);
	}
	
}
