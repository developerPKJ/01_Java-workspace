package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

// 다형성 적용 후
public class ElectronicController2 {

	// 용산 전자 상가에 새로 차린 가게
	
	// 어떤 종류의 전자제품이든 간에 다 보관할 수 있는 창고를 "필드" 로써 구현
	// > 접근제한자 자료형 필드명;
	private Electronic[] elec = new Electronic[3]; // 3칸짜리 (제품 3개를 담을 수 있는) 창고가 만들어진 꼴
	
	// 우리 가게에서 일어나야할 업무 관련된 일들 (행위들) 을 "메소드" 로써 구현
	// 1. 제품을 납품받았을 때 해당 제품을 창고의 각 칸에 집어 넣는 기능
	public void insert(Electronic any, int index) {
		
		elec[index] = any;
	}
	
	// 2. 창고의 x번칸에 들은 제품을 꺼내서 내어주는 기능
	public Electronic select(int index) {
		
		return elec[index];
	}
	
	// > 마찬가지로 오버로딩 개념 적용
	// 3. 창고에 있는 모든 제품들을 한번에 다 꺼내서 내어주는 기능
	public Electronic[] select() {
		
		return elec;
	}
	
}





