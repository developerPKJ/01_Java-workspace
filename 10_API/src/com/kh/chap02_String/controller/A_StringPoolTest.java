package com.kh.chap02_String.controller;

public class A_StringPoolTest {

    // 생성자를 통해 문자열 생성
    public void method1() {
        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1 == str2); // false (String Pool에서 다른 주소값을 참조)

        System.out.println(str1);
        System.out.println(str2);   // 이렇게 객체의 변수명만 입력하는 경우 객체의 주소가 나오지만
        // String 클래스는 toString() 메서드를 오버라이딩하여 문자열 자체가 출력됨
        
        System.out.println(str1.equals(str2)); // true
        // String 클래스는 equals() 메서드를 오버라이딩하여 문자열 자체를 비교하도록 되어 있음

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        // String 클래스는 hashCode() 메서드를 오버라이딩하여 문자열 자체의 해시코드를 반환하도록 되어 있음

        // 실제 주소값이 필요한경우
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }

    // 리터럴을 통해 문자열 생성
    public void method2() {
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println(str1 == str2); // true (String Pool에서 같은 주소값을 참조)
        /*
        문자열 객체 생성시 리터럴을 이용해 생성시
        메모리의 Heap 영역에 String Pool이라는 별도의 공간이 존재하여, 해당 공간에 문자열이 저장됨
        동일한 문자열이 존재할 경우 기존의 문자열 객체를 재사용함
        (String Pool은 동일한 내용의 문자열이 존재 불가)
        */

        System.out.println(str1);
        System.out.println(str2);   // 이렇게 객체의 변수명만 입력하는 경우 객체의 주소가 나오지만
        // String 클래스는 toString() 메서드를 오버라이딩하여 문자열 자체가 출력됨
        
        System.out.println(str1.equals(str2)); // true
        // String 클래스는 equals() 메서드를 오버라이딩하여 문자열 자체를 비교하도록 되어 있음

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        // String 클래스는 hashCode() 메서드를 오버라이딩하여 문자열 자체의 해시코드를 반환하도록 되어 있음

        // 실제 주소값이 필요한경우
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }

    // 불변클래스 특징
    public void method3() {
        String str = "Hello";
        System.out.println(System.identityHashCode(str));

        str = "goodbye";
        System.out.println(System.identityHashCode(str));

        str += "!!!";
        System.out.println(System.identityHashCode(str));
        // String 클래스는 불변클래스이기 때문에 문자열이 변경될 경우 새로운 문자열 객체가 생성됨

        /*
        불변이라고 수정이 아예 안되는 것은 아님(안되는건 상수)
        값이 담겨있는 기존의 자리에서 수정만 안됨
        매번 새로운 주소값을 참조하여 값을 변경 가능
        기존의 상수들의 연결이 끊긴 문자열들은 가비지 컬렉터에 의해 메모리에서 자동으로 제거됨
        */
    }

    public void method4() {

    }
}
