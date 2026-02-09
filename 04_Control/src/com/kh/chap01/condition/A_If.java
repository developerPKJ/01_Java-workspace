package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	Scanner scan = new Scanner(System.in);

	public void method1() {
		System.out.print("수 입력 : ");
		double n = scan.nextDouble();
		scan.nextLine();
		
		if (n > 0) {
			System.out.println("양수");
			if (n % 2 == 0) {
				System.out.println("짝수");
			}else if (n % 2 == 1) {
				System.out.println("홀수");
			}else {
				System.out.println("실수");
			}
		}else if (n < 0) {
			System.out.println("음수");
		}else {
			System.out.println("0");
		}
	}
	
	public void method2() {
		System.out.println("나이 입력 : ");
		int n = scan.nextInt();
		scan.nextLine();
		
		if (n <= 0) {
			System.out.println("잘못 된 나이 입력");
		}else if (n <= 13) {
			System.out.println("어린이");
		}else if (n <= 19) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
	}
	
	public void method3() {
		//주민 번호는 - 를 제외하더라도 0으로 시작하는 경우가 있기에 무조건 String으로 받아야함
		System.out.print("주민번호 입력 : ");
		String residentId = scan.nextLine().replaceAll("-", "");
		
		if (residentId.length() == 13) {
			String birthDay = residentId.substring(0, 6);
			String registrationNumber = residentId.substring(6);
			
			System.out.println(birthDay + '-' + registrationNumber);
			System.out.println("검증 프로그램 연결");
			
			if (registrationNumber.charAt(0) == '2'  || registrationNumber.charAt(0) == '4') {				System.out.println("female");
			}else if (registrationNumber.charAt(0) == '1' || registrationNumber.charAt(0) == '3') {
				System.out.println("male");
			}else {
				System.out.println("잘못 된 주민번호");
			}
			
		}else {
			System.out.println("잘못 된 입력");
		}
	
	}
	
}
