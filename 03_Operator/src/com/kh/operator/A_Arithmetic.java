package com.kh.operator;

import java.util.Scanner;

public class A_Arithmetic {
	
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
		
		System.out.println("사탕 개수 : ");
		int totalCandy = scan.nextInt();
		scan.nextLine();
		
		System.out.println("사람 수 : ");
		int totalHuman = scan.nextInt();
		scan.nextLine();
		
		System.out.printf("사탕을 나누었을 때, 각 사람이 받는 사탕 개수 : %d, 남은 사탕 개수 : %d", 
						totalCandy/totalHuman, totalCandy%totalHuman);
		
		
		scan.close();
	}
	
}
