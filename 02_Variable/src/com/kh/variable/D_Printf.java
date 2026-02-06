package com.kh.variable;

import java.util.Scanner;

public class D_Printf {
	public void printfTest() {
		//대충 02.var.bk에서 가져옴
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 / 성별(M/F) / 나이 / 키 순으로 한번에 하나 씩 입력 : ");
		String name = scan.nextLine();
		char gender = scan.nextLine().charAt(0);
		int age = scan.nextInt();
		scan.nextLine();
		double height = scan.nextDouble();
		scan.nextLine();
		
		System.out.printf("name : %6s", name);			
		System.out.println();
		System.out.printf("gender : %2C", gender);		
		System.out.println();
		System.out.printf("age : %6d", age);					
		System.out.println();
		System.out.printf("height : %6.1f", height);			
		System.out.println();
		// %f는 float라 소수점 아래 7자리를 반올림해서 6번째 자리까지만 출력함
		// 몇몇 옵션에 대해서는 Run 파일에 있음
		// 출력 후 줄바꿈이 발생하지 않기 때문에 개행(이스케이프 문자/syso)를 추가 필요
		
		scan.close();
	}
}
