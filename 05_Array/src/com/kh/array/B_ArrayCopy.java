package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {

    /*
    배열 복사
    1. 얕은 복사 : 객체의 주소 값만 가져와 참조형 변수에 저장하고 하나의 객체를 두 변수가 참조
    - 변수 이름만 다를 뿐 heap영역에 있는 실제 배열의 주소를 동일하게 가리킴
    2. 깊은 복사 : 기존의 배열의 값을 새로운 배열에 복사하여 서로 다른 객체를 참조
    - heap영역에 서로 다른 배열의 주소를 가리키며, 복사 할 당시 elements만 동일함
    */

    //얕은복사
    public void method1() {
        int[] origin = {1,2,3,4,5};
        System.out.println("원본 배열 출력");
        for (int i : origin) {
            System.out.println(i);
        }
        System.out.println();

        int[] copy = origin;
        System.out.println("복사 배열 출력");
        for (int i : copy) {
            System.out.println(i);
        }
        System.out.println();


        origin[0] = 6;
        copy[1] = 7;
        System.out.println("원본/복사 배열 수정 후 복사 배열 출력");
        for (int i : copy) {
            System.out.println(i);
        }

        System.out.println("배열의 주소 비교");
        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());
    }

    //깊은복사
    public void method2() {
        int[] origin = {1,2,3,4,5};
        for (int i : origin) {
            System.out.println(i);
        }

        int[] copy = new int[origin.length];
        for (int i = 0; i < copy.length; i++) { //origin.length = copy.length
            copy[i] = origin[i];
        }
        System.out.println();

        copy[0] = 6;

        System.out.println("수정 후 원본 배열");
        for (int i : origin) {
            System.out.println(i);
        }
        System.out.println("수정 후 복사 배열");
        for (int i : copy) {
            System.out.println(i);
        }

        System.out.println("배열의 주소 비교");
        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());
    }

    //System.arraycopy 메소드(깊은 복사) - 변수명 규칙 안지켰으니 유의
    public void method3() {
        int[] origin = {1,2,3,4,5};
        int[] copy = new int[10];

        // System.arraycopy(원본주소, 시작인덱스(원본), 복사주소, 시작인덱스(복사본), 복사길이)
        System.arraycopy(origin, 0, copy, 0, 5);
        // System.arraycopy(origin, 0, copy, 1, 5);
        // System.arraycopy(origin, 2, copy, 1, 3);

        // System.arraycopy(origin, 2, copy, 9, 2);
        // 당연히 ArrayIndexOutOfBoundsException 에러 발생

        for (int i : copy) {
            System.out.println(i);
        }
    }

    //Arrays.copyOf 메소드(깊은 복사)
    public void method4() {
        int[] origin = {1,2,3,4,5};
        // Arrays.copyOf(원본주소, 길이)
        int[] copy = Arrays.copyOf(origin, origin.length);  //원본 그대로
        // int[] copy = Arrays.copyOf(origin, 3);  //원본인덱스 0~2까지 복사
        // int[] copy = Arrays.copyOf(origin, 10); //원본복사 + 추가 인덱스

        for (int i : copy) {
            System.out.println(i);
        }
        System.out.println(origin.hashCode());
        System.out.println(copy.hashCode());
    }

    //clone 메소드(깊은 복사)
    public void method5() {
        int[] origin = {1,2,3,4,5};
        int[] copy = origin.clone();    //다른 기능 없이 간단하게 복사
        /*
        왜 .clone() 같은 메소드는 내가 선언하지도 않았는데 사용가능한가
        --> 배열이나 객체들은 모두 Object 클래스에 속하는데(new로 생성한거)
        .clone()과 같은 메소드들은 모두 Object를 상속하는 클래스에 포함되어 있음
        --> 객체를 생성하는 순간 자동으로 하위 메소드들이 따라옴
        */

        for (int i : copy) {
            System.out.println(i);  
        }
    }

    //배열 출력 변형(Arrays.toStrign(arr))
    public void method6() {
        int[] origin = {1,2,3,4,5};
        int[] copy = origin.clone();

        System.out.print("{");
        for (int i = 0; i < copy.length; i++) {
            if (i < copy.length - 1) {
                System.out.print(copy[i] + ", ");
            }else {
                System.out.print(copy[i] + "}");
            }
        }
        System.out.println();

        System.out.println(Arrays.toString(copy));
    }
}
