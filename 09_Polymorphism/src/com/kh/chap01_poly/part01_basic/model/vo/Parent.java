package com.kh.chap01_poly.part01_basic.model.vo;

// 부모클래스
public class Parent {

	// 필드부 
	private int x;
	private int y;
	
	// 생성자부
	public Parent() { }

	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// 메소드부
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void printParent() {
		
		System.out.println("나는 부모야");
	}
	
	// 매번 반복문 안에서 if문으로 instanceof 연산자를 통해 검사하기 귀찮음!!
	// > 메소드 오버라이딩을 적극 활용하면 코드를 간결하게 줄일 수 있게 된다.
	public void print() {
		
		System.out.println("나는 부모야");
	}
	
}







