package com.kh.chap01_poly.part02_electronic.model.vo;

// 자식클래스
public class Tablet extends Electronic {

	// 필드부
	private boolean penFlag;
	
	// 생성자부
	public Tablet() { }

	public Tablet(String brand, String name, int price, boolean penFlag) {
		super(brand, name, price);
		this.penFlag = penFlag;
	}

	// 메소드부
	public boolean isPenFlag() {
		return penFlag;
	}

	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}

	@Override
	public String toString() {
		return "Tablet [brand=" + super.getBrand() + ", name=" + super.getName()
				+ ", price=" + super.getPrice() + ", penFlag=" + penFlag + "]";
	}
}
