package com.kh.operator;

public class G_Triple {

	public void whichMin(int a, int b) {
		int minInt = (a < b) ? a : b;
		char minChar = (a < b) ? 'a' : 'b';
		System.out.printf("최솟값은 %c = %d\n", minChar, minInt);
	}
	
	public void triple2(int a) {
		if (a > 0) {
			String result = (a % 2 == 0) ? "짝수" : "홀수";
			System.out.println(result);
		}else {
			System.out.println("0 이하의 수는 입력 불가");
		}
	}
	
	public void triple3(char ch) {
		String result = (65 <= ch && ch <= 90) ? "uppercase" : "lowercase";
//		String result = ('A' <= ch && ch <= 'Z') ? "uppercase" : "lowercase";
		System.out.println(result);
	}
	
	public void triple4(int a) {
		String result = (a > 0) ? ((a%2==0) ? "짝수" : "홀수") 
								: ((a==0) ? "0" : "음수");
		System.out.println(result);
	}
	
	public void triple5(char ch) {
		String result = (65<=ch && ch<=90) ? "uppercase" 
											: ((97<=ch && ch<=122) ? "lowercase" : "������ �ƴ�");
		System.out.println(result);
	}
}
