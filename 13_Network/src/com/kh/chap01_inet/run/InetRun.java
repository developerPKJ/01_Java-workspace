package com.kh.chap01_inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {
	
	/*
	 * * 네트워크 (Network = Net + work)
	 * > 여러 대의 컴퓨터들이 서로 연결되어있는 통신망을 일컫는 용어
	 * > 네트워크를 통해 서로간의 데이터를 주고 받을 수 있다!! (데이터 입출력 시 스트림 사용은 필수)
	 * 
	 * * IP 주소 와 Port 번호
	 * - IP 주소 : 네트워크 상의 각 컴퓨터들을 "식별" 해줄 수 있는 번호 (주소)
	 * 			  즉, 컴퓨터 별로 중복되면 안된다!! (컴퓨터의 주민번호 같은 개념)
	 * - Port 번호 : 컴퓨터 안에서 작동하는 여러 개의 프로그램 중 하나를 찾을 때, 
	 * 				각각의 프로그램들을 "식별" 하는 번호 
	 * 				(한 컴퓨터 내에 동시에 여러개의 프로그램을 구동할 수 있음!! - 그 프로그램들을 구분하는 개념)
	 * 				즉, 한 컴퓨터 내에 포트번호는 중복될 수 없음!!
	 * 
	 * > IP 주소, Port 번호는 고정값이 아닌 변동이 가능한 유동적인 값이다.
	 *   단, 값을 바꿀 때 IP 주소 같은 경우는 같은 네트워크 범위 안에서 중복되면 안됨!!
	 * 				   Port 번호 같은 경우는 같은 컴퓨터 범위 안에서 중복되면 안됨!!
	 * > IP 주소와 Port 번호가 중복되는 상황을 "Conflict(충돌)" 이 발생한다 라고 표현함!!
	 *   (네트워크 이용 불가!!)
	 * 
	 * * 서버와 클라이언트
	 * - 서버 : 클라이언트 (고객) 에게 서비스를 제공해주는 PC 또는 프로그램
	 * 		   서버는 그냥 혼자서 서비스를 제공해주지 않음!! (클라이언트가 서버로 요청이라는걸 보낼 때에만 서비스 제공)
	 * 		   즉, 클라이언트의 요청을 받아서 처리하고 응답해주는 웨이터 입장
	 * 
	 * - 클라이언트 : 서비스를 제공받는 PC 또는 프로그램 (고객 입장)
	 * 				즉, 서버에 요청하는 PC 또는 프로그램 (요청 후 서비스를 제공받을 수 있음)
	 * 
	 * 					  1. 요청 (Request)
	 * 					----------------->
	 * 		클라이언트							서버 (24시간 대기중)
	 * 										2. 요청받은 내용을 처리
	 * 					<----------------
	 * 					 3. 응답 (Response)
	 * 
	 * > 클라이언트 측에서 서버로 요청을 보내기 위해서는
	 *   그 요청하고자 하는 서버의 IP 주소, Port 번호를 알아내야함!!
	 */

	public static void main(String[] args) {

		/*
		 * * InetAddress 클래스
		 * > 자바에서 제공하는 IP 주소를 다루기 위해 사용되는 클래스
		 * > java.net 패키지에 정의되어 있음 (풀클래스명은 java.net.InetAddress)
		 */
		
		try {
		
			InetAddress localhost = InetAddress.getLocalHost();
			// > InetAddress 객체 생성 시 생성자 구문을 쓰지 않는다!! (static 메소드인 getLocalHost() 메소드 이용)
			
			// > localhost : 지역호스트, 내 PC 를 지칭하는 단어
			// > getLocalHost() : 내 PC 에 대한 정보를 InetAddress 객체로 생성해서 반환
			
			System.out.println(localhost /* .toString() */);
			// > DESKTOP-BUBHPG9/192.168.20.2
			//   내PC명 + "/" + 내IP주소
			
			// 내PC명 만 따로 보고 싶다면? 내IP주소 만 따로 보고 싶다면?
			
			// 1) split 메소드로 "/" 를 구분자 삼아 문자열 끊어주기
			// String[] arr = localhost.toString().split("/");
			
			// 2) StringTokenizer 객체를 이용해서 끊어주기
			// StringTokenizer stn = new StringTokenizer(localhost.toString(), "/");
			
			// > toString() 결과를 가지고 내가 직접 알아낼 수도 있지만, 내PC명, 내IP주소를 바로 얻어낼 수도 있다!!
			System.out.println("내 PC명 : " + localhost.getHostName());
			System.out.println("내 IP주소 : " + localhost.getHostAddress());
			
			System.out.println("------------------------");
			
			// 내가 알고있는 도메인 주소라는 것을 통해서 그 서버와 관련된 정보를 얻기
			
			// > 도메인 주소 : 사용자가 웹 사이트에 접속할 때
			//				원칙 상 IP 주소와 Port 번호를 대고 요청 후 해당 페이지에 접속해야 하지만,
			//				매번 그 IP 주소를 외우거나 찾아 쓰기 귀찮기 때문에
			//				외우기 쉬운 구조로 사용자에게 제공해주는 주소 (IP 주소에 별명을 붙인 개념 - "별칭")
			
			// > 브라우저 주소창에 도메인 주소를 입력하고 엔터 키를 쳤을 때
			//   도메인 주소 입력 --> DNS --> 해당 IP 주소를 찾아서 요청을 대신 보내줌
			
			// * DNS (Domain Name Server) : 도메인 주소 + IP 주소 들이 1:1 로 맵핑되어있는 서버
			// 예) 142.250.198.196 <--> www.google.com
			//     223.130.192.247 <--> www.naver.com
			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			// > getByName("도메인주소") : 도메인 주소라는 고유한 주소를 통해서 해당 서버의 정보를 얻어내서 객체로 반환
			
			System.out.println(googleHost /* .toString() */);
			// > www.google.com/142.250.199.196
			
			System.out.println("구글 서버명 : " + googleHost.getHostName());
			System.out.println("구글 IP주소 : " + googleHost.getHostAddress());
			
			// > 구글의 서버 PC 는 사실 여러대임!! 분산구조로 이루어져있다.
			//   요청이 한곳에 몰빵될 경우 해당 서버에 과부하가 걸리기 때문!!
			//   예) 수강신청, 티켓팅 등 => DDos 공격의 원리임!!

			System.out.println("------------------------");
			
			// > 도메인 주소를 통해서 그 서버"들" 에 대한 정보들도 한번에 얻어낼 수 있다!!
			//   (그 서버들의 정보들이 "배열" 로 돌아옴)
			InetAddress[] naverHostList = InetAddress.getAllByName("www.naver.com");
			
			System.out.println("네이버 서버 댓수 : " + naverHostList.length); // 4대로 이루어져 있음!!
			
			/*
			for(int i = 0; i < naverHostList.length; i++) {
				
				// System.out.println(naverHostList[i]);
				System.out.println(naverHostList[i].getHostAddress());
			}
			*/
			
			// 향상된 for문 (foreach문)
			// for(변수선언문 : 배열명)
			for(InetAddress naverHost : naverHostList) {
			
				// System.out.println(naverHost);
				System.out.println(naverHost.getHostAddress());
			}
			
		} catch(UnknownHostException e) {
			
			e.printStackTrace();
		}

	}

}

