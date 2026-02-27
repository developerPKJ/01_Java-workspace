package com.kh.chap01_poly.part01_basic.model.vo;

// 자식클래스
public class Child1 extends Parent {

	// 필드부
	private int z;
	
	// 생성자부
	public Child1() { }

	public Child1(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	// 메소드부
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	
	public void printChild1() {
		
		System.out.println("나는 첫번째 자식이야");
	}
	
	// print 메소드를 오버라이딩
	@Override
	public void print() {
		
		System.out.println("나는 첫번째 자식이야");
	}
	
}
