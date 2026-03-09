package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

/** 컬랙션(Collection)
 * > 자료구조가 내장되어 있는 클래스(프레임워크)
 * 자료구조 : 방대한 데이터들을 효율적으로 관리하기 위한 구조
 * 프레임워크 : 효율적인 기능들이 이미 구현되어 있는 틀(뼈대)
 * 
 * 배열의 단점을 보완하기 위해 등장
 * 
 * 배열의 단점
 * - 크기 변경이 불가능하다. (한 번 크기를 지정하면 변경 불가능)
 * - 다양한 자료형을 저장할 수 없다. (같은 자료형만 저장 가능)
 * - 중간에 데이터를 추가하거나 삭제할 때 번거롭다. (데이터를 이동시켜야 함)
 * 컬렉션의 장점
 * - 크기를 지정할 필요도 없고, 알아서 늘어나거나 줄어든다. (동적 크기 조절)
 * - 다양한 자료형을 저장할 수 있다. (Object 타입으로 모든 자료형 저장 가능)
 * > 단, 제네릭을 이용하여 특정 자료형만 저장하도록 제한할 수 있음
 * - 중간에 데이터를 추가하거나 삭제할 때 편리하다. (내부적으로 데이터 이동 처리)
 * 
 * 배열 vs 컬렉션
 * 배열 : 데이터를 담아두고 조회만 하는 경우
 * 컬렉션 : 데이터의 추가, 삭제, 수정이 빈번한 경우
 * 
 * 컬렉션 분류(List, Set, Map)
 * List 계열
 * > 담고자 하는 값만 저장, 값 저장 시 순서 유지(index 개념 있음), 중복값 허용
 * - ArrayList, Vector, LinkedList
 * 
 * Set 계열
 * > 담고자 하는 값만 저장, 값 저장 시 순서 유지 X(index 개념 없음), 중복값 허용 X
 * - HashSet, TreeSet
 * 
 * Map 계열
 * > 키와 값이 한 쌍으로 저장, 키 저장 시 순서 유지 X(index 개념 없음), 키 중복값 허용 X 값 중복값 허용 O
 * - HashMap, Properties, HashTable
 */

public class ListRun {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();   // 초기 용량 : 10
        ArrayList<Object> list = new ArrayList<>(3);  // 초기 용량 : 3

        System.out.println(list);    // []
        System.out.println(list.size());   // 0
        
        System.out.println("----------------------------------");
        
        // E : Object 타입, Element 약자(제네릭)

        // 1. add(E e) : 리스트의 마지막에 e 추가
        list.add(new Music("BANG BANG", "IVE"));
        list.add(new Music("LOVE DIVE", "IVE"));
        list.add(new Music("Good Goodbye", "화사"));
        list.add("end");
        System.out.println(list);
        /** 순서가 유지되면서 값이 추가됨(index)
         * 크기에 제약이 없음, 자동으로 늘어남
         * 다양한 타입의 값 저장 가능(Object 타입이기 때문)
         */

        // 2. add(int index, E e) : 리스트의 index 번째 칸에 e 추가(오버로딩)
        list.add(0, new Music("TOMBOY", "IVE"));
        System.out.println(list);
        // 중간에 값 추가시 알아서 값들을 밀어서 공간 확보함

        // 3. set(int index, E e) : 리스트의 index 번째 칸의 데이터를 e로 변경
        list.set(3, new Music("ELEVEN", "IVE"));
        System.out.println(list);

        // 4. remove(int index) : 리스트의 index 번째 칸의 데이터를 삭제
        list.remove(1);
        System.out.println(list);
        // 중간에 값 삭제시 알아서 값들을 당겨서 빈 공간 없애줌

        // 5. size() : 리스트에 담긴 데이터의 수 리턴
        System.out.println(list.size());    // 4
        System.out.println(list.size() - 1);    // 마지막 인덱스 번호

        // 6. get(int index) : 리스트의 index 번째 칸의 데이터를 리턴
        System.out.println(list.get(0));    // Music [title=TOMBOY, artist=IVE]
        Music m = (Music)list.get(0);   // Object 타입이기 때문에 다운캐스팅(강제형변환) 가능
        System.out.println(m);
        System.out.println(m.getTitle());    // TOMBOY
        System.out.println(m.getArtist());   // IVE
        System.out.println(((Music)list.get(0)).getTitle());    // 다운캐스팅 후 메소드 호출 가능
        
        System.out.println("----------------------------------");
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        
        System.out.println("----------------------------------");
        
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("----------------------------------");

        // 7. subList(int fromIndex, int toIndex) : 리스트의 fromIndex 번째 칸부터 
        // toIndex - 1 번째 칸까지의 데이터를 새로운 리스트로 리턴
        List<Object> sub = list.subList(0, 2);
        System.out.println(sub);

        System.out.println("----------------------------------");

        // 8. addAll(Collection c)
        // > 해당 리스트에 다른 컬랙션에 있는 데이터들을 통째로 추가해주는 메소드
        list.addAll(sub);
        System.out.println(list);

        System.out.println("----------------------------------");

        // 9. isEmpty() : 리스트가 비어있는지 여부 리턴
        System.out.println(list.isEmpty());   // false
        list.clear();   // 리스트의 모든 데이터 삭제
        System.out.println(list.isEmpty());   // true
        System.out.println(list.size());
    }
}
