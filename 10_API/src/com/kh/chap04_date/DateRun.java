package com.kh.chap04_date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // 현재 날짜/시간
        Date date = new Date();
        System.out.println(date);

        // 특정 날짜/시간
        Date date1 = new Date(2024, 6, 10);
        System.out.println(date1);
        // 3924년으로 나오는데 Date 클래스의 생성자에서 년도는 입력값 +1900
        // 7월로 나오는데 Date 클래스의 생성자에서 월은 입력값 +1
        // > 년도 -1900, 월 -1 해서 입력 필요
        Date date2 = new Date(2024-1900, 6-1, 10);
        System.out.println(date2);

        Date date3 = new Date(2024-1900, 6-1, 10, 15, 30, 45);
        System.out.println(date3);

        // setter 메소드를 이용해서 날짜/시간 수정
        Date date4 = new Date();
        date4.setYear(2024-1900);
        date4.setMonth(6-1);
        date4.setDate(10);
        date4.setHours(15);
        date4.setMinutes(30);
        date4.setSeconds(45);
        System.out.println(date4);


        // SimpleDateFormat 클래스 이용해서 날짜/시간 포맷 변경
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss (E)");
        /*
        년도 : yyyy
        월 : MM
        일 : dd
        시간(24시간) : HH
        시간(12시간) : hh
        분 : mm
        초 : ss
        요일 : E
        */

        // SimpleDateFormat 클래스의 format() 메소드를 이용해서 날짜/시간 포맷 변경
        String strDate = sdf.format(date);
        System.out.println(strDate);
    }
}