/*
 * * 현재 구동중인 서버가 있다면, 클라이언트는 항상 그 서버로 "요청" 을 보낼 수 있음!!
 * > "응답" 결과가 항상 돌아옴!!
 * 
 * * "요청" 과 "응답" 에 의해서 프로그램은 항상 돌아감 ("통신" 한다 라고 표현함)
 * > 웹에서의 통신 방식 : HTTP 프로토콜 통신 (HTTPS : 기존 HTTP 에 보안 절차가 추가된 버전)
 * 
 * * 자바만을 가지고 서버와 클라이언트 간의 간단한 통신 해보기
 * > 이 때, 결국은 외부 매체가 다른 컴퓨터가 되는 것이기 때문에 데이터를 입출력하고자 한다면 
 *   서버와 클라이언트 사이에 스트림 (연결 통로) 을 만들 수 밖에 없음!!
 *   
 * * 외부 매체가 다른 컴퓨터가 될 경우 스트림만으로는 입출력을 할 수 없음!!
 * > 스트림을 열기 전 (통로를 열기 전) 에 통로를 연결하기 위한 문 (소켓) 을 함께 셋팅해줘야함!!
 * 
 * * 소켓 (Socket)
 * > 스트림을 연결하기 위한 문
 * > 프로세스 (== 프로그램이 실행중인 상태) 간의 통신을 담당하는 대문 역할
 * 
 * * 소켓 프로그래밍 (TCP / UDP 방식이 있음)
 * 1. TCP 방식 : 데이터 전송 속도는 느리나, 데이터를 정확하고 안정적으로 전달 가능함
 * 				주로 신뢰성이 요구되는 프로그램에서 자주 사용 (웹, 이메일, 파일전송 등)
 * 2. UDP 방식 : 데이터 전송 속도는 빠르나, 신뢰성이 없는 데이터가 전송될 수 있음
 * 				주로 데이터를 단순히 빠른 속도로 전달하고자 하는 프로그램에서 자주 사용 (실시간 스트리밍 등) 
 */



