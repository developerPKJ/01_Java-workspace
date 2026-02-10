package com.kh.operator;

public class B_inDecrease {
	
	//전위/후위 증감 연산자
	public void inDecrease() {
		int num = 10;
		
		System.out.println("num " + num);
		System.out.println("num++ " + num++);
		System.out.println("num " + num);
		System.out.println("++num " + ++num);
		System.out.println("num " + num);
		System.out.println();
		System.out.println("num " + num);
		System.out.println("num-- " + num--);
		System.out.println("num " + num);
		System.out.println("--num " + --num);
		System.out.println("num " + num);
	}
	
	public void inDecrease2() {
		int a = 1;
		int b = ++a;
		
		System.out.println(a + ", " + b);

		a = 1;
		b = a++;
		
		System.out.println(a + ", " + b);
	}
	
	public void inDecrease3() {
		int num = 20;
		int result = num++ * 3;
		
		System.out.println(num + ", " + result);
		
		int num2 = 20;
		int result2 = ++num2 * 3;
		
		System.out.println(num2 + ", " + result2);
	}
	
	public void inDecrease4() {
		int a = 5;					//5
		System.out.println(a);
		int b = 10;					//5 10
		System.out.println(b);
		int c = (++a) + b;			//6 10 16
		System.out.println(c);
		int d = c / a;				//6 10 16 2
		System.out.println(d);
		int e = c % a;				//6 10 16 2 4
		System.out.println(e);
		int f = e++;				//6 10 16 2 5 4
		System.out.println(f);
		int g = (--b) + (d--);		//6  9 16 1 5 4 11
		System.out.println(g);
		int h = 2;					//6  9 16 1 5 4 11 2
									//a  b  c d e f  g h
		System.out.println(h);
		int i = a++ + b / (--c / f) * (g-- - d) % (++e + h);	//7 9 15 1 6 4 10 2 12
		System.out.println();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
		for (int j = 0; j < 9; j++) {
			
		}
	}
	
}
