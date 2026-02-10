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
		// ������� ��ȣ�� ���� ����!
		// System.out.println(10 / 0);
		// ��� �����°� ��ǻ�Ϳ��� �Ұ�
		
		//��������� ���� Ÿ�Գ��� ���� �����ϰ�, ��� ���� ���� Ÿ������ ����
		
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
//		//�� �����ں��� ��� �������� �켱 ������ ���� ������ ����� �� ���� �ʿ�
//		System.out.println("\n���� �Է� : ");
//		
//		
		Scanner scan = new Scanner(System.in);
//		try {
//			int num = scan.nextInt();
//			scan.nextLine();
//			ec.classify(num);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("�߸��� �Է�");
//		}
//		
//		
//		F_Logical fl = new F_Logical();
//		fl.logicalFunction();
//		
//		
//		System.out.println("���� �ϳ� �Է� : ");
//		int num = scan.nextInt();
//		scan.nextLine();
//		boolean isTrue = fl.logicalFunction2(num);
//		
//		System.out.println("����̸鼭 ¦�� "+isTrue);
//		
//		
//		char ch = scan.nextLine().charAt(0);
//		fl.logicalFunction3(ch);
		
		G_Triple gt = new G_Triple();
//		System.out.println("���� 2�� �Է�");
//		int a = scan.nextInt();
//		scan.nextLine();
//		int b = scan.nextInt();
//		scan.nextLine();
//		
//		gt.whichMin(a, b);
//		
//		
//		System.out.println("�ƹ� ���� �Է�");
//		int c = scan.nextInt();
//		scan.nextLine();
//		gt.triple2(c);
		
		
//		System.out.println("���� �Է�");
//		char ch = scan.nextLine().charAt(0);
//		gt.triple3(ch);
		
//		System.out.println("���� �Է�");
//		try {
//			int a = scan.nextInt();
//			scan.nextLine();
//			gt.triple4(a);
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println("�߸��� �� �Է�");
//		}
		
		System.out.println("���� �Է�");
		char ch = scan.nextLine().charAt(0);
		gt.triple5(ch);

		
		scan.close();
	}

}
