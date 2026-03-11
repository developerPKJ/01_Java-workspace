package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        System.out.println(prop);
        System.out.println("==============================");

        // 3. 파일로 부터 데이터를 key = value 형태로 읽어와 Properties 객체에 저장하는 방법
        // 1) load(InputStream is)
        try {
            // prop.load(new FileInputStream("test.properties"));
            prop.loadFromXML(new FileInputStream("test.xml"));
            System.out.println(prop);
            System.out.println("==============================");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 4. Properties 객체에 담긴 데이터들에 대해 키값을 제시해 value값을 리턴하는 메소드
        System.out.println(prop.getProperty("name"));
    }


    /*
    Properties 파일
    > 어떤 프로그램이 기본적으로 가져야 하는 기본 정보들을 보통 .properties 형식의 파일로 저장해둠
        - 프로그램 관련 환경설정 위주의 데이터 포함
    > Properties 객체 자체가 key, value 모두 String 타입으로 고정해서 쓰는 편이기 때문에 properties 객체와 붙여서 사용 가능
        - key, value 모두 일반 텍스트 문자열을 사용하기 때문에 개발자가 아닌 일반 관리자가 입장에서 환경설정 값 다루기 쉬움

    xml 파일
    > 방대한 데이터를 구조화 된(<태그>) 형태로 저장할 수 있음
        - 사람이 읽기에도 용이하며, 다양한 프로그래밍 언어에서 지원
    > Properties 객체와 함께 입출력 할 때 많이 쓰고 프로그램의 환경설정 위주의 데이터 담는 용도로 많이 사용

    차이점
    > .properties 파일은 한줄짜리 벨류 값만 표현 가능(다음 줄로 넘어가면 새로운 key = value 쌍으로 인식)
        - .xml 파일은 태그로 묶여있는 범위만큼 벨류 값으로 인식하기 때문에 여러 줄로 표현 가능
    */

}
