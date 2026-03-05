package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {
	public static void main(String[] args) {
		/* * File 클래스
		 * > 자바 구문을 통해 파일 또는 폴더를 만들거나 그 외 부가적인 기능을 제공하는 클래스
		 * > java.io 패키지 안에 존재하는 클래스(java.io.File)
		 */
		
		try {
			// 해당 경로에 파일이 존재하지 않으면 파일을 생성해주는 메소드
			File file1 = new File("test.txt");
			file1.createNewFile();
			// 현재 12_IO 폴더 안에 test.txt 파일이 생성됨

			/* 경로 지정을 한 파일명을 제시해서 생성(C:\aaa\test.txt)
			window 기준으로 \로 경로를 구분
			하지만 자바에서 \ 는 이스케이프 문자이기에 그대로 사용 불가
			따라서 \\를 사용해야 함(C:\\aaa\\test.txt)
			*/
			File file2 = new File("C:\\aaa\\test.txt");
			file2.createNewFile();	// aaa 폴더가 존재하지 않으므로 IOException 발생

			// 근데 linux나 mac에서는 /로 경로 구분 가능(윈도우도 가능하긴 함)
			File file3 = new File("C:/aaa/test.txt");
			file3.createNewFile();

			// 절대경로 / 상대경로
			// 폴더를 생성하고 나서 그 안에 파일을 생성하는 방법(절대경로)
			File folder = new File("C:/aaa");
			folder.mkdir();	// aaa 폴더 생성
			File file4 = new File("C:/aaa/test.txt");
			file4.createNewFile();	// aaa 폴더가 존재하므로 test.txt 파일 생성
		} catch (IOException e) {
			e.printStackTrace();
		} 

		try {
			// 상대경로
			File folder2 = new File("testFolder");
			folder2.mkdir();	// 현재 12_IO 폴더 안에 testFolder 폴더 생성
			File file5 = new File("testFolder/test.txt");
			file5.createNewFile();	// testFolder 폴더 안에 test.txt 파일 생성

			/*.mkdir : 폴더 생성 메소드
			.createNewFile : 파일 생성 메소드
			*/

			System.out.println(folder2.exists());	// true
			System.out.println(file5.exists());	// true
			System.out.println(folder2.isDirectory());	// true
			System.out.println(file5.isFile());	// true

			System.out.println("폴더명 : " + folder2.getName());	// 폴더명 : testFolder
			System.out.println("파일명 : " + file5.getName());	// 파일명 : test.txt

			System.out.println("폴더 경로 : " + folder2.getPath());	// 폴더 경로 : testFolder
			System.out.println("파일 경로 : " + file5.getPath());	// 파일 경로 : testFolder\test.txt

			System.out.println("폴더 절대 경로 : " + folder2.getAbsolutePath());	// 폴더 절대 경로 : C:\\Users\\user\\Desktop\\workspace\\12_IO\\testFolder
			System.out.println("절대 경로 : " + file5.getAbsolutePath()); 	// 절대 경로 : C:\\Users\\user\\Desktop\\workspace\\12_IO\\testFolder\\test.txt

			System.out.println("상위 폴더 : " + file5.getParent());	// 상위 폴더 : testFolder

			System.out.println("파일 크기 : " + file5.length() + "byte");	// 파일 크기 : 0byte
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("종료");	// 정상종료 확인
	}
	/** IO
	 * > 자바에서 프로그램 상 데이터를 외부매체에서 읽어들이는 것(Input)과 내보내는 것(Output)을 통칭하는 용어
	 * 
	 * 프로그램 상의 데이터를 외부매체로 보내거나 받으려면,
	 * 프로그램과 외부매체 사이에 통로가 필요하다.
	 * > 이 통로를 스트림(Stream)이라고 한다.
	 * 
	 * 
	 * 스트림 특징
	 * 1. 단방향성
	 * - 입력과 출력은 별도의 스트림이 필요하다.
	 * 
	 * 2. 선입선출(FIFO) 
	 * - 먼저 입력된 데이터가 먼저 출력된다.
	 * 
	 * 3. 시간지연
	 * - 1번, 2번 특징으로 인해 데이터가 입력되고 출력되기까지 시간이 걸린다.
	 * 
	 * > 자바에서는 스트림을 각각의 클래스로 정의해서 제공해 줌
	 * 
	 * 스트림 종류
	 * 1. 바이트 스트림 : 1byte 단위로 데이터를 입출력하는 스트림
	 * - InputStream : 바이트 단위로 데이터를 읽어들이는 스트림의 최상위 클래스
	 * - OutputStream : 바이트 단위로 데이터를 내보내는 스트림의 최상위 클래스
	 * 
	 * 2. 문자 스트림 : 2byte 단위로 데이터를 입출력하는 스트림
	 * - Reader : 문자 단위로 데이터를 읽어들이는 스트림의 최상위 클래스
	 * - Writer : 문자 단위로 데이터를 내보내는 스트림의 최상위 클래스
	 * 
	 * > Buffered, Data, Object, file 등 다양한 보조 스트림이 존재한다.
	 * 
	 */
}
