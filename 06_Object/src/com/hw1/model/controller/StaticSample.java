package com.hw1.model.controller;

public class StaticSample {
    // field
    private static String value;

    // constructor
    public StaticSample() {}

    // method
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        StaticSample.value = value;
    }

    /**
     * value 필드 값을 모두 대문자로 변경 --> char 배열 응용
     */
    public static void toUpper(){
        char[] arr = value.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] >= 'a' && arr[i] <= 'z') {
                arr[i] = (char)(arr[i] - ('a' - 'A'));
            }
        }
        value = String.valueOf(arr);
    }

    /**
     * 전달받은 인덱스 위치의 value 값을 전달받은 문자로 변경하는 static 메소드
     */
    public static void setChar(int index, char c) {
        value = value.substring(0, index) + c + value.substring(index + 1);
    }

    /**
     * value 필드 값에 기록되어 있는 문자 갯수 리턴
     */
    public static int valueLength() {
        return value.length();
    }

    /**
     * 문자열 값을 전달받아 value 필드 값과 하나로 합쳐서 리턴
     */
    public static String valueConcat(String str) {
        return value + str;
    }
}
