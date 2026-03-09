package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {
	
	// 프로그램 (기준점) ---> 외부매체 (파일)
	// 출력
	public void fileSave() {
		
		// 휴대폰들의 정보를 객체배열로 나타내기
		Phone[] arr = new Phone[3];
		
		arr[0] = new Phone("아이폰", 1200000);
		arr[1] = new Phone("갤럭시", 1300000);
		arr[2] = new Phone("플립폰", 1400000);
		
		// FileOutputStream 
		// + 
		// ObjectOutputStream
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phoneList.txt"))) {
			
			/*
			oos.writeObject(arr[0]);
			oos.writeObject(arr[1]);
			oos.writeObject(arr[2]);
			*/
			
			for(int i = 0; i < arr.length; i++) {
				
				oos.writeObject(arr[i]);
			}
			
		} catch(IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("프로그램 종료");
	}

	// 프로그램 (기준점) <--- 외부매체 (파일)
	// 입력
	public void fileRead() {
		
		// FileInputStream
		// + 
		// ObjectInputStream
		
		// 0. 스트림 변수 선언 및 null 로 초기화
		ObjectInputStream ois = null;
		
		try {
			
			// 1. 통로 열기 (스트림 객체 생성)
			ois = new ObjectInputStream(new FileInputStream("phoneList.txt"));
			
			// 2. 볼일 보기
			// System.out.println(ois.readObject() /* .toString() */);
			// System.out.println(ois.readObject());
			// System.out.println(ois.readObject());
			
			// System.out.println(ois.readObject());
			// > 더 이상 읽어들일 데이터가 없는 경우 EOFException 오류 발생!!
			//   (EOF : End Of File)
			
			// 반복문 활용
			// > EOFException 이 발생한 경우 반복을 멈춰야 함!!
			// > 별도의 조건식으로는 표현할 수 없지만 예외가 발생하면 프로그램이 비정상적으로 종료됨!!
			//   (이 과정에서 무한반복문도 종료된다는 점을 이용 - 일부러 예외가 발생하게 내비두기)
			while(true) {
				
				System.out.println(ois.readObject());
			}
			
		} catch(EOFException e) {
			// > EOFException 은 IOException 의 자식클래스!! (상단에 작성)
			
			System.out.println("파일을 다 읽었습니다.");
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
		} catch(ClassNotFoundException e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				// 3. 통로 닫기
				ois.close();
				
			} catch(IOException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료");
	}
	
}







