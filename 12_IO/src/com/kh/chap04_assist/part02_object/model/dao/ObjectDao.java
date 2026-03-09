package com.kh.chap04_assist.part02_object.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectDao {
	
	/*
	 * * 입출력 단계 (3 steps)
	 * 1. 통로 열기 <<-- 보조스트림과 결합
	 * 2. 볼일 보기
	 * 3. 통로 닫기
	 */
	
	// 프로그램 (기준점) ---> 외부매체 (파일)
	// 출력
	public void fileSave() {
		
		// FileOutputStream
		// + 
		// ObjectOutputStream
		
		// 테스트용 객체 생성
		Phone ph = new Phone("아이폰13", 1200000);
		
		// try ~ catch문 이용
		/*
		// 0. ObjectOutputStream 변수 선언 및 null 로 초기화
		ObjectOutputStream oos = null;
		
		try {
			
			// 1. 통로 열기 (보조스트림으로 한번에)
			oos = new ObjectOutputStream(new FileOutputStream("phone.txt"));
			
			// 2. 볼일 보기
			// > 객체 단위로 데이터를 내보내는 작업
			//   writeObject() 메소드 사용
			oos.writeObject(ph);
			// > 매개변수는 원래 Object 타입인데, 실제로 넘기는 인자값은 Phone 타입임!!
			//   내부적으로 "다형성" 이 적용된 꼴!! (Upcasting, 자동형변환)
			// > NotSerializableException 오류 발생!!
			//   1byte 짜리 좁은 통로로 상대적으로 크기가 큰 VO 객체가 이동하면서 깨지는 상황!!
			
			// 해결방법)
			// 해당 VO 클래스 선언부 쪽으로 가서 "직렬화 선언" 이라는걸 해준다!!
			// > 오류를 해결하더라도 객체 단위로 기록되어있기 때문에
			//   파일로는 깨져보이지만 정상적으로 제대로 기록된 것!!
			
			// 3. 통로 닫기 - finally
		
		} catch(FileNotFoundException e) {
			
			e.printStackTrace();
		
		} catch(IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				// 3. 통로 닫기
				oos.close();
				
			} catch(IOException e) {
				
				e.printStackTrace();
			}
		}
		*/
		
		// try ~ with ~ resource구문 (JDK 7 이상부터 지원 가능)
		/*
		 * [ 표현법 ]
		 *
		 * try(스트림객체생성구문; 스트림객체생성구문) {
		 * 
		 * 		예외가 발생될법한 구문;
		 * 
		 * } catch(예외클래스명 변수명) {
		 * 
		 * 		예외가 발생했을 때 실행할 코드;
		 * }
		 * 
		 * - 스트림 객체를 try(여기) 에서 생성하면
		 *   해당 스트림 객체 생성 후 해당 try 블록의 구문이 완료되면
		 *   예외가 발생하든 발생하지 않든 간에 마지막으로 자동으로 해당 객체가 반납된다!!
		 *   (finally 에서 반납 구문을 적는걸 생략해주는 효과)
		 */
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phone.txt"))) {
			
			oos.writeObject(ph);
			
		} catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
		// > 예외가 발생하든 발생하지 않든 간에 oos 는 이 시점에서 자동으로 반납됨!!
		
		System.out.println("프로그램 종료");
	}
	
	// 프로그램 (기준점) <--- 외부매체 (파일)
	// 입력
	public void fileRead() {
		
		// FileInputStream
		// + 
		// ObjectInputStream
		
		// try ~ with ~ resource구문
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phone.txt"))) {
			
			// > 객체 단위로 읽어들이는 메소드
			//   readObject() 메소드 사용
			
			// Object obj = ois.readObject();
			// System.out.println(obj /* .toString() */);
			
			Phone p = (Phone)ois.readObject();
			// > readObject 메소드의 반환형이 Object 타입이므로 원래의 자식타입으로 받고 싶다면
			//   다형성을 이용해서 강제형변환 해줘야 함!! (DownCasting)
			System.out.println(p);
			
		} catch(ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}
	
}




