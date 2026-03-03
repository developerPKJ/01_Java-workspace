package com.kh.chap02_String.controller;

public class A_StringPoolTest {

    /*
    String 클래스
	 * > 자바에서 문자열을 다루는 용도의 클래스 (자료형)
	 *   (클래스는 사용자 정의 참조자료형 - 애초에 문자열을 다루기 위한 자료형으로 만들어진 클래스)
	 * > 문자열 리터럴 (값) 을 곧바로 대입하거나, new 구문을 통해 객체 생성이 가능하다.
	 * > java.lang 패키지 안에 정의되어있음 (풀클래스명은 java.lang.String)
	 * 
	 * > String "불변클래스" (변하지 않는 클래스) 다.
	 *   값을 수정하는 순간 기존의 값이 담겨있던 공간에서 수정되지 않겠다!!
    */

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

    // 불변 클래스 성질을 보완하는 클래스
    public void method4() {
        /*
        기존의 String 객체
		> 내용이 수정될 때 마다 메모리 공간의 할당이 계속 일어나게 됨!! 메모리 공간의 소멸도 계속 일어남!!
		  성능 저하 이슈가 발생할 수 있음!!
        */

        // StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.hashCode());
        sb.append(" World");
        System.out.println(sb); // Hello World
        System.out.println(sb.hashCode());
        // StringBuilder 클래스는 가변 클래스이기 때문에 문자열이 변경될 때마다 새로운
        // 문자열 객체가 생성되지 않고 기존의 문자열 객체에서 수정이 일어남

        // StringBuffer
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println(sb2.hashCode());
        sb2.append(" World");
        System.out.println(sb2); // Hello World
        System.out.println(sb2.hashCode());
        // StringBuffer 클래스도 가변 클래스이기 때문에 문자열이 변경될 때마다 새로운
        // 문자열 객체가 생성되지 않고 기존의 문자열 객체에서 수정이 일어남


        // > StringBuilder 와 StringBuffer 의 차이점
		// StringBuilder : 속도가 조금 더 빠름, 한번에 한개씩만 append 처리 가능
		// StringBuffer : 속도가 상대적으로 조금 느림, 한번에 여러개의 append 처리 가능
		//				  (한번에 여러 일 가능 : 멀티쓰레드)
    }
}
