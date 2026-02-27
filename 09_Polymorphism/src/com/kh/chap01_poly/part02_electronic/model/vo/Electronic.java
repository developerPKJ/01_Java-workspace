package com.kh.chap01_poly.part02_electronic.model.vo;

// 부모클래스
public class Electronic {

	// 필드부
	private String brand;
	private String name;
	private int price;
	
	// 생성자부
	public Electronic() { }

	public Electronic(String brand, String name, int price) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	// 메소드부
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Electronic [brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
	
}
