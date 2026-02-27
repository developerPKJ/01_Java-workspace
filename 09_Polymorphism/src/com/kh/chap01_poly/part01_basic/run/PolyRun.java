package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		
		/*
		 * * 객체지향 프로그래밍 (OOP - Object Oriented Programming) 3대 특징
		 * 1. 캡슐화
		 * 2. 상속
		 * 3. 다형성
		 * ---
		 * 4. 추상화
		 * 
		 * * 다형성 == 많은 형태를 갖는 성질 == 즉, 형변환이 가능하다 == 물론 참조변수 (객체) 간의 형변환이 가능하다
		 *   (단, 상속 관계에서만)
		 */
		
		// 명심할 사항 : "=" 대입연산자를 기준으로 왼쪽과 오른쪽의 자료형은 같아야함!!
		
		// 1. 부모 타입의 참조변수로 부모 객체를 다루는 경우
		System.out.println("1. 부모 타입의 참조변수로 부모 객체를 다루는 경우");
		
		// Parent p1; // 부모 (Parent) 타입의 참조변수 p1 : 주소값이 담김
		// p1 = new Parent(); // 부모 (Parent) 객체 생성 (new) 후 대입
		
		Parent p1 = new Parent();
		p1.printParent();
		// p1.printChild1();
		// p1.printChild2();
		// > p1 참조변수로 Parent 에만 접근 가능!!
		
		// 2. 자식 타입의 참조변수로 자식 객체를 다루는 경우
		System.out.println("2. 자식 타입의 참조변수로 자식 객체를 다루는 경우");
		
		Child1 c1 = new Child1();
		c1.printChild1(); // 내가 내꺼 호출하는것
		c1.printParent(); // 부모님꺼도 내꺼 (호출 가능)
		// > c1 참조변수로 Child1, Parent 둘 다 접근 가능!!
		
		// 3. 부모 타입의 참조변수로 자식 객체를 다루는 경우
		// > "다형성" 이 적용된 개념
		System.out.println("3. 부모 타입의 참조변수로 자식 객체를 다루는 경우 (다형성 적용)");
		
		Parent p2 = /* (Parent) */ new Child1();
		// > 대입연산자를 기준으로 양쪽의 자료형이 다름에도 불구하고 오류 발생 X
		//   Child1 타입의 주소값이 Parent 타입으로 "자동형변환" 이 되고 있다.
		// > "상속" 구조에서는 클래스 (사용자 정의 자료형) 간의 "형변환" 이 가능하다!!
		
		// Child1 타입의 객체가 생성되면서 주소값 생성
		// --> Parent 타입의 주소값으로 형변환 (자동으로)
		// --> Parent 타입 변수 상자 (p2) 에 담김
		
		p2.printParent();
		// > Child1 출신의 주소값이 담겨있기는 하나, 자료형 상자 종류 자체가 Parent 타입임!! (표면적으로 Parent 타입)
		//   Parent 에 접근 가능!!
		
		// p2.printChild1();
		// > Child1 출신의 주소값은 맞지만, 현재는 표면상으로 Parent 상자에 주소값이 담겨있으므로
		//   Child1 에 접근 불가능!!
		
		// > 결국 Parent 타입으로 형변환이 되었기 때문에 Parent 에만 접근 가능
		
		// p2 에 담겨있는 주소값은 그래도 Child1 출신이였으니까 Child1 에 접근을 해보고는 싶음!!
		((Child1)p2).printChild1();
		
		// 자식 : 부모님꺼도 내꺼 ^0^
		((Child1)p2).printParent();
		
		// > 다시 Child1 타입으로 형변환을 함으로써 원상복귀 후 Child1 에 접근 가능
		
		/*
		 * * 다형성
		 * > 직역하면 다양한 형태를 갖는 성질
		 * > "상속" 관계에서의 각 클래스별 "형변환" 개념 (상속이 대전제임)
		 * 
		 * 			  자동형변환
		 * 			<---------
		 * 부모타입				 자식타입
		 * 			--------->
		 * 			 강제형변환
		 * 
		 * 1. UpCasting
		 * > 자식 타입이 부모 타입으로 형변환 되는 과정 : 자동형변환 (형변환 연산자 생략 가능)
		 * 
		 * 2. DownCasting
		 * > 부모 타입이 자식 타입으로 형변환 되는 과정 : 강제형변환 (형변환 연산자를 명시적으로 작성해야함)
		 */
		
		// * 다형성을 쓰는 이유
		
		// Child1 객체 2개, Child2 객체 2개
		// > 변수만 이용해서 프로그래밍 할 경우 변수가 총 4개 필요함!!
		// > 배열을 이용해서 프로그래밍 할 경우 Child1 배열 1개, Child2 배열 1개
		
		// - 객체 배열을 이용해보자
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1, 2, 4);
		arr1[1] = new Child1(2, 1, 5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(5, 7, 3);
		arr2[1] = new Child2(2, 3, 5);
		
		// > 이 상태에서 각각 arr1, arr2 에 들은 모든 객체들에 대해 반복적으로 출력같은것을 수행하려면
		//   arr1 용 for문 1개, arr2 용 for문 1개 가 각각 필요함!!
		
		// - 위의 방법도 충분히 가능하지만, 
		//   다형성을 적용하면 "부모타입 참조변수" 로 다양한 "자식타입의 객체" 를 받아줄 수 있기 때문에
		//   효율적으로 객체배열을 활용 할 수 있게 된다!!
		
		System.out.println("=== 다형성을 접목한 객체배열 ===");
		
		Parent[] arr = new Parent[4];
		arr[0] = /* (Parent) */ new Child1(1, 2, 4);
		arr[1] = /* (Parent) */ new Child2(5, 7, 3);
		arr[2] = new Child2(2, 3, 5);
		arr[3] = new Child1(2, 1, 5);
		
		// > arr 배열의 모든 객체에 대해 printParent 라는 메소드를 호출해보고 싶음!!
		/*
		arr[0].printParent();
		arr[1].printParent();
		arr[2].printParent();
		arr[3].printParent();
		*/
		
		// for문은 한번만 써도 충분
		for(int i = 0; i < arr.length; i++) {
			
			arr[i].printParent();
		}
		
		// > arr 배열의 모든 객체에 대해 각각의 자식 출력 메소드 (printChild1, printChild2) 들을 호출해보고 싶음!!
		((Child1)arr[0]).printChild1();
		((Child2)arr[1]).printChild2();
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		
		// 주의할 점!!
		// ((Child2)arr[0]).printChild2(); // Child1 --> Parent --> Child2
		// > ClassCastException 오류 발생!!
		//   클래스 간의 형변환이 잘못 되었을 경우 발생하는 오류
		// > Child1 과 Child2 는 우연히 부모클래스가 같을 뿐이지 아무 사이도 아니기 때문에 형변환이 불가능하다!!
		
		System.out.println("=== 반복문 이용해서 해보기 ===");
		
		for(int i = 0; i < arr.length; i++) {
			
			// ((Child1)arr[i]).printChild1();
			// > 항상 원본 타입에 알맞게 원상복귀 (형변환) 을 해줘야 함!!
			
			// > 형변환 전에 해당 타입이 Child1 출신이였는지 Child2 출신이였는지 검사하고 들어가기
			
			// * instanceof 연산자
			// > 현재 해당 참조변수가 실제로 어떤 자식 객체를 참조하고 있는지 확인 가능
			// System.out.println(arr[i] instanceof Child1);
			// System.out.println(arr[i] instanceof Child2);
			// System.out.println(arr[i] instanceof Parent);
			
			/*
			if(arr[i] instanceof Child1) {
				// > i 번째 주소값이 원래 Child1 출신이였다면
				
				// Child1 으로 원상복귀 (강제형변환을 통해)
				((Child1)arr[i]).printChild1();
				
			} else {
				// > i 번째 주소값이 원래 Child1 출신이 아니라면 (즉, Child2 출신이였다면)
				
				// Child2 로 원상복귀 (강제형변환을 통해)
				((Child2)arr[i]).printChild2();
			}
			*/
			// > 제대로는 동작하나, 구문이 길고 복잡해짐!!
			
			// 팁)
			arr[i].print();
			// > 오버라이딩을 하는 순간 오버라이딩된 메소드가 우선권이 있다.
			//   (즉, 오버라이딩된 자식메소드가 호출된다)
			// > 호출 시, 실질적으로 참조하고 있는 (원본 자식타입의) 오버라이딩된 자식 메소드를 찾아가서 알아서 호출!!
			// > 오버라이딩을 적극 활용하면 매번 일일이 검사를 통해 확인하고, 형변환을 통해 원상복귀를 할 필요가 없어짐!!
			
		}
		
		// 그렇다면 Object 객체만 들어갈 수 있는 배열을 만들어본다면?
		// Object[] arr = new Object[10];
		// > [0] ~ [9] 까지 자바에서 취급되는 모든 종류의 객체를 다 담을 수 있게 될 것!!
		
	}

}






