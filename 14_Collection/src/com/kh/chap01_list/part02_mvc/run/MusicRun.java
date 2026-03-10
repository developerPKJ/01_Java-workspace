package com.kh.chap01_list.part02_mvc.run;

import com.kh.chap01_list.part02_mvc.view.MusicView;

public class MusicRun {
    /** ArrayList를 이용한 음악 관리 프로그램
     * 기능 :
     * - 새 곡 추가 : create()
     * - 전체 곡 조회 : read()
     * - 특정 곡 검색 : read()
     * - 특정 곡 수정 : update()
     * - 특정 곡 삭제 : delete()
     * 
     * ArrayList에 음악 정보 저장(add, get, set, remove)
     * 역할별로 클래스를 나누어 MVC 패턴으로 구현(Model, View, Controller, Run)
     * - Run : 프로그램 실행 용도
     * - Model : 음악 정보 담는 용도
     * - View : 콘솔창에 보여질 화면 용도(출력, 입력)
     * - Controller : method 위주의 코드 작성 용도
     * 
     * MVC 패턴 : Model-View-Controller 패턴
     * - Model : 데이터와 관련된 부분을 담당하는 계층
     * - View : 사용자 인터페이스와 관련된 부분을 담당하는 계층
     * - Controller : Model과 View 사이에서 중재자 역할을 하는 계층
     */
    public static void main(String[] args) {
        MusicView mv = new MusicView();
        try {
            mv.mainMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
