package com.kh.chap03_char.run;

import com.kh.chap03_char.model.dao.FileCharDao;

public class CharRun {
    /**
     * 문자 기반 스트림
     * - 문자 스트림 : 2byte 단위로 입출력 할 수 있는 "넓은 통로"
     * - 기반 스트림 : 외부 매체와 "직접적" 으로 연결되는 "메인 통로"
     * 
     * - XXXReader : XXX라는 외부매체로부터 데이터를 "입력" 받는 통로
     * - XXXWriter : XXX라는 외부매체로 데이터를 "출력"하는 통로
     * 
     * File 이라는 외부매체로 입출력 할 것이기 때문에
     * FileReader / FileWriter 객체를 이용
     */
    public static void main(String[] args) {
        FileCharDao fc = new FileCharDao();
        fc.fileSave();
        fc.fileRead();
    }
}
