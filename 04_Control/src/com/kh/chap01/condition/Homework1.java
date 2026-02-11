package com.kh.chap01.condition;

import java.util.Scanner;

public class Homework1 {
	public Scanner scan = new Scanner(System.in);
	
	public void method5() {
		
		System.out.println("이름을 입력하세요 : ");
		String name = scan.nextLine();
		
		System.out.println("학년(숫자로) : ");
		int year = scan.nextInt();
		scan.nextLine();
		
		System.out.println("반(숫자로) : ");
		int classNum = scan.nextInt();
		scan.nextLine();
		
		System.out.println("번호(숫자로) : ");
		int studentNum = scan.nextInt();
		scan.nextLine();
		
		System.out.println("성별(M/F) : ");
		char gender = scan.nextLine().charAt(0);
		String genderLong = (gender == 'M' || gender == 'm') ? "남학생" : 
					((gender == 'F' || gender == 'f') ? "여학생" : "잘못된 입력");
		
		System.out.println("점수(실수로) : ");
		double grade = scan.nextDouble();
		scan.nextLine();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f점입니다.", year, classNum, studentNum, name,
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
		System.out.println("총점 : "+totalScore);
		double averageScore = totalScore/3.0;
		System.out.println("평균 : "+averageScore);
		
		if (kNum >= 40 && mNum >= 40 && eNum >= 40) {
			if (averageScore >= 60) {
				System.out.println("합격");
			}else {
				System.out.println("불합격, 평균 미달");
			}
		}else {
			System.out.println("불합격, 과락 존재");
		}
	}

	/**
	 * 숫자를 입력하면 해당 월이 봄/여름/가을/겨울인지 출력하는 함수
	 * switch문 이용
	 */
	public void practice4() {
		System.out.println("1~12 사이의 숫자를 입력하세요 : ");
		int month = scan.nextInt();
		scan.nextLine();

		switch(month) {
		case 3, 4, 5:
			System.out.println(month + "월은 봄입니다.");
			break;
		case 6, 7, 8:
			System.out.println(month + "월은 여름입니다.");
			break;
		case 9, 10, 11:
			System.out.println(month + "월은 가을입니다.");
			break;
		case 12, 1, 2:
			System.out.println(month + "월은 겨울입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
	}

	/**
	 * 아이디 비밀번호가 하드코딩된 로그인 기능 함수
	 * 로그인 성공 시 "로그인 성공"
	 * 아이디가 틀렸을 시 "아이디가 틀렸습니다"
	 * 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다"
	 */
	public void practice5() {
		String userId = "gahyun";
		String userPw = "1234";

		System.out.println("아이디 입력 : ");
		String userInputId = scan.nextLine();
		System.out.println("비밀번호 입력 : ");
		String userInputPw = scan.nextLine();

		if (userInputId.equals(userId) && userInputPw.equals(userPw)) {
			System.out.println("로그인 성공");
		} else if (!userInputId.equals(userId)) {
			System.out.println("아이디가 틀렸습니다");
		} else if (!userInputPw.equals(userPw)) {
			System.out.println("비밀번호가 틀렸습니다");
		}
	}

}
