package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListGenericRun {
    /** 제네릭(Generic, <E>)
     * <여기> 안에 컬랙션에 담을 타입을 선언
     * 
     * 별도의 제네릭 제시 없이 컬랙션 객체를 생성하면 E = Object 타입으로 인식
     * 다형성 적용되어 모든 자료형 저장 가능하지만, 제네릭을 이용하여 특정 자료형만 저장하도록 제한할 수 있음
     * 
     * 설정하는 이유
     * 1. 명시한 타입의 데이터만 저장가능하도록 타입의 제한을 두기 위해(like 배열)
     * 2. 컬렉션에 저장된 객체를 매번 꺼내서 사용할 때, 매번 다형성에 의해 형변환 하는 절차를
     *   생략하기 위해서(코드 간결화)
     * 
     * 제네릭 설정 시 주의사항
     * - 참조 자료형 타입만 기술 가능(기본 자료형은 불가능, 대신 Wrapper 클래스 이용)
     */

    public static void main(String[] args) {
        // ArrayList list = new ArrayList(3);   // 제네릭 설정 X -> E = Object 타입으로 인식
        
        // ArrayList<Music> list = new ArrayList<Music>(3);   // 제네릭 설정 O -> E = Music 타입으로 인식

        ArrayList<Music> list = new ArrayList<>();   // 제네릭 설정 O -> E = Music 타입으로 인식
        // JDK 7 버전 뒤부터 뒤쪽 <>안에 타입 생략 가능

        System.out.println(list);

        // E == Music

        // 1. add(E e)
        list.add(new Music("Dynamite", "BTS"));
        list.add(new Music("Butter", "BTS"));
        list.add(new Music("To.X", "Taeyeon"));
        System.out.println(list);

        // 2. add(int index, E e)
        list.add(1, new Music("Lovesick Girls", "BLACKPINK"));
        System.out.println(list);

        // 3. set(int index, E e)
        list.set(2, new Music("Next Level", "aespa"));
        System.out.println(list);

        // 4. remove(int index)
        list.remove(0);
        System.out.println(list);

        // 5. size()
        System.out.println("리스트의 크기 : " + list.size());
        System.out.println("리스트의 마지막 인덱스 : " + (list.size() - 1));

        // 6. get(int index)
        System.out.println("인덱스 0 : " + list.get(0));
        /* generic 설정 전
        Music m = (Music)list.get(0);   // E = Object -> Object 타입으로 인식
        System.out.println(m.getTitle()); --> 자식 클래스의 메소드를 사용하려면 다운캐스팅 필요
        */
        System.out.println(list.get(0).getTitle()); // 바로 메소드 사용 가능

        System.out.println("---------------------------");

        for(int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("---------------------------");

        for(Music m : list) {
            System.out.println(m);
            System.out.println(m.getArtist());
        }

        System.out.println("---------------------------");

        // 7. subList(int fromIndex, int toIndex) : List<Music>
        List<Music> sub = list.subList(0, 2);   // 0 <= index < 2
        System.out.println(sub);

        System.out.println("---------------------------");

        // 8. addAll(Collection<? extends E> c)
        list.addAll(sub);
        System.out.println(list);

        System.out.println("---------------------------");

        // 9. isEmpty()
        System.out.println("리스트가 비어있는가? " + list.isEmpty());

        // 10. clear()
        list.clear();
        System.out.println("리스트가 비어있는가? " + list.isEmpty());
        System.out.println("리스트의 크기 : " + list.size());

    }
}
