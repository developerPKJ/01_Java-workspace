package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun1 {
    public static void main(String[] args) {
        /** properties
         * > map 계열 : key + value 세트로 저장
         * - 저장 순서 유지 x
         * - key 중복 x, vlaue 중복 o
         * > properties 특징
         * - 관례상 key, value 모두 String 타입으로 고정해서 쓰는 편
         * - 표현법 상 제네릭 설정이 불가
         */
        Properties prop = new Properties();
        
        // 아무거나 담을 수 있음
        prop.put("name", "홍길동");
        prop.put("초코파이", new Snack("초코맛", 1500));

        System.out.println(prop);

        // 사용법은 hashMap과 동일
        System.out.println(prop.get("name"));

        System.out.println("==============================");

        // properties 만의 특징
        /* key, value 모두 String 타입으로 고정해 쓰는 경향
        그래서 둘다 String으로 데이터를 추가해주는 별도의 메소드도 존재
        String 타입의 key를 제시하면 String 타입의 value를 리턴하는 메소드도 존재
        즉, get - set을 대체하는 String 전용 메소드 존재 */
        Properties prop2 = new Properties();
        prop2.setProperty("name", "홍길동");
        prop2.setProperty("age", "20");
        prop2.setProperty("age", "24"); // key 중복 -> value 덮어쓰기
        System.out.println(prop2);
        System.out.println(prop2.getProperty("name"));

        // Properties 객체에 담긴 데이터를 파일 입출력 해주는 별도의 메소드 존재
        // 파일로 내보내기(출력)
        try {
            prop2.store(new FileOutputStream("test.properties"), "properties test");
            prop2.storeToXML(new FileOutputStream("test.xml"), "properties test");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
