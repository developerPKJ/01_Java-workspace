package com.kh.chap01.condition;

import java.util.Scanner;

public class Homework1 {
	Scanner scan = new Scanner(System.in);
	
	public void method5() {
		
		System.out.println("이름 입력 : ");
		String name = scan.nextLine();
		
		System.out.println("학년(숫자만) : ");
		int year = scan.nextInt();
		scan.nextLine();
		
		System.out.println("반(숫자만) : ");
		int classNum = scan.nextInt();
		scan.nextLine();
		
		System.out.println("번호(숫자만) : ");
		int studentNum = scan.nextInt();
		scan.nextLine();
		
		System.out.println("성별(M/F) : ");
		char gender = scan.nextLine().charAt(0);
		String genderLong = (gender == 'M' || gender == 'm') ? "남학생" : 
					((gender == 'F' || gender == 'f') ? "여학생" : "잘못된 입력");
		
		System.out.println("성적(소수점 아래 둘째 자리까지) : ");
		double grade = scan.nextDouble();
		scan.nextLine();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", year, classNum, studentNum, name,
																genderLong, grade);
		System.out.println();
	}
	
	public void method7() {
		System.out.print("국어 점수 : ");
		int kNum = scan.nextInt();
		scan.nextLine();
		System.out.print("수학 점수 : ");
		int mNum = scan.nextInt();
		scan.nextLine();
		System.out.print("영어 점수 : ");
		int eNum = scan.nextInt();
		scan.nextLine();
		
		int totalScore = kNum + mNum + eNum;
		System.out.println("합계 : "+totalScore);
		double averageScore = totalScore/3.0;
		System.out.println("평균 : "+averageScore);
		
		if (kNum >= 40 && mNum >= 40 && eNum >= 40) {
			if (averageScore >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("평균 점수 미달, 불합격");
			}
		}else {
			System.out.println("과락 과목 존재, 불합격");
		}
	}
}























