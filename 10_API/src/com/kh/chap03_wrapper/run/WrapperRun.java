package com.kh.chap03_wrapper.run;

public class WrapperRun {
    @SuppressWarnings("removal")
    public static void main(String[] args) {
        /* Wrapper 클래스
        - 기본 자료형을 객체(참조 자료형)로 다룰 수 있도록 포장해주는 클래스 = 박싱
        - 기본 자료형과 1:1로 매칭되는 클래스들이 존재(기본 자료형의 첫 글자를 대문자로 바꾼 이름)

        필요한 이유 : 기본 자료형에 객체의 메소드를 사용해야할 때가 있어서
        */
        int num1 = 10;
        int num2 = 20;

        System.out.println(num1 == num2); // false (값 비교)
        // System.out.println(num1.equals(num2)); // 오류 (참조 자료형이 아님)

        // Wrapper 클래스의 객체 생성 방법
        Integer num3 = new Integer(num1);
        Integer num4 = new Integer(num2);
        
        System.out.println(num3 == num4); // false (참조 자료형이므로 주소값 비교)
        System.out.println(num3.equals(num4)); // false (값 비교)
        
        // 원래 equals는 toString으로 인해 주소값 비교가 맞지만
        // 대부분 제공하는 클래스 들에서 오버라이딩하여 값 비교로 바꿔놓음
        
        System.out.println(num3.hashCode());
        System.out.println(num4.hashCode());
        
        // 대소 비교
        System.out.println(num3 < num4); // true (값 비교)
        // Wrapper 클래스는 Comparable 인터페이스를 구현하여 compareTo() 메서드를 오버라이딩함
        // compareTo() 메서드는 두 객체의 값을 비교하여 음수, 0, 양수를 반환함
        // 따라서 Wrapper 클래스의 객체들끼리 비교 연산자를 사용할 수 있음
        System.out.println(num3.compareTo(num4)); // -1 (음수 : num3 < num4)
        
        // 객체를 생성하지 않고 바로 대입(생성자 사용 X)
        Integer num5 = num1;    // 오토박싱 : 기본 자료형이 Wrapper 클래스의 객체로 자동 변환
        int num6 = num5;        // 오토언박싱 : Wrapper 클래스의 객체가 기본 자료형으로 자동 변환
        
        // 주의사항
        // > 오토박싱이 안되는 경우
        // Integer num7 = "123"; // 오류 (문자열을 Integer 객체로 변환할 수 없음)
        Integer num7 = new Integer("123"); // 이건 가능

        // Wrapper 클래스의 객체를 기본 자료형으로 변환하는 방법 : 언박싱
        int num8 = num7.intValue(); // Integer 객체를 int로 변환
        int num9 = num7; // 오토언박싱 : Integer 객체가 int로 자동 변환
    

        System.out.println("================================");
        String str1 = "123";
        String str2 = "123.45";

        System.out.println(str1 + str2); // 123123.45 (문자열 연결)

        int i = Integer.parseInt(str1); // 문자열을 int로 변환
        double d = Double.parseDouble(str2); // 문자열을 double로 변환
        System.out.println(i + d); // 246.45 (숫자 덧셈)

        // 기본자료형 --> String
        String s1 = String.valueOf(i); // int를 문자열로 변환
        String s2 = String.valueOf(d); // double을 문자열로 변환

        String result = 10 + ""; // 10 (문자열 연결)

        // 경고 삭제용
        System.out.println(num6);
        System.out.println(num8);
        System.out.println(num9);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(result);
    }
}
