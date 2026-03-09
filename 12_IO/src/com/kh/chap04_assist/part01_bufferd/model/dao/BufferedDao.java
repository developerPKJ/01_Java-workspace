package com.kh.chap04_assist.part01_bufferd.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// BufferedReader / BufferdWriter (2byte)
public class BufferedDao {

	/*
	 * * 입출력 단계 (3 steps)
	 * 1. 통로 열기 <<-- 보조스트림을 결합하는 과정까지 덧붙이기 (성능향상을 위해)
	 * 2. 볼일 보기
	 * 3. 통로 닫기
	 */
	
	// 프로그램 (기준점) ---> 외부매체 (파일)
	// 출력 
	public void fileSave() {
		
		// FileWriter 
		// +
		// BufferedWriter
		
		// 0. FileWriter, BufferedWriter 변수 선언 및 null 로 초기화
		// FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			// 1. 통로 열기
			// 1_1. 기반스트림 객체 먼저 생성 (메인통로 먼저 만들기)
			// fw = new FileWriter("c_buffer.txt");
			
			// 1_2. 보조스트림 객체 생성 (이미 만들어진 기반스트림 객체를 넘기면서)
			bw = new BufferedWriter(new FileWriter("c_buffer.txt"));
			// > 기반스트림 객체를 생성해서 변수에 담고, 그 변수명을 제시하는 대신
			//   곧바로 보조스트림 객체 생성자 매개변수로 new 구문을 통해 기반스트림 객체를 생성과 동시에 넘길 수 있음!!
			//   (코드를 조금 더 줄여주는 효과!!)
			
			// 2. 볼일 보기
			// > 반드시 보조스트림 객체에서 제공하는 메소드로 볼일을 볼 것!!
			bw.write("안녕하세요");
			bw.newLine(); // 개행을 넣어주는 메소드
			bw.write("반갑습니다\n");
			bw.write("저리가세요");
			// > 한줄 단위로 출력해낼 수 있다.
			
			// 3. 통로 닫기 - 반드시 마지막에 실행 (finally)
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				// 3. 통로 닫기 (== 다 쓴 자원을 반납한다)
				// > 1단계에서 만들어진 통로의 갯수 만큼 모두 다 닫아줘야 함!!
				// > 이 때, 통로가 만들어진 순서의 "역순" 으로 닫아줘야 한다!!
				
				// 만들어진 순서 : 기반 스트림 --> 보조 스트림
				// 닫아야되는 순서 : 보조 스트림 --> 기반 스트림
				bw.close();
				// fw.close();
				
			} catch(IOException e) {
				
				e.printStackTrace();
			}
		}
		
		System.out.println("프로그램 종료");
	}
	
	// 프로그램 (기준점) <--- 외부매체 (파일)
	// 입력
	public void fileRead() {
	
		// FileReader 
		// + 
		// BufferedReader
		
		// 0. FileReader, BufferedReader 변수 선언 및 null 로 초기화
		// FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			// 1. 통로 열기
			// 1_1. 기반 스트림 객체 먼저 생성
			// fr = new FileReader("c_buffer.txt");
			
			// 1_2. 보조 스트림 객체 생성 (기반 스트림 객체를 넘기면서)
			br = new BufferedReader(new FileReader("c_buffer.txt"));
			
			// 2. 볼일 보기
			/*
			System.out.println(br.readLine()); // "안녕하세요"
			System.out.println(br.readLine()); // "반갑습니다"
			System.out.println(br.readLine()); // "저리가세요"
			// > 한줄 단위로 읽어들일 수 있다!!
			
			System.out.println(br.readLine());
			// > 더이상 읽어들일 내용이 없다면 (즉, 파일의 끝을 만났다면)
			//   null 을 리턴해줌!!
			*/
			
			// 반복문 활용
			/*
			while(br.readLine() != null) {
				
				System.out.println(br.readLine());
			}
			*/
			// > 퐁당퐁당 출력
			
			// 1)
			/*
			while(true) {
				
				String value = br.readLine();
				
				if(value == null) {
					
					break;
				}
				
				System.out.println(value);
			}
			*/
			
			// 2) 
			String value = null;
			
			while((value = br.readLine()) != null) {
				
				System.out.println(value);
			}
			
			// 3. 통로 닫기 - 마지막에 반드시 일어나야함 (finally)
			
		} catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				// 3. 자원 반납 (생성 순서의 역순)
				br.close();
				// fr.close();
				
			} catch(IOException e) {
				
				e.printStackTrace();
			}
			
		}
		
		System.out.println("프로그램 종료");
	}
	
}






