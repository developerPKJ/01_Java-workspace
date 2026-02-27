package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

// 다형성을 적용시키기 전
public class ElectronicController1 {

	// 용산 전자 상가에 새로 차린 가게
	
	// 각 전자제품을 담을 상자를 "필드" 로써 구현
	// > 접근제한자 자료형 필드명;
	private Desktop desk; // 데스크탑 제품을 담을 상자
	private NoteBook note; // 노트북 제품을 담을 상자
	private Tablet tab; // 태블릿 제품을 담을 상자
	
	// 우리 가게에서 일어나야할 업무 관련된 일들 (행위들) 을 "메소드" 로써 구현
	// 1. 제품을 납품받았을 때 해당 제품을 알맞은 상자에 넣어주는 기능
	
	// 데스크탑 제품을 받아와서 데스크탑 상자에 넣기
	public void insert(Desktop d) {
		
		desk = d;
	}
	
	// > 오버로딩을 적용한 메소드들
	// 노트북 제품을 받아와서 노트북 상자에 넣기
	public void insert(NoteBook n) {
		
		note = n;
	}
	
	// 태블릿 제품을 받아와서 태블릿 상자에 넣기
	public void insert(Tablet t) {
		
		tab = t;
	}
	
	// 2. 해당 제품을 상자로부터 꺼내서 내어주는 기능
	
	// 데스크탑 상자로부터 데스크탑 제품을 꺼내서 내어주는 기능
	public Desktop selectDesktop() {
		
		return desk;
	}
	
	// > 매개변수가 완전히 같아서 오버로딩이 불가함!!
	//   (그래서 일부러 메소드명을 일일이 다르게 잡아 준 것)
	
	// 노트북 상자로부터 노트북 제품을 꺼내서 내어주는 기능
	public NoteBook selectNoteBook() {
		
		return note;
	}
	
	// 태블릿 상자로부터 태블릿 제품을 꺼내서 내어주는 기능
	public Tablet selectTablet() {
		
		return tab;
	}
}





