package com.kh.chap02_set.part02_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part02_hashSet.model.vo.Student;

public class SetRun {
    public static void main(String[] args) {
        HashSet<Object> hs = new HashSet<>();
        hs.add("반갑습니다.");
        hs.add("반갑습니다.");
        hs.add(123);
        hs.add(123);
        System.out.println(hs);

        /*
        HashSet은 중복 저장 되지 않음
        index가 존재하지 않음
        */

        HashSet<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("홍길동", 20, 80));
        studentSet.add(new Student("홍길동", 20, 80));
        studentSet.add(new Student("이민호", 22, 90));
        System.out.println(studentSet);

        /*
        이 경우 중복 저장된 것이 보임 = HashSet이 동일한 객체라는 것을 파악하지 못함

        HashSet 동작 원리
        > HashSet은 값이 추가될 때 마다 equals(), hashCode() 메소드를 이용해서 중복 여부를 판단함
        즉 주소값만 2번 비교 확인해 동등비교를 진행함
        --> 참조자료형 처럼 생성할 때마다 주소값이 달라지는 경우에는 중복 저장이 가능함
        
        String의 경우는 equals(), hashCode() 메소드가 오버라이딩 되어 있어서 중복 저장이 되지 않음
        > 문자열이 같으면 동일한 객체로 인식하여 중복 저장이 되지 않음
        --> equals()든 hashCode()든 오버라이딩 진행해 중복 판별 가능하다록 만들면 됨
        */

        System.out.println("===============================");
        
        // Set에 담겨있는 데이터에 순차적으로 접근해 보고 싶음(반복문 적용 원함)
        // Set 특징 : index가 없어 for문 사용 불가, 대신 향상된 for문(for each문) 사용 가능
        for (Student s : studentSet) {
            System.out.println(s);
        }

        System.out.println("===============================");
        
        // Set에 있던 데이터를 ArrayList에 넣고 싶음 
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.addAll(studentSet);
        for (Student s : studentList) {
            System.out.println(s);
        }
        // Set에 있던 데이터를 ArrayList에 넣고 싶음 (생성자 이용)
        ArrayList<Student> studentList2 = new ArrayList<>(studentSet);
        for (Student s : studentList2) {
            System.out.println(s);
        }
        // 결국 List와 Set은 같은 컬랙션 계열 (호환 가능)

        System.out.println("===============================");

        // Iterator(반복자)를 이용해서 Set에 담긴 데이터에 접근하기
        Iterator<Student> it = studentSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //Iterator의 동작 원리
        // String 의 StringTokenizer와 유사함
        
        // 더이상 뽑을 데이터가 없는데 it.next() 호출하면 NoSuchElementException 발생

        /* .iterator() 메소드
        >List또는 Set에 담겨있는 데이터들을 Iterator 객체로 옮겨 담아주는 메소드
        collection 계열에서는 사용 가능
        > Map 계열에서는 사용 불가 (Map은 key와 value로 이루어져 있기 때문에 Iterator로 옮겨 담을 수 없음)

        - 로또번호 뽑는 것 마냥 중복 제거가 꼭 필요한 경우 유용하긴 함
         */
    }
}
