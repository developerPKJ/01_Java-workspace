package com.kh.chap01_poly.part02_electronic.model.vo;

// 자식클래스
public class NoteBook extends Electronic {

	// 필드부
	private int usbPort;
	
	// 생성자부
	public NoteBook() { }

	public NoteBook(String brand, String name, int price, int usbPort) {
		super(brand, name, price);
		this.usbPort = usbPort;
	}

	// 메소드부
	public int getUsbPort() {
		return usbPort;
	}

	public void setUsbPort(int usbPort) {
		this.usbPort = usbPort;
	}

	@Override
	public String toString() {
		return "NoteBook [brand=" + super.getBrand() + ", name=" + super.getName()
				+ ", price=" + super.getPrice() + ", usbPort=" + usbPort + "]";
	}
	
}
