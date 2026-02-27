package com.kh.chap01_poly.part02_electronic.model.vo;

// 자식클래스
public class Desktop extends Electronic {

	// 필드부
	public static final String CPU = "intel";
	private String graphic;
	
	// 생성자부
	public Desktop() { }

	public Desktop(String brand, String name, int price, String graphic) {
		super(brand, name, price);
		this.graphic = graphic;
	}

	// 메소드부
	public String getGraphic() {
		return graphic;
	}

	public void setGraphic(String graphic) {
		this.graphic = graphic;
	}

	@Override
	public String toString() {
		return "Desktop [brand=" + super.getBrand() + ", name=" + super.getName()
				+ ", price=" + super.getPrice() + ", CPU=" + CPU + ", graphic=" + graphic + "]";
	}
}
