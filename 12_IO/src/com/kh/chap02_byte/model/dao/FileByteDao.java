package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 클래스를 어떤 용도에 따라 만드냐에 따라 구분
 * 1. VO : Value Object (값을 담는 객체) -> DTO(Data Transfer Object)
 * 2. DAO : Data Access Object (데이터 접근 객체) -> DB에 접근하는 객체
 * 3. Controller : 사용자의 요청을 받아서 처리해주는 객체 -> 구체적인 기능들을 수행하는 객체 
 * 4. Run : 프로그램을 실행시키는 객체 -> main 메소드가 있는 객체
 */
public class FileByteDao {
    /**
     * 입출력 과정
     * 1. 통로 열기 : 스트림 객체 생성
     * 2. 목표 수행
     * 3. 통로 닫기 : 스트림 객체 자원 반납
     */
    public void fileSave() {
        // 출력임 - FileOutputStream
        FileOutputStream fOut = null;
        try {
            // 1. 통로 열기
            fOut = new FileOutputStream("a_byte.txt", false); 
            // 해당 파일이 존재하지 않으면 자동으로 생성됨
            // 상대 경로기 때문에 현재 작업중인 프로젝트 폴더에 생성됨

            // 1byte 단위로 데이터를 전송하는 스트림이므로 int형으로 데이터를 전달해야 한다.
            // -128 ~ 127 사이의 숫자만 전달 가능하다.
            // 아스키 코드표에 의해 0 ~ 127 사이의 숫자에 해당하는 문자들이 존재한다.

            // 객체 생성 시 매개변수로 true 작성 시 : 파일이 존재할 경우 기존 파일에 이어쓰기(append) 
            //      / false 작성 시 : 파일이 존재할 경우 기존 파일 덮어쓰기(default)
            // default 값이 false이므로 생략 가능하다.


            // 2. 목표 수행
            fOut.write(97); // a
            fOut.write('b'); // 98
            fOut.write('김'); // 한글의 경우 아스키가 아닌 유니코드에 해당하여 2byte로 처리됨(깨져서 저장됨)

            byte[] arr = {99, 100, 101}; // c, d, e
            fOut.write(arr);
            fOut.write(arr, 1, 2); // d, e

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            /**
             * try-catch-finally 구문에서 finally 블록은 예외 발생 여부와 상관없이 항상 실행되는 블록입니다.
             * 따라서, 스트림 자원 반납과 같은 중요한 작업을 수행할 때 finally 블록을 사용하는 것이 좋습니다.
             * 예외가 발생하더라도 finally 블록이 실행되므로, 자원 누수(leak)를 방지할 수 있습니다.
            */
           // 3. 통로 닫기
           try {
            fOut.close();
           } catch (IOException e) {
            e.printStackTrace();
           } // 스트림 자원 반납
        }

        System.out.println("종료");
    }

    public void fileRead() {
        // 입력임 - FileInputStream
        // file로부터 데이터를 1바이트 단위로 입력받는 스트림
        FileInputStream fIn = null;
        try {
            // 1. 통로 열기
            fIn = new FileInputStream("a_byte.txt");
            // > FileInputStream 객체 생성 시 없는 파일명을 제시하면 FileNotFoundException 발생


            // 2. 목표 수행
            // read() : 1byte 단위로 데이터를 읽어오는 메소드
            // -1 : 더 이상 읽어올 데이터가 없을 때 반환되는 값
            int value = 0;
            while((value = fIn.read()) != -1) {
                System.out.println((char)value);
            }
            // .read()를 조건검사할 때에도 쓰기 때문에 한번만 호출하도록 주의 필요함
            // 아니면 read()가 한번 더 호출되어서 퐁당퐁당 출력되는 문제가 발생할 수 있음

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 3. 통로 닫기
            try {
                if (fIn != null) fIn.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
