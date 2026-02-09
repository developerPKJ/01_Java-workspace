package com.kh.operator;

public class G_Triple {

	public void whichMin(int a, int b) {
		int minInt = (a < b) ? a : b;
		char minChar = (a < b) ? 'a' : 'b';
		System.out.printf("ÃÖ¼Ò°ª : %c = %d\n", minChar, minInt);
	}
	
	public void triple2(int a) {
		if (a > 0) {
			String result = (a % 2 == 0) ? "Â¦¼ö" : "È¦¼ö";
			System.out.println(result);
		}else {
			System.out.println("0 ÀÌÇÏÀÇ ¼ö ÀÔ·Â µÊ");
		}
	}
	
	public void triple3(char ch) {
		String result = (65 <= ch && ch <= 90) ? "uppercase" : "lowercase";
//		String result = ('A' <= ch && ch <= 'Z') ? "uppercase" : "lowercase";
		System.out.println(result);
	}
	
	public void triple4(int a) {
		String result = (a > 0) ? ((a%2==0) ? "Â¦¼ö" : "È¦¼ö") 
								: ((a==0) ? "0" : "À½¼ö");
		System.out.println(result);
	}
	
	public void triple5(char ch) {
		String result = (65<=ch && ch<=90) ? "uppercase" 
											: ((97<=ch && ch<=122) ? "lowercase" : "¿µ¹®ÀÚ ¾Æ´Ô");
		System.out.println(result);
	}
}
