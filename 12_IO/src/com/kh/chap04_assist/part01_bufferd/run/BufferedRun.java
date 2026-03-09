package com.kh.chap04_assist.part01_bufferd.run;

import com.kh.chap04_assist.part01_bufferd.model.dao.BufferedDao;

public class BufferedRun {
	
	/*
	 * * 보조 스트림
	 * > 기반 스트림 (외부매체와 직접 연결되어있는 메인통로) 의 부족한 기능을 확장시킬 수 있는 스트림
	 * > 즉, 성능 향상 목적으로 쓰임
	 * > 보조 스트림은 단독으로 사용할 수 없다!! (단독으로 보조 스트림 객체를 생성할 수 없다)
	 * 
	 * [ 표현법 ]
	 * 보조스트림클래스명 객체명 = new 보조스트림클래스명(기반스트림객체명);
	 * 
	 * * 주의할 점
	 * 1. 보조 스트림과 기반 스트림의 "방향" 이 같아야 한다!!
	 * > 입력이면 입력, 출력이면 출력 끼리만 결합 가능하다!!
	 * 2. 보조 스트림과 기반 스트림의 "통로의 사이즈" 또한 같아야 한다!!
	 * > 바이트면 바이트, 문자면 문자 끼리만 결합 가능하다!!
	 * 
	 * * BufferedXXX
	 * > 입출력 속도 성능 향상 목적의 보조 스트림
	 * 
	 * [ 종류 ]
	 * BufferedInputStream / BufferedOutputStream (1byte)
	 * BufferedReader / BufferedWriter (2byte)
	 * 
	 * > 버퍼 메모리 공간을 제공해서 입출력할 데이터를 한번에 모아두었다가
	 *   한꺼번에 입출력을 진행해서 속도를 빠르게 향상시켜주는 원리
	 */

	public static void main(String[] args) {
		
		BufferedDao bd = new BufferedDao();
		
		// bd.fileSave();
		bd.fileRead();
		
	}

}




