package com.kh.chap01_abstraction.run;

import java.util.Scanner;

import com.kh.chap01_abstraction.model.vo.Student;

public class Run {

	/*
	1. 객체지향언어 : 객체 중심으로 돌아가는 컨셉의 프로그래밍 언어
	2. 객체 : 독립적으로 존재하는 모든 것
	3. 객체지향 프로그래밍 : 객체의 상호작용을 프로그래밍을 통해 가상세계로 구현
	
	클래스라는 틀을 만들어야함
	추상화 --> 캡슐화 과정 필요

	대상의 모든 요소를 모은 뒤, 프로그램에 필요한 요소들만 추려, 구현
	요소 추리는 과정이 가장 중요함

	1. 변수로 프로그램 구현 : 일일히 변수를 다 설정해줘야함, 반복문 사용도 불가
	2. 배열로 프로그램 구현 : 정확한 인덱스에 접근만 가능하다면 가능은 함(어렵),
							배열은 크기가 변경 불가능하다는 특징으로 확장성 부족
	3. 구조체 : 한번에 여러 개의 자료형을 보관할 수 있는 배열과 유사한 것
				자바에서는 구조체를 클래스라고 부름
	4. 클래스 : 기존에 메소드만 포함하는 클래스를 생성했었음,
				정보를 담는 클래스 생성 예정
	- 메소드를 담는 용도 클래스 : Controller Class
	- 정보 담는 용도 클래스 : VO(Value Object) Class
	*/

	public static void main(String[] args) {
		/*
		// 변수만 가진 프로그램
		String name1 = "홍길동";
		int age1 = 20;
		double height1 = 189.2;
		*/

		
		/*
		//배열만 가진 프로그램
		String[] name = {"홍길동", "아무개"};
		int[] age = {19, 20};
		double[] height = {192.2, 189.6};
		*/


		//구조체
		Student hong = new Student("홍길동", 20, 189.2);
		// hong.name = "홍길동";
		hong.inputName("홍길동");

		Student kim = new Student("김영희", 19, 192.2);
		kim.inputAge(21);

		// 객체는 참조자료형이라 주소값을 가지고 있음을 알 수 있음
		// System.out.println(hong);
		// System.out.println(kim);
		// System.out.println(hong.hashCode());
		// System.out.println(kim.hashCode());

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();

		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		sc.nextLine();

		System.out.println("키 입력 : ");
		double height = sc.nextDouble();
		sc.nextLine();

		Student studentTest = new Student(name, age, height);
		studentTest.weight = 70;
		studentTest.outputInfo();

		// .을 통해 직접적으로 값에 접근 가능
		// . : 직접접근연산자, 참조자료형의 주소값을 실제로 타고 들어가는 연산실행
		// --> 보안성이 떨어짐

		/*
		 객체지향 설계 원칙 중 "정보 은닉"
		 1. 데이터 은닉
		 2. 코드 은닉

		 캡슐화 : 이 원칙을 지키기 위해 클래스에 접근을 제한해야함
		 */
		sc.close();
	}

}
