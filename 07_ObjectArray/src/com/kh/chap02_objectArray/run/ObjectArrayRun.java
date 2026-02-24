package com.kh.chap02_objectArray.run;

import java.util.Arrays;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {
    public static void main(String[] args) {
        /** 휴대폰 3대를 관리하는 프로그램 */
        /*
        Phone p1 = null;
        Phone p2 = null;
        Phone p3 = null;
        */
        
        Phone[] arr = new Phone[3];

        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
        // System.out.println(arr[0].information()); // NullPointerException
        System.out.println("\n");
        
        arr[0] = new Phone("갤럭시 S23", "S", "삼성", 1200000);
        arr[1] = new Phone("아이폰 14", "14", "애플", 1300000);
        arr[2] = new Phone("갤럭시 Z플립4", "Z플립4", "삼성", 1350000);
        
        System.out.println(arr);
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(Arrays.toString(arr));
        System.out.println("\n");

        for (Phone phone : arr) {
            System.out.println(phone.information());
        }
        System.out.println("\n");
        
        int sum = 0;
        for (Phone phone : arr) {
            sum += phone.getPrice();
        }
        System.out.println("총 합계: " + sum);
        System.out.println("\n");
        /*
        여기선 new Phone을 배열의 크기 만큼 다 만들어줘서 전부 채워져 있음
        하지만 일부만 new Phone을 만들어주고 나머지는 null로 남겨두면 NullPointerException이 발생할 수 있음

        해결방법 :
        1. if문으로 null인지 체크하기
        2. counter 변수를 만들어서 new Phone이 만들어진 개수만큼 반복문을 돌리기
        */
        for (Phone phone : arr) {
            if (phone != null) {
                System.out.println(phone.information());
            }
        }

        // 2번의 경우 순서대로 채워진 경우만 가능
        int count = 3;      // new Phone이 만들어진 개수(미리 만들때 카운트 해놓기)
        for (int i = 0; i < count; i++) {
            System.out.println(arr[i].information());
        }
        System.out.println("\n");
    
        System.out.println(sum / count);
    }
}
