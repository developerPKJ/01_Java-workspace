package com.kh.chap03_char.model.dao;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
    public void fileSave() {
        //FileWriter : "파일"로 데이터를 2byte 단위로 출력하는 스트림
        FileWriter fw = null;

        try {
            // 1. 통로 열기 (== 스트림 객체 생성)
            fw = new FileWriter("b_char.txt" /* , false */);
            // XXXWriter의 경우 파일이 존재하지 않을 경우 자동으로 생성

            // 2. 볼일 보기
            // > 2byte 단위로 데이터 내보내기
            fw.write("test");
            fw.write('A');
            fw.write(' ');
            fw.write('\n'); // 개행문자 (Enter 키)

            char[] cArr = {'k', 'i', 'w', 'i'};
            fw.write(cArr);
            // > 오버로딩된 형태 활용 가능
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("종료");
    }

    public void fileRead() {
        // FileReader : "파일"로부터 데이터를 2byte 단위로 입력받는 스트림
        FileReader fr = null;

        try {
            // 1. 통로 열기 (== 스트림 객체 생성)
            fr = new FileReader("b_char.txt");

            // 2. 볼일 보기
            // > 2byte 단위로 데이터 입력받기
            int value = 0;
            while ((value = fr.read()) != -1) {
                System.out.print((char) value);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally{
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("종료");
    }
}

/**
 * Input/Ouput Stream 계열의 객체와 Reader/Writer 계열의 객체의 사용법이 거의 유사
 * > 각 계열별로 클래스들의 부모가 동일하기 때문
 * (동일한 코드를 상속받아 만든 구조)
 */
