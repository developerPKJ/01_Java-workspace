package com.kh.chap01_poly.part01_basic.model.vo;

// 자식클래스
public class Child2 extends Parent {

	// 필드부
	private int n;
	
	// 생성자부
	public Child2() { }

	public Child2(int x, int y, int n) {
		super(x, y);
		this.n = n;
	}

	// 메소드부
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public void printChild2() {
		
		System.out.println("나는 두번째 자식이야");
	}
	
	// 마찬가지로 오버라이딩
	@Override
	public void print() {
		
		System.out.println("나는 두번째 자식이야");
	}
	
}
