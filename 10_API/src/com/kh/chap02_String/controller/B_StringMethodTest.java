package com.kh.chap02_String.controller;

import java.util.Scanner;

public class B_StringMethodTest {
    
    public void method1(){
        String str1 = "Hello";
        
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
