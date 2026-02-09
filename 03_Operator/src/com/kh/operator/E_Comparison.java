package com.kh.operator;

public class E_Comparison {
	public void comparison() {
		boolean a = 3>5;
		
		System.out.println(a);
		
		for (int i = 0; i < 3; i++) {
			if (i<2) {
				System.out.println(i);
			}
			else {
				System.out.println("over");
			}
		}
	}
	
	public void classify(int num) {
		if (num > 0) {
			if (num % 2 == 0) {
				System.out.println("Â¦¼ö");
			}else {
				System.out.println("È¦¼ö");
			}
		}else {
			System.out.println("À½¼ö");
		}
	}
}
