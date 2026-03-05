package com.kh.chap02_byte;

import com.kh.chap02_byte.model.dao.FileByteDao;

public class ByteRun {
    /**
     * 바이트 기반 스트림
     * 바이트 스트림 : 1byte 단위로 데이터를 전송하는 스트림(좁은 통로)
     * - XXXInputStream : 입력용 바이트 스트림의 최상위 클래스
     * - XXXOutputStream : 출력용 바이트 스트림의 최상위 클래스
     * 기본 스트림 : 외부 매체와 직접적으로 연결되는 스트림(파일, 키보드, 모니터 등)
     * 보조 스트림 : 기본 스트림에 연결되어 기능을 향상시키는 스트림(속도 향상, 자료형 단위 입출력 등)
     */
    public static void main(String[] args) {
        FileByteDao fDao = new FileByteDao();
        fDao.fileSave();
        fDao.fileRead();
    }
}
