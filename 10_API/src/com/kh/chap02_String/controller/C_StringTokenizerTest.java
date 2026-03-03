package com.kh.chap02_String.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
    public void method1(){
        String str = "Java,Oracle,JDBC,HTML,CSS,JavaScript";

        String[] arr = str.split(",");
        for(String s : arr) {
            System.out.println(s);
        }
    }

    // Token : 단어 단위를 나타내는 용어
    // StringTokenizer 클래스 : 문자열을 특정 구분자로 분리하는 기능을 제공하는 클래스
    StringTokenizer st = new StringTokenizer("Java,Oracle,JDBC,HTML,CSS,JavaScript", ",");
    public void method2(){
        System.out.println("토큰의 개수 : " + st.countTokens());
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }

        for(int i = 0; i < st.countTokens(); i++) {
            System.out.println(st.nextToken());
        }
    }
}
