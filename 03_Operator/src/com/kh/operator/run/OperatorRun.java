package com.kh.operator.run;

import java.util.Scanner;

import com.kh.operator.*;

//import com.kh.operator.A_Arithmetic;
//import com.kh.operator.B_inDecrease;
//import com.kh.operator.C_Compound;
//import com.kh.operator.D_LogicalNegation;
//import com.kh.operator.E_Comparison;
//import com.kh.operator.F_Logical;
//import com.kh.operator.G_Triple;

public class OperatorRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		A_Arithmetic aa = new A_Arithmetic();
		aa.cal(14, 8, '+');
		aa.cal(14, 8, '-');
		aa.cal(14, 8, '*');
		aa.cal(14, 8, '/');
		aa.cal(14, 8, '%');
		// 산술 연산은 가능한 괄호로 묶는 습관!
		// System.out.println(10 / 0);
		// 위처럼 0으로 나누는건 컴퓨터에선 불가
		
		//산술연산은 같은 타입끼리 연산 가능하고, 결과 또한 같은 타입으로 나옴
		
		aa.divide();
		*/
		
//		B_inDecrease bi = new B_inDecrease();
		
//		bi.inDecrease();
//		bi.inDecrease2();
//		bi.inDecrease3();		//21, 60 & 21, 63
//		bi.inDecrease4();
		
//		C_Compound cc = new C_Compound();
//		
//		cc.compound1();
	
		
//		D_LogicalNegation dl = new D_LogicalNegation();
//		
//		boolean test1 = true;
//		
//		System.out.println(dl.negation(test1));
		
		
//		E_Comparison ec = new E_Comparison();
//		ec.comparison();
//		//비교 연산자보다 산술 연산자의 우선 순위가 높기 때문에 사용할 때 주의 필요
//		System.out.println("\n정수 입력 : ");
//		
//		
		Scanner scan = new Scanner(System.in);
//		try {
//			int num = scan.nextInt();
//			scan.nextLine();
//			ec.classify(num);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("잘못된 입력");
//		}
//		
//		
//		F_Logical fl = new F_Logical();
//		fl.logicalFunction();
//		
//		
//		System.out.println("정수 하나 입력 : ");
//		int num = scan.nextInt();
//		scan.nextLine();
//		boolean isTrue = fl.logicalFunction2(num);
//		
//		System.out.println("양수이면서 짝수 "+isTrue);
//		
//		
//		char ch = scan.nextLine().charAt(0);
//		fl.logicalFunction3(ch);
		
		G_Triple gt = new G_Triple();
//		System.out.println("정수 2개 입력");
//		int a = scan.nextInt();
//		scan.nextLine();
//		int b = scan.nextInt();
//		scan.nextLine();
//		
//		gt.whichMin(a, b);
//		
//		
//		System.out.println("아무 정수 입력");
//		int c = scan.nextInt();
//		scan.nextLine();
//		gt.triple2(c);
		
		
//		System.out.println("글자 입력");
//		char ch = scan.nextLine().charAt(0);
//		gt.triple3(ch);
		
//		System.out.println("정수 입력");
//		try {
//			int a = scan.nextInt();
//			scan.nextLine();
//			gt.triple4(a);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("잘못된 값 입력");
//		}
		
		System.out.println("글자 입력");
		char ch = scan.nextLine().charAt(0);
		gt.triple5(ch);

		
		scan.close();
	}

}
