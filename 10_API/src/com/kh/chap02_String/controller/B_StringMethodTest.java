package com.kh.chap02_String.controller;

import java.util.Scanner;

public class B_StringMethodTest {
    
    public void method1(){
        String str1 = "Hello";
        
        // 1. 문자열.charAt(int index) : char
		// > 문자열에서 전달받은 index 위치의 글자 하나만을 뽑아서 리턴
		char ch = str1.charAt(3);
		System.out.println("ch : " + ch); // l
		
		// 2. 문자열.equals(String str) : boolean
		// > 문자열과 전달받은 str 이 "내용물" 이 일치하는지 동등비교 후 결과 리턴
		//   (원래 Object 클래스에 주소값 동등비교용으로 만들어졌는데,
		//    내용물 동등비교 용도로 오버라이딩 된 꼴을 쓰고 있음)
		System.out.println("equals : " + str1.equals("Hello World")); // false
		
		// 3. 문자열.length() : int
		// > 문자열의 길이 리턴 (글자수 리턴)
		System.out.println("str1 의 길이 : " + str1.length()); // 10
		
		// 4. 문자열.concat(String str) : String
		// > 문자열과 전달된 또 다른 str 을 하나로 합쳐서 리턴
		String str2 = "!!!!!";
		System.out.println("concat : " + str1.concat(str2));
		// > str1 + str2 결과와 동일!!
		
		// 5_1. 문자열.substring(int beginIndex) : String
		// > 문자열의 beginIndex 위치에서 부터 끝까지 문자열을 추출해서 리턴
		System.out.println(str1.substring(6)); // "orld"
		
		// 5_2. 문자열.substring(int beginIndex, int endIndex) : String
		// > 문자열의 beginIndex 위치에서 부터 endIndex - 1 까지의 문자열을 추출해서 리턴
		//   (이 때, endInex 번째 문자는 포함 X)
		System.out.println(str1.substring(0, 6)); // "Hell W"
		// > 오버로딩된 메소드임!!
		
		// 주의할 점
		// System.out.println(str1.substring(14));
		// > StringIndexOutOfBoundsException 주의!!
		
		// 6. 문자열.replace(char old, char new) : String
		// > 문자열에서 old 문자를 new 문자로 변환한 문자열을 리턴
		String str3 = str1.replace('l', 'c');
		System.out.println("str3 : " + str3); // "Hell World" --> "Hecc Worcd"
		
		// 7. 문자열.trim() : String
		// > 문자열의 앞, 뒤 공백을 제거한 문자열을 리턴
		String str4 = "          JA         VA           ";
		System.out.println("trim : " + str4.trim()); // "JA         VA"
		
		// 참고) 
		// str4 에서 가운데 있는 공백도 제거하고 싶다면? 
		// 앞, 뒤, 가운데 공백 다 제거해보고 싶음!!
		System.out.println("모든 공백 제거 : " + str4.replace(" ", ""));
		// > replace 메소드의 오버로딩된 형태를 활용할 수 있음!!
		
		// 연습)
		// 민감정보 마스킹 : 살짝 가려주는 개념
		// > 주민번호 : 생년월일6자 + "-" + 성별1자 + 6자리(노출되면 X)
		// "851231-1******"
		String personId = "851231-1234567";
		System.out.println(personId.substring(0, 8).concat("******"));
		
		// 8. 문자열.contains(String str) : boolean
		// > 문자열로부터 str 이 포함되어있는지를 검사 후 결과 리턴
		System.out.println("contains : " + str4.contains("ja")); // false
		// > 문자열은 대소문자 구분을 하므로 포함되지 않는것임!!
		
		System.out.println(str4.contains("JA")); // true
		System.out.println(str4.equals("JA")); // false
		// > conatains 는 포함만 되도 true, equals 는 아예 일치해야지만 true
		
		// 9_1. 문자열.toUpperCase() : String
		// > 문자열을 모두 다 대문자 (Upper Case) 로 변경한 후 그 문자열을 리턴
		System.out.println("upper : " + str1.toUpperCase());
		
		// 9_2. 문자열.toLowerCase() : String
		// > 문자열을 모두 다 소문자 (Lower Case) 로 변경한 후 그 문자열을 리턴
		System.out.println("lower : " + str1.toLowerCase());
		
		// 예)
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종료하시겠습니까? (y/n) : ");
		
		// char answer = sc.nextLine().charAt(0); // 'y' / 'n' / 'Y' / 'N'
		
		// if(answer == 'Y' || answer == 'y')
		
		char answer = sc.nextLine().toUpperCase().charAt(0); // 'Y' / 'N'
		// > 메소드 체이닝 : 메소드를 연이어서 계속 호출하는 개념
		//   항상 반환타입 및 호출 순서 신경쓰기!!
		
		if(answer == 'Y') {
			
			System.out.println("프로그램을 종료합니다.");
			
		} else {
			
			System.out.println("프로그램을 종료하지 않습니다.");
		}
		*/

        /*
        char[] arr = new char[str1.length];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = str1.charAt(i);
        }
        */
        // 10. 문자열.toCharArray() : 문자열을 char[]로 변환
        char[] arr = str1.toCharArray();

        /*
        String result = "";
        for(int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        */
        // 11. static valueOf(기본자료형) : 기본 자료형을 문자열로 변환
        String result = String.valueOf(arr);
        System.out.println("result : " + result);
    }
    
    
    Scanner sc = new Scanner(System.in);
    /**
     * // 욕설 필터링 프로그램
    // 사용자로부터 채팅 메세지를 한 줄 입력받은 후
    // 그 메세지 내용 중 욕설이 있다면 필터링한 결과를 출력하세요
    */
    /*
    // * 필터링 해야하는 욕설 목록들 (String 배열로 담아둘것)
    // "신발끈", "개나리", "수박씨", "호루라기", "시베리아",
    // "십장생", "조카", "주옥", "쌍쌍바", "십자수"
    String[] filter = {"신발끈", "개나리", "수박씨", "호루라기", "시베리아",
    "십장생", "조카", "주옥", "쌍쌍바", "십자수"};
    
    // 실행예시)
    // 입력 : 이런 신발끈같은 개나리 호루라기야!!!
    // 결과 : 이런 ***같은 *** ****야!!!
    
    // + 난이도 up
    // 결과 : 이런 신**같은 개** 호***야!!!
     * 
    */
    public void method2(){
        String[] filter = {"신발끈", "개나리", "수박씨", "호루라기", "시베리아",
                            "십장생", "조카", "주옥", "쌍쌍바", "십자수"};
                            
        while(true) {
            System.out.print("채팅 메세지 입력(입력 안할시 종료) : ");
            String msg = sc.nextLine();

            if (msg.isEmpty()){
                System.out.println("프로그램 종료");
                break;
            }

            // msg에 filter 배열의 단어들이 포함되어 있는지 확인 및 포함되어 있다면 필터링
            for(int i = 0; i < filter.length; i++) {
                if(msg.contains(filter[i])){
                    String blur = "";
                    for(int j = 1; j < filter[i].length(); j++) {
                        blur += "*";
                    }
                    // 필터링 된 단어의 첫글자+blur로 교체
                    msg = msg.replace(filter[i], filter[i].charAt(0) + blur);
                }
            }
            System.out.println("필터링된 메세지 : " + msg);
        }
    }

}
