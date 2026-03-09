package com.kh.chap02_tcp.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 서버용 프로그램 - 1순위
public class ServerProgram {
	
	/*
	 * * TCP (Transmission Control Protocol)
	 * > 서버, 클라이언트 간의 1:1 소켓 통신 방식 중 하나
	 * > 데이터를 교환하기에 앞서 서버, 클라이언트가 각각 연결되어있어야 함
	 *   (항상 서버가 먼저 실행되서 클라이언트의 요청을 기다려야 함!! - 서버는 24시간 대기중)
	 * > 신뢰성 있는 정확한 데이터를 전달 가능 (연결 지향적임)
	 * 
	 * * Socket 클래스
	 * > 프로세스 간의 통신을 담당하는 기능이 정의되어있는 자바 클래스
	 * > Socket 객체가 생성되었다 == 스트림을 연결하기 위한 대문이 활짝 열렸다
	 * > Socket 프로그래밍을 위한 기반스트림인 Input / OutputStream 을 가지고 있음
	 * (우선 Socket 객체를 생성해서 대문을 열고, Socket 객체에서 제공하는 메소드를 통해 스트림 - 연결통로를 생성)
	 * 
	 * * ServerSocket 클래스
	 * > 서버쪽 프로그램에서만 추가로 필요로 하는 객체 타입 (클라이언트쪽에서는 필요 없음)
	 * > 클라이언트 쪽에서 연결 요청이 들어왔을 때 그 연결 "요청을 수락 (accept)" 해주는 용도
	 * > 24시간 대기타주는 역할을 ServerSocket 이 해줌!!
	 *   (24시간 대기타고 있다가 클라이언트가 연결 요청을 보내는 순간 수락해야하니까)
	 * > 연결 요청을 수락하게 되면 곧바로 Socket 객체를 얻어낼 수 있다!!
	 *   (연결 요청을 수락하면 대문이 활짝 열림)
	 * 
	 * * Server 측 프로그램 흐름
	 * 1. Server 측 프로그램에서 사용할 Port 번호 지정하기
	 * 2. ServerSocket 객체 생성 (Port 번호를 넘기면서) - 포트 결합 (Bind)
	 * --- 이 시점 부터는 24시간 대기 상태 ---
	 * 3. 연결 요청이 오면 요청 수락 (accept) 후 서버측 Socket 객체가 생성됨 (대문열고)
	 * 4. 클라이언트와 통신할 수 있는 입출력 스트림 객체 생성 (길 깔고)
	 * 5. 보조스트림을 추가하여 성능 개선
	 * 6. 스트림을 통해 데이터 입출력
	 * 7. 통신 종료 절차 (스트림 close, 소켓 close..)
	 */

	public static void main(String[] args) {
		
		System.out.println("~~~ 카카오톡 ~~~");
		
		Scanner sc = new Scanner(System.in);
		
		// 0. 지역변수 이슈를 해결하기 위해 자원 변수들을 선언 후 null 로 초기화
		ServerSocket server = null;
		Socket socket = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		
		// 1. 서버 프로그램에서 사용할 포트번호 먼저 지정 (정수값)
		int port = 3000;
		
		try {
		
			// 2. 포트번호를 넘기면서 ServerSocket 객체 생성 (포트 결합, Bind)
			server = new ServerSocket(port);
			
			// --- 지금부터 서버로써 24시간 대기 상태 중 ---
			System.out.println("클라이언트의 요청을 기다리고 있습니다...");
			
			// 3. 연결 요청이 들어오면 요청 수락 (accept) 후 곧바로 Socket 객체가 생성됨
			// > 연결 요청을 수락해주는 메소드 : accept() 메소드 (ServerSocket 객체에서 제공)
			socket = server.accept();
			
			// --- 지금부터 대문이 활짝 열린 것 ---
			System.out.println(socket.getInetAddress().getHostAddress() + "가 연결을 요청함...");
			// > 누구랑 연결되어있는지 출력해보기
			//   Socket 객체의 getInetAddress() 메소드를 통해서 나한테 연결 요청을 보낸 PC 정보를 얻어낼 수 있음
			//   그 중에서 getHostAddress() 메소드를 통해 그 컴퓨터의 IP 주소만 추출 가능
			
			// 4. 클라이언트와 통신할 수 있는 입출력 스트림 객체 생성
			// > Socket 객체에서 제공하는 메소드를 이용해서 얻어내기!!
			
			// 5. 보조스트림을 추가하여 성능 개선
			
			// - 입력용 스트림
			// (서버 입장에서) 클라이언트가 전달한 메세지 내용을 읽어들이기 위한 스트림
			
			// 기반스트림 : InputStream 객체 (socket.getInputStream() 메소드를 통해 얻어내기)
			// + InputStreamReader 객체
			// 보조스트림 : BufferedReader 객체
			// > 방향은 같으나, 통로의 사이즈가 다름!! (원칙상 결합 불가능)
			//   중간에서 사이즈를 호환시켜주는 보조스트림 객체를 하나 더 붙이면 가능해짐!!
			// > 즉, 기반스트림 하나에 보조스트림을 2개 붙여서 쓰겠다.
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// - 출력용 스트림
			// (서버 입장에서) 클라이언트에게 메세지를 전달 (내보내기) 위한 스트림
			
			// 기반스트림 : OutputStream 객체 (socket.getOutputStream() 메소드를 통해 얻어내기)
			// + OuputStreamWriter 객체 (존재하지만 안쓸것임)
			// 보조스트림 : PrintWriter 객체
			// > 통로의 방향은 같으나 통로의 사이즈가 다름!! (원칙상 결합 불가능)
			pw = new PrintWriter(socket.getOutputStream());
			// > OuputStreamWriter 객체 : 출력용 기반, 보조스트림 결합 시 중간에서 사이즈 호환해주는 객체
			//   실제로 존재하나, PrintWriter 의 경우 하도 많이 쓰이다 보니까 굳이 OutputStreamWriter 없이
			//   곧바로 1byte 짜리 기반스트림과 바로 결합해서 쓸 수 있도록 구현되어있음!!
			
			// --- 이 시점 부터는 통로가 완전히 연결됨 ---
		
			// 6. 스트림을 통해 데이터 읽고 쓰기
			// > 채팅 프로그램은 지속적으로 메세지가 주거니 받거니 되야함!!
			//   (무한 반복문 안에서 읽고 쓰는 구문을 작성하기)
			while(true) {
				
				// 6_1. 클라이언트로부터 전달된 메세지 읽어들이기
				// > BufferedReader 로 읽기
				String message = br.readLine();
				System.out.println("클라이언트 : " + message);
				
				// 6_2. 반대로 클라이언트에게 메세지 전달
				// > PrintWriter 로 내보내기
				System.out.print("클라이언트에게 보낼 내용 : ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				// > 한 줄 단위로 내보내는 메소드
				
				// 6_3. (혹시 모르니까) 현재 스트림에 남아있는 데이터를 강제로 내보내는 메소드 호출
				pw.flush();
				// > 오늘은 무한반복문 안에서 계속 데이터를 내보내야 하기 때문에 호출!!
				
			}

		} catch(IOException e) {
			
			e.printStackTrace();
		
		} finally {
			
			try {

				// 7. 통신 종료 절차 (자원 반납)
				// > 생성 순서의 역순
				pw.close();
				br.close();
				socket.close();
				server.close();
			
			} catch(IOException e) {
				
				e.printStackTrace();
			}
				
		}

		sc.close();
	}

}





