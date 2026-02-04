package com.kh.second;

public class MethodTest {

	static void a() {
		System.out.println("A"); 
		System.out.println("a"); 
	}
	public static void b() {
		System.out.println("B");
		a();
	}
	public static void c() {
		System.out.println("C");
		b();
	}
}
