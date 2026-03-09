package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

// 클라이언트용 프로그램 - 2순위
public class ClientProgram {
	
	/*
	 * * Client 측 프로그램 흐름
	 * 1. 요청하고자 하는 서버의 정보를 셋팅하기 (변수로 셋팅)
	 * 2. 서버에 연결 요청을 보내기 (Socket 객체를 생성)
	 * --- 이 시점에 서버가 accept() 를 통해 연결을 수락 ---
	 * 3. 수락이 되었다면 Socket 객체가 제대로 잘 생성됨!!
	 * 4. 서버와 통신할 수 있는 입출력 스트림 객체를 얻어내기 (길 깔기)
	 * 5. 보조스트림을 추가하여 성능 개선
	 * 6. 스트림을 통해 데이터 입출력
	 * 7. 통신 종료 절차 (역순으로 반드시)
	 */

	public static void main(String[] args) {
		
		System.out.println("~~~ 카카오톡 ~~~");
		
		Scanner sc = new Scanner(System.in);
		
		// 0. 지역변수 이슈 해결을 위해 자원 변수 선언 및 null 로 초기화
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
		
			// 1. 요청하고자 하는 서버의 정보 (IP 주소, Port 번호) 셋팅
			// > 요청하고자 하는 서버의 IP 주소 : 각자 본인의 PC 주소!! (같은 컴퓨터에서 구동할 예정)
			//	 매번 내 PC 의 IP 주소를 얻어오기 귀찮다면 "localhost" 또는 "127.0.0.1" (루프백 IP)
			String serverIp = "127.0.0.1";
			int serverPort = 3000;
			
			// 2. Socket 객체 생성 (== 곧 서버로 연결 요청을 보내겠다)
			// > 어느 서버와 연결할건지 상대방의 IP 주소와 Port 번호를 넘기면서 생성해야함
			socket = new Socket(serverIp, serverPort);
			
			// --- 서버가 accept 하는 순간 Socket 객체 생성됨 (대문이 열림) ---
			// 3. 서버로 연결 요청 후 연결 요청이 잘 수락되었는지 검사
			if(socket != null) {
				// > 서버와 연결이 잘 된 경우
				
				// 나머지 단계를 이어쓰기
				System.out.println("서버와 연결 성공!");
				
				// 4. 서버와 통신할 수 있는 입출력 스트림 생성
				// + 
				// 5. 보조스트림을 통해 성능 개선
				
				// - 입력용 스트림
				// (클라이언트 입장에서) 서버로부터 전달받은 데이터를 읽어들이는 스트림
				// 즉, 아까전에 서버 측에서 만든 출력용 스트림과 연결!!
				
				// socket.getInputStream()
				// + InputStreamReader (사이즈 호환용)
				// BufferedReader
				br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				
				// - 출력용 스트림
				// (클라이언트 입장에서) 서버로 데이터를 내보내주는 스트림
				// 즉, 아까전에 서버 측에서 만든 입력용 스트림과 연결!!
				
				// socket.getOutputStream()
				// + 
				// PrintWriter (별도의 사이즈 호환용 보조스트림이 불필요)
				pw = new PrintWriter(socket.getOutputStream());
				
				// 6. 스트림을 통해 데이터 읽고 쓰기
				// > 마찬가지로 무한 반복 
				while(true) {
					
					// 6_1. 서버로 데이터를 내보내기
					System.out.print("서버에게 보낼 내용 : ");
					String sendMessage = sc.nextLine();
					pw.println(sendMessage);
					
					// 6_2. (혹시 모르니까) 현재 스트림에 남아있는 데이터 내보내기
					pw.flush();
					
					// 6_3. 서버로부터 전달된 데이터 읽기
					String message = br.readLine();
					System.out.println("서버 : " + message);
				}	
			}
			
		} catch(IOException e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
			
				// 7. 통신 종료 절차 (생성 순서의 역순)
				pw.close();
				br.close();
				socket.close();
			
			} catch(IOException e) {
				
				e.printStackTrace();
			}	
		}

		sc.close();
	}

}







