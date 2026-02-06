package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
	//이항 연산자
	public void cal(int a, int b, char ops) {
		switch (ops) {
		case '+':
			System.out.println(a+b);
			break;
		case '-':
			System.out.println(a-b);
			break;
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		case '%':
			System.out.println(a%b);
			break;
		default:
			System.out.println("Input error");
			break;
		}
	}
	
	public void divide() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("총 수량 : ");
		int totalCandy = scan.nextInt();
		scan.nextLine();
		
		System.out.println("총 인원 수 : ");
		int totalHuman = scan.nextInt();
		scan.nextLine();
		
		System.out.printf("1인당 받을 사탕의 수 : %d, 남은 사탕의 수 : %d", 
						totalCandy/totalHuman, totalCandy%totalHuman);
		
		
		scan.close();
	}
	
}
