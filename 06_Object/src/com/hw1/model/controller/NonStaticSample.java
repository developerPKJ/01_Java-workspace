package com.hw1.model.controller;

import java.util.Arrays;

public class NonStaticSample {
    /**
    // 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력하는 메소드
    // 응용 --> 오름차순 정렬로 출력
     */
    public void printLottoNumbers() {
        int[] lottoNumbers = new int[6];
        for (int i = 0; i < lottoNumbers.length; i++) {
            lottoNumbers[i] = (int)(Math.random() * 45 + 1);
            for (int j = 0; j < i; j++) {
                if (lottoNumbers[i] == lottoNumbers[j]) {
                    i--;
                    break;
                }
            }
        }
        // 오름차순 정렬
        Arrays.sort(lottoNumbers);
    
        System.out.println(Arrays.toString(lottoNumbers));
    }

    /**
    // 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
     */
    public void outputChar(int num, char c) {
        for (int i = 0; i < num; i++) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    /**
    // 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
    // 주의! 소문자 대문자 모두 포함
     */
    public char alphabette() {
        char c = (char)(Math.random() * 52 + 'A');
        if (c > 'Z') {                                  // 대문자 범위를 넘어선 경우 소문자로 변환
            c = (char)(c + ('a' - 'Z' - 1));            // 대문자 소문자 사이 특수문자 개수만큼 더해줌
        }
        return c;
    }


    /**
    // 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
    // 해당 인덱스 범위의 문자열을 추출하여 리턴
    // 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
     */
    public String mySubstring(String str, int index1, int index2) {
        if (str == null || str.isEmpty()) {                             // 문자열이 null이거나 빈 문자열인 경우
            return null;
        }
        if (index1 < 0 || index2 >= str.length() || index1 > index2) {  // 인덱스 범위가 유효하지 않은 경우
            return null;
        }
        String result = "";
        for (int i = index1; i < index2; i++) {
            result += str.charAt(i);
        }
        return result;
    }


    /*
    실행 결과 화면 : 
    1. 랜덤 값 : 24 7 20 11 40 30
    2. a문자 5개 출력 : a a a a a
    3. 랜덤 영문자 출력 : a
    4. apple의 2번 4번 인덱스 사이의 값 출력 : pl
    */
}
