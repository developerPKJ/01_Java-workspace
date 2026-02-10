package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	Scanner scan = new Scanner(System.in);
	
	//여러가지 type별 입력
	public void scaning() {
		System.out.println( scan.nextLine());
	}
	
	public void name() {
		System.out.println(scan.nextLine().replaceAll("\\s+", ""));
	}
	
	public void age() {
		System.out.println(scan.nextInt());
		clearBuffer();
	}
	
	public void height() {
		System.out.println(scan.nextDouble());
		clearBuffer();
	}
	
	//키보드로 값을 입력 받을 때 자주 발생되는 문제
	public void profile() {
		//사용자의 인적사항(이름,나이,주소,키)을 입력 받아 출력하는 프로그램
		//이름
		String name = scan.nextLine();
		
		//나이
		int age = 0;
		try {
			age = scan.nextInt();
		} catch (Exception e) {
		}
		clearBuffer();
		
		//주소
		String address = scan.nextLine();
		
		//키
		double height = 0;
		try {
			height = scan.nextDouble();
		} catch (Exception e) {
		}
		 clearBuffer();
		
		 
		System.out.println("이름 :"+name);
		System.out.println("나이 :"+age);
		System.out.println("주소 :"+address);
		System.out.println("키 :"+height);
		
		System.out.printf("name : %s", name);
		System.out.println();
		System.out.printf("age : %d", age);
		System.out.println();
		System.out.printf("address : %s", address);
		System.out.println();
		System.out.printf("height : %.1f", height);
		System.out.println();
	}
	
	
	public void type3() {
		// string, int, double을 제외한 다른 타입의 입력
		
		/*
		scan.nextBoolean();
		clearBuffer();
		scan.nextFloat();
		clearBuffer();
		scan.nextByte();
		clearBuffer();
		scan.nextShort();
		clearBuffer();
		scan.nextLong();
		clearBuffer();
		*/

		//nextChar()는 존재하지 않음, index활용 필요
		System.out.println(scan.nextLine().charAt(0));
		
		//그냥 재미삼아 해쉬코드 해보기
		String text = "asdf";
		int result = text.hashCode();
		System.out.println(result);
	}
	
	public void indexTest() {
		System.out.println("아무 3글자 이상 입력 :");
		String text = scan.nextLine();
		
		if (text.length() > 2) {
			char a = text.charAt(0);
			char b = text.charAt(1);
			char c = text.charAt(2);
			
			System.out.println("첫번째 글자 : "+a);
			System.out.println("두번째 글자 : "+b);
			System.out.println("세번째 글자 : "+c);
		}else {
			System.out.println("문자열 길이 부족");
		}
	}
	
	
	//nextline을 제외한 다른 next들은 모두 입력만 받고 버퍼를 안비움 --> 수동으로 버퍼를 비워줘야 함
	public void clearBuffer() {
		scan.nextLine();
	}
	
	public void close() {
		scan.close();
	}
}
