package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	Scanner scan = new Scanner(System.in);

	public void method1() {
		System.out.print("숫자를 입력하세요 : ");
		double n = scan.nextDouble();
		scan.nextLine();
		
		if (n > 0) {
			System.out.println("양수");
			if (n % 2 == 0) {
				System.out.println("짝수");
			}else if (n % 2 == 1) {
				System.out.println("홀수");
			}else {
				System.out.println("소수");
			}
		}else if (n < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
	}
	
	public void method2() {
		System.out.println("나이를 입력하세요 : ");
		int n = scan.nextInt();
		scan.nextLine();
		
		if (n <= 0) {
			System.out.println("잘못된 나이입니다");
		}else if (n <= 13) {
			System.out.println("어린이");
		}else if (n <= 19) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
	}
	
	public void method3() {
		System.out.print("주민등록번호 입력 : ");
		String residentId = scan.nextLine().replaceAll("-", "");
		
		if (residentId.length() == 13) {
			String birthDay = residentId.substring(0, 6);
			String registrationNumber = residentId.substring(6);
			
			System.out.println(birthDay + '-' + registrationNumber);
			System.out.println("성별 확인 : ");
			
			if (registrationNumber.charAt(0) == '2'  || registrationNumber.charAt(0) == '4') {				System.out.println("female");
			}else if (registrationNumber.charAt(0) == '1' || registrationNumber.charAt(0) == '3') {
				System.out.println("male");
			}else {
				System.out.println("잘못된 주민등록번호입니다");
			}
			
		}else {
			System.out.println("잘못된 주민등록번호입니다");
		}
	
	}
	
}
